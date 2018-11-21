package demo.classloader;

import java.io.*;

public class MyClassloader {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException {
        Class<MyClassloader> clazz = MyClassloader.class;

        String path = clazz.getClassLoader().getResource("demo/classloader/poem").getPath();
        InputStream is = new FileInputStream(path);
//        InputStream is = clazz.getClass().getClassLoader().getResourceAsStream("demo/poem.txt");
//        System.out.println(Thread.currentThread().getId());
        String context = getContextFromPoem(is);
        System.out.println(context);

    }

    public static String getContextFromPoem(InputStream is) throws IOException {
        FileInputStream fis = (FileInputStream) is;
        Reader reader = new InputStreamReader(fis, "utf-8");
        StringBuilder context = new StringBuilder();
        char chars[] = new char[3];
        int len = 0;
        while (-1 != (len = reader.read(chars))) {
            context.append(new String(chars, 0, len));
        }
        if (null != fis) {
            try {
                fis.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return context.toString();
    }
}
