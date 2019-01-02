package demo.file;

import java.io.*;

public class TestParentFile {

    public static void main(String[] args) {
        File file = new File("E:/breastCancer/" + String.valueOf(System.currentTimeMillis()) + ".txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream is = null;
        try {
            is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(is);
    }


}
