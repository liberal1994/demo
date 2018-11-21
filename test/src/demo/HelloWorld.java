package demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
public class HelloWorld {
    public static void main(String[] args){ //main+(Ctrl+J)补全代码
        System.out.println("Hello,World!");
        new HelloWorld().test();
    }
    public void test(){
        List<String> list=new ArrayList<String>();//alt+enter 导入包
        list.add("hello");
        System.out.println(list);

    }

}
