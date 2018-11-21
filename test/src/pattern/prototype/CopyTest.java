package pattern.prototype;

import java.util.Date;

public class CopyTest {
    private static Class<CopyTest> clazz=CopyTest.class;

    public static void main(String[] args) {
        String result1,result2,result3="";
        result1=testEqualDirectly();
        result2=testShallowClone();
        result3=testDeepClone();
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static String testShallowClone() {
        Date date = new Date(System.currentTimeMillis());
        String name = "huanhuan";
        Panda panda1 = new PandaForShallowCopyTest(name, date);
        Panda panda2 = null;
        try {
            panda2 = (Panda) ((PandaForShallowCopyTest) panda1).clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        name = new String("gungun");
        date.setTime(System.currentTimeMillis() - 1000 * 60 * 60 * 10);//当修改date属性时，panda1和panda2的date同时改变，因为panda1和panda2指向同一个引用
        panda1.setName(name);//修改panda1的name时，不会影响panda2的name值
        return outputPanda("testShallowClone", panda1, panda2);
    }

    public static String testDeepClone() {
        Date date = new Date(System.currentTimeMillis());
        String name = "huanhuan";
        Panda panda1 = new PandaForDeepCopyTest(name, date);
        Panda panda2 = null;
        try {
            panda2 = (Panda) ((PandaForDeepCopyTest) panda1).clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        date.setTime(System.currentTimeMillis() - 1000 * 60 * 60 * 10);
        name = new String("gungun");
        panda1.setName(name);
        return outputPanda("testDeepClone",panda1, panda2);
    }

    public static String testEqualDirectly() {
        Date date = new Date(System.currentTimeMillis());
        String name = "huanhuan";
        Panda panda1 = new PandaForShallowCopyTest("huanhuan", date);
        Panda panda2 = panda1;//直接复制引用时，name和date会同时改变
        name = new String("gungun");
        date.setTime(System.currentTimeMillis() - 1000 * 60 * 60 + 10);
        panda1.setName(name);//
        return outputPanda("testEqualDirectly",panda1, panda2);
    }

    private static String getMethodName(String name){
        String methodName="";
        try{
            methodName=clazz.getDeclaredMethod(name,null).getName();
        }catch(Exception e){
            return null;
        }
        return methodName;
    }
    private static String outputPanda(String name,Panda panda1, Panda panda2) {
        return name+":\npanda1: " + panda1.toString() + "\npanda2: " + panda2.toString();
    }

}
