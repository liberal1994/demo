package utils;

public class StringUtil {
    public static boolean isEmpty(String str){

        if(str==null||str.length()==0){
            return true;
        }
        char charArr[]=str.toCharArray();
        for(int i=0;i<charArr.length;i++){

            if(!Character.isWhitespace(charArr[i])){
                return false;
            }

        }
        return true;

    }



}
