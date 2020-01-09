package com.xw.xuwang.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

/**
 * @author huixia.hu
 * Date:     2020/1/7 13:49
 * @version 1.0
 */
public class IOTest implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //File

        //字节流(除中文处理外，优先使用字节流)：OutputStream、InputStream
        //字符流(需flush()、close())：Writer、Reader

        //转换流：OutputStreamWriter、InputStreamReader

        //内存流
        //字节流：ByteArrayInputStream、ByteArrayOutputStream
        //字符流：CharArrayInputStream、CharArrayOutputStream
//        String str = "my name is huhuixia";
//        InputStream inputStream = new ByteArrayInputStream(str.getBytes());
//        OutputStream outputStream = new ByteArrayOutputStream();
//        int temp = 0;
//        while ((temp = inputStream.read()) != -1) {
//            outputStream.write(Character.toUpperCase(temp));
//        }
//        System.out.println(outputStream);
//        inputStream.close();
//        outputStream.close();

        //合并文件
        File file1 = new File("E:\\3 xuwang\\test.txt");
        File file2 = new File("E:\\3 xuwang\\test1.txt");
        InputStream inputStream1 = new FileInputStream(file1);
        InputStream inputStream2 = new FileInputStream(file2);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int temp =0 ;
        while ((temp = inputStream1.read()) != -1) {
            outputStream.write(temp);
        }
        while ((temp = inputStream2.read()) != -1) {
            outputStream.write(temp);
        }
        byte[] bytes = outputStream.toByteArray();
        outputStream.close();
        inputStream1.close();
        inputStream2.close();
        System.out.println(new String(bytes));



        //文件复制
//        File file1 = new File("E:\\3 xuwang\\test.txt");
//        File file2 = new File("E:\\3 xuwang\\test1.txt");
//        InputStream inputStream = new FileInputStream(file1);
//        OutputStream outputStream = new FileOutputStream(file2);
//        byte[] a = new byte[1024];
//        int temp = 0;
//        while ((temp = inputStream.read(a)) != -1) {
//            //outputStream.write(a); 正常文字后面会出现很多NULL
//            outputStream.write(a,0,temp);
//        }
//        inputStream.close();
//        outputStream.close();



//        //打印流
//        PrintStream printStream = new PrintStream(System.out);
//        printStream.printf("name: %s,age: %d", "huhuixia", 23);
//
//        //System.out
//        OutputStream outputStream = System.out;
//        System.out.println("");
//        outputStream.write("System.out".getBytes());
//
//        //System.in
//        InputStream inputStream = System.in;
//        byte[] a = new byte[1024];
//        System.out.println("");
//        System.out.println("请输入System.in:");
//        int read = inputStream.read(a);
//        System.out.println("System.in:"+new String(a,0,read));

//        //StringBuffer：不支持中文
//        InputStream inputStream1 = System.in;
//        StringBuffer stringBuffer = new StringBuffer();
//        int temp = 0;
//        while ((temp = inputStream1.read()) != -1) {
//            if (temp == '\n') {
//                break;
//            }
//            stringBuffer.append((char) temp);
//        }
//        System.out.println(stringBuffer);


//        //BufferedReader
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("BufferedReader:" + bufferedReader.readLine());
//
//        //Scanner
//        Scanner scanner = new Scanner(System.in);
//        if (scanner.hasNext()) {
//            System.out.println("Scanner:" + scanner.next());
//        }
//
//        //1.序列化
//        File file = new File("E:\\3 xuwang\\test.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//        objectOutputStream.writeObject("this is 撒乱");
//        objectOutputStream.close();
//
//        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(System.out);
//        objectOutputStream1.writeObject("this is 撒乱");
//        objectOutputStream1.close();
//
//        //2.反序列化
//        System.out.println("");
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//        Object o = objectInputStream.readObject();
//        String str = o.toString();
//        System.out.println("反序列化:" + str);
//        objectInputStream.close();
//
//        ObjectInputStream objectInputStream1 = new ObjectInputStream(System.in);
//        Object o1 = objectInputStream1.readObject();
//        String str1 = o1.toString();
//        System.out.println("str:" + str1);
    }
}
