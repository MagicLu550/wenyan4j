package cn.wenyan.compiler.command;

public class CompilerConfig {

    private boolean strongType;

    private boolean lexerViewer;

    private String wygDownload;

    private String wenyuangeFile;

    private boolean groovy = true;

    private String classFile;

    private String mainClass;

    private boolean supportPinYin;//

    private String[] compileFiles;//

    private String[] compileLib;//

    private String outFile;//

    private boolean run;//

    private String sourcePath;

    private String[] runArgs = new String[0];

    public boolean isStrongType() {
        return strongType;
    }

    public void setStrongType(boolean strongType) {
        this.strongType = strongType;
    }

    public boolean isSupportPinYin() {
        return supportPinYin;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public void setSupportPinYin(boolean supportPinYin) {
        this.supportPinYin = supportPinYin;
    }

    public String[] getCompileFiles() {
        return compileFiles;
    }

    public void setCompileFiles(String... compileFiles) {
        this.compileFiles = compileFiles;
    }

    public String[] getCompileLib() {
        return compileLib;
    }

    public void setCompileLib(String... compileLib) {
        this.compileLib = compileLib;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public String[] getRunArgs() {
        return runArgs;
    }

    public void setRunArgs(String... runArgs) {
        this.runArgs = runArgs;
    }

    public String getOutFile() {
        return outFile;
    }

    public void setOutFile(String outFile) {
        this.outFile = outFile;
    }

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public boolean isGroovy() {
        return groovy;
    }

    public void setGroovy(boolean groovy) {
        this.groovy = groovy;
    }

    public void setClassFile(String classFile) {
        this.classFile = classFile;
    }

    public String getClassFile() {
        return classFile;
    }

    public void setWenyuangeFile(String wenyuangeFile) {
        this.wenyuangeFile = wenyuangeFile;
    }

    public String getWenyuangeFile() {
        return wenyuangeFile;
    }

    public void setWygDownload(String wygDownload) {
        this.wygDownload = wygDownload;
    }

    public String getWygDownload() {
        return wygDownload;
    }

    public boolean isLexerViewer() {
        return lexerViewer;
    }

    public void setLexerViewer(boolean lexerViewer) {
        this.lexerViewer = lexerViewer;
    }
}
