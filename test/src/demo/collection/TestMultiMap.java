package demo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMultiMap {
    private class Student{
        private String name;
        private int age;

        @Override
        public String toString() {
            return name+":"+age;
        }
    }
    private static final String CLASS_NAME_1="一年级";
    private static final String CLASS_NAME_2="二年级";
    Map<String,List<Student>> map=new HashMap<>();
    public void test(){
        for(int i=0;i<5;i++){
            Student stu=new Student();
            stu.name="长江"+i+"号";
            stu.age=10-i;
            addStu(CLASS_NAME_1,stu);

        }
        for(int i=0;i<5;i++){
            Student stu=new Student();
            stu.name="黄河"+i+"号";
            stu.age=4+i;
            addStu(CLASS_NAME_2,stu);
        }
        for(String classno:map.keySet()){
            System.out.println(map.get(classno));
        }

    }
    public void addStu(String classno,Student stu){
        List<Student> list=map.get(classno);
        if(null==list){
            list=new ArrayList<>();
            map.put(classno,list);
        }
        list.add(stu);
    }

    public static void main(String[] args) {
        new TestMultiMap().test();
    }


}
