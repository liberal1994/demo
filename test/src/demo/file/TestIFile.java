package demo.file;

import java.io.File;

public class TestIFile {
    public static void main(String[] args) throws Exception{
        String path="d:/tmp";
        File file=new File(path,"a.txt");
        if(!file.exists()){
            file.mkdirs();
        }

    }
}
