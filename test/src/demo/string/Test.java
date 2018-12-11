package demo.string;

public class Test {

    public static void main(String[] args) {
        System.out.println(formatString("hello"));
    }
    public static String formatString(String str){
        return String.format("parameter [%s] is formatted",str);

    }
}
