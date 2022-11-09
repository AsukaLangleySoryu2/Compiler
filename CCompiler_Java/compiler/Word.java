package compiler;

import java.util.ArrayList;


/**
 * @author Asuka
 * 构造单词的集合与基本判断
 */
public class Word {
    // 定义一些常量
    public final static String KEY = "关键字";
    public final static String OPERATOR = "运算符";
    public final static String INT_CONST = "整形常量";
    public final static String CHAR_CONST = "字符常量";
    public final static String BOOL_CONST = "布尔常量";
    public final static String IDENTIFIER = "标志符";
    public final static String BOUNDARYSIGN = "界符";
    public final static String END = "结束符";
    public final static String UNIDEF = "未知类型";
    public static ArrayList<String> key = new ArrayList<String>();// 关键字集合
    public static ArrayList<String> boundarySign = new ArrayList<String>();// 界符集合
    public static ArrayList<String> operator = new ArrayList<String>();// 运算符集合
    //定义属性值
    int id;//单词序号
    String value;
    String type;
    int line;//单词所在行
    boolean flag=true;

    public Word(){

    }
    
    /**
     * 构造函数
     * 
     * @param id       单词序号
     * @param value    单词的值
     * @param type     单词类型
     * @param line     单词所在行
     */
    public Word(int id, String value, String type, int line) {
        this.id = id;
        this.value = value;
        this.type = type;
        this.line = line;
    }
    
    public static boolean isKey(String word) {
        return key.contains(word);
    }
    
    public static boolean isOperator(String word) {
        return operator.contains(word);
    }

    public static boolean isBoundarySign(String word) {
        return boundarySign.contains(word);
    }

    public static boolean isArOP(String word) {// 判断单词是否为算术运算符
        if ((word.equals("+") || word.equals("-") || word.equals("*") || word
                .equals("/")))
            return true;
        else
            return false;
    }

    public static boolean isBoolOP(String word) {// 判断单词是否为布尔运算符
        if ((word.equals(">") || word.equals("<") || word.equals("==")
                || word.equals("!=") || word.equals("!") || word.equals("&&") || word
                        .equals("||")))
            return true;
        else
            return false;
    }
    
    static {
        Word.operator.add("+");
        Word.operator.add("-");
        Word.operator.add("++");
        Word.operator.add("--");
        Word.operator.add("*");
        Word.operator.add("/");
        Word.operator.add(">");
        Word.operator.add("<");
        Word.operator.add(">=");
        Word.operator.add("<=");
        Word.operator.add("==");
        Word.operator.add("!=");
        Word.operator.add("=");
        Word.operator.add("&&");
        Word.operator.add("||");
        Word.operator.add("!");
        Word.operator.add(".");
        Word.operator.add("?");
        Word.operator.add("|");
        Word.operator.add("&");
        Word.boundarySign.add("(");
        Word.boundarySign.add(")");
        Word.boundarySign.add("{");
        Word.boundarySign.add("}");
        Word.boundarySign.add(";");
        Word.boundarySign.add(",");
        Word.key.add("void");
        Word.key.add("main");
        Word.key.add("int");
        Word.key.add("char");
        Word.key.add("if");
        Word.key.add("else");
        Word.key.add("while");
        Word.key.add("for");
        Word.key.add("printf");
        Word.key.add("scanf");
    }
}
