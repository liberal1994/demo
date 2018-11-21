package demo.collection.enumeration;

import java.util.StringTokenizer;

/**
 * StringTokenizer是Enumeration接口的子类
 * 用于分割字符串，不支持正则表达式，而String的split方法支持正则表达式
 */
public class TestStringTokenizer {
    public static void main(String[] args) {
        String str="11@223@sads@fsdw";
        StringTokenizer stk=new StringTokenizer(str,"@");
        while (stk.hasMoreElements()){
            System.out.println(stk.nextElement());
        }
    }
}
