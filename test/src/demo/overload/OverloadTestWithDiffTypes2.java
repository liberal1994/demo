package demo.overload;

public class OverloadTestWithDiffTypes2 {
    public static void test(Son son) {
        System.out.println("Son");
    }

    public static void test(Father father) {
        System.out.println("Father");
    }
    public static void test(IFather iFather){
        System.out.println("IFather");
    }
    public static void test(GrandFather grandFather){
        System.out.println("GrandFather");
    }

    public static void main(String[] args) {
        //Father是静态类型，Son是实际类型
        //最终的静态类型是编译期可知的，而实际类型要到运行期才可知
        //虚拟机在方法重载时是通过参数的静态类型而不是实际类型作为判定依据的，
        //在编译期，javac会根据参数的静态类型选择重载的版本，所以会选择静态类型（Father）的版本
//        Father father = new Son();
//        test(father);//output:father

        //当传入Son类型的方法被注释掉时，编译期出现引用不明确的错误
        //解决办法之一是Father类也实现IFather接口，这样Father的优先级就比IFather接口高了
        //但是IFather和GrandFather没有优先级的关系，不回因为Son到IFather是一层关系，而到GrandFather是两层关系优先级就较高想
        test(new Son());
    }

}

class Son extends Father implements IFather {

}

class Father extends GrandFather {

}
class GrandFather{

}
interface IFather{

}
