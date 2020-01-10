package cn.wenyan.compiler.script.libs


class LanguageUtils {

    static String defineVar(Language language,String name,String value){
        return language.getSyntax(Syntax.VAR_DEFINE)
                .replace(Language.NAME,name)
                .replace(Language.VALUE, value)
    }

    static String addArray(Language language,String name,String value){
        return language.getSyntax(Syntax.ARRAY_ADD)
                .replace(Language.NAME,name)
                .replace(Language.VALUE, value)
    }
    static String addComment(Language language,String comment){
        return language.getSyntax(Syntax.COMMENT)
                .replace(Language.COMMENT,comment)
    }
    static String forNumber(Language language,String index,String range){
        return language.getSyntax(Syntax.FOR_NUMBER)
                .replace(Language.INDEX,index)
                .replace(Language.RANGE,range)
    }
    static String defineIf(Language language,String bool){
        return language.getSyntax(Syntax.IF)
                .replace(Language.BOOL,bool)
    }
    static String ifBreak(Language language,String bool){
        return language.getSyntax(Syntax.IF_BREAK)
                .replace(Language.BOOL,bool)
    }

    static String forEach(Language language,String element,String array){
        return language.getSyntax(Syntax.FOR_EACH)
                .replace(Language.ELEMENT,element)
                .replace(Language.ARRAY,array)
    }
    static String slice(Language language,String name){
        return language.getSyntax(Syntax.SLICE)
                .replace(Language.NAME,name)
    }
    static String size(Language language,String name){
        return language.getSyntax(Syntax.SIZE)
                .replace(Language.NAME,name)
    }
    static String defineFunction(Language language,String name,String args){
        return language.getSyntax(Syntax.DEFINE_FUNCTION)
                .replace(Language.NAME,name)
                .replace(Language.ARGS,args)

    }

    static String defineInnerFunction(Language language,String name,String args){
        return language.getSyntax(Syntax.INNER_FUNCTION)
                .replace(Language.NAME,name)
                .replace(Language.ARGS,args)
    }

    static String defineInnerFunction(Language language,String name){
        return language.getSyntax(Syntax.INNER_FUNCTION_NO_ARGS)
                .replace(Language.NAME,name)

    }

    static String returnSomething(Language language,String value){
        return language.getSyntax(Syntax.RETURN)
                .replace(Language.VALUE,value)
    }
    static String runFunction(Language language,String value,String name,String args){
        return language.getSyntax(Syntax.RUN_FUNCTION)
                .replace(Language.NAME,name)
                .replace(Language.ARGS,args)
                .replace(Language.VALUE,value)
    }
    static String importStatic(Language language,String lib,String method){
        return language.getSyntax(Syntax.IMPORT_STATIC)
                .replace(Language.LIB,lib)
                .replace(Language.METHOD,method)
    }

    static String importClass(Language language,String lib){
        return language.getSyntax(Syntax.IMPORT)
                .replace(Language.LIB,lib)

    }

    static String numberSugar(Language language,String name){
        return language.getSyntax(Syntax.NUMBER_SUGAR)
                .replace(Language.NAME,name)
    }
    static String println(Language language,String value){
        return language.getSyntax(Syntax.PRINT)
                .replace(Language.VALUE,value)
    }
    static String change(Language language,String name,String value){
        return language.getSyntax(Syntax.CHANGE)
                .replace(Language.NAME,name)
                .replace(Language.VALUE,value)
    }
    static String getArray(Language language,String name,String index){
        return language.getSyntax(Syntax.ARRAY_GET)
                .replace(Language.NAME,name)
                .replace(Language.INDEX,index)
    }
}