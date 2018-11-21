package demo.file;

import java.io.*;
import java.net.URL;
import java.util.Arrays;


public class TestURL {

    public static void main(String[] args) {
        URL url = TestURL.class.getResource("/demo/poem.txt");
        URL url2 = TestURL.class.getClassLoader().getResource("demo/poem.txt");

        File file = new File(url.getFile());
        StringBuilder sb = new StringBuilder();
        try {
            InputStream is = new FileInputStream(file);
            byte bytes[] = new byte[128];
            int len = 0;
            while (-1 != (len = is.read(bytes))) {
                sb.append(new String(bytes, 0, len));
            }
            String msg=sb.toString();
            for(int i=0;i<msg.length();i++){
                System.out.println(msg.substring(i,i+1)+"\t"+msg.substring(i,i+1).getBytes().length);
            }
            char[] chars=msg.toCharArray();
            for(int i=0;i<chars.length;i++){
                System.out.println(chars[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
