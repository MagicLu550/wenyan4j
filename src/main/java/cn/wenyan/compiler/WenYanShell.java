package cn.wenyan.compiler;

import cn.wenyan.compiler.log.ServerLogger;
import cn.wenyan.compiler.script.libs.Language;
import cn.wenyan.compiler.script.libs.Syntax;
import org.codehaus.groovy.tools.shell.Groovysh;
import scala.tools.nsc.interpreter.jline.JlineReader;


public class WenYanShell implements RunCode {

    private Groovysh shell;

    private WenYanCompilerImpl compiler;


    public WenYanShell(){
        this.compiler = new WenYanCompilerImpl(false,Language.GROOVY,this);
        this.shell = new Groovysh();
    }

    public WenYanShell(WenYanCompilerImpl compiler){
        this.compiler = compiler;
        this.shell = new Groovysh();
    }

    public void run(String wenyan){
        shell.execute(wenyan);
    }

    public Object run(boolean out,String... wenyanString){
        compiler.getServerLogger().info("---------------运行之--------------------");

        return shell.execute(compiler.getGroovyCode(true,out, wenyanString));

    }

    // 1. groovyShell
    // 2. 导入(import)和包管理
    // 导入文言脚本文件或者类
    // 通过判断，若不存在类，则通过引入文件形式导入
    // 3. 编译为字节码文件
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        int index = 0;
        int line = 0;
        JlineReader reader = new JlineReader(true,true);
        WenYanShell shell = new WenYanShell();
        ServerLogger logger = shell.compiler.getServerLogger();
        logger.info("WenYan Lang - Shell: @CopyRight wy-lang.org v 1.0");
        String[] imports = shell.compiler.getLanguageType().getSyntax(Syntax.IMPORT_WITH).split("\n");
        for(String s : imports)
            shell.run(s);
        String prefix = ">";
        StringBuilder builder = new StringBuilder();
        while (true){
            String code = reader.readLine(prefix);
            String returned = shell.compiler.compile(code,false);
            index += getClose(returned);
            if(index == 0) {
                builder.append(returned);
                try {
                    shell.run(builder.toString());
                }catch (Exception e){
                    shell.compiler.getServerLogger().error(e.getMessage());
                }

                builder = new StringBuilder();
                prefix = ">";
                line = 0;
            }else{
                builder.append(returned);
                prefix = "... "+line;
            }
            line++;
        }
    }


    public static int getClose(String returned){
        char[] chars = returned.toCharArray();
        int index = 0;
        for(char x :chars){
            if(x == '{')index++;
            if(x == '}')index--;
        }
        return index;
    }

}