package demo.overload;

import java.io.Serializable;

public class OverloadTestWithDiffTypes1 {
    public static void test(Character character) {
        System.out.println("Character");
    }

    public static void test(char c) {
        System.out.println("char");
    }

    public static void test(char... arr) {
        System.out.println("char[]");
    }

    public static void test(String str) {
        System.out.println("String");
    }

    public static void test(int i) {
        System.out.println("int");
    }
    public static void test(Integer integer){
        System.out.println("Integer");
    }

    public static void test(long l) {
        System.out.println("long");
    }

    public static void test(double d) {
        System.out.println("double");
    }
    public static void test(Serializable serializable){
        System.out.println("Serializable");
    }
    public static void test(Object obj){
        System.out.println("Object");
    }
    public static void test(Object... objs){
        System.out.println("Object[]");
    }

    public static void main(String[] args) {
        //传入基本类型选择重载版本的优先级：char->int->long->double->Character(包装类)->Serializable->Object->char.../Object...（两个都匹配，jvm不能识别优先级）
        //当前基本类型，然后逐级向上转型（依然是基本类型），然后选择当前类型的包装类，然后逐级选择继承的类或实现的接口，最后是可变长参数
//        test('a');


        //传入包装类选择重载版本的优先级：Character->Serializable->Object->char->int->long->double->char.../Object...
        //当前包装类->逐级选择该包装类继承的类和实现的接口，拆箱类型->拆箱类型的向上转型，可变长参数
        test(new Character('a'));
        //test(char...) 和 test(java.lang.Object...) 都匹配
        //String 类型转换异常
    }
}
