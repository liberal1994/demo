package test;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class IntegerTest {
    public static void main(String[] args) {
        try {
            System.out.println(getByteFromBytes(new byte[]{1}));
            System.out.println(Integer.toHexString(1));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static String getByteFromBytes(byte[] bytes){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<bytes.length;i++){
            byte b=bytes[i];
//            boolean negative=false;
//            if(b<0) negative=true;
//            int inte= Math.abs(b);
//            if(negative){
//                inte=inte|0X80;
//            }
            String temp=Integer.toHexString(b&0XFF);
            if(temp.length()==1){
                sb.append("0");
            }
            sb.append(temp);
        }
        return sb.toString();
    }
}
