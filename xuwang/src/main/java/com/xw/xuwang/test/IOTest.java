package com.xw.xuwang.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 * @author huixia.hu
 * Date:     2020/1/7 13:49
 * @version 1.0
 */
public class IOTest implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.打印流
        PrintStream printStream = new PrintStream(System.out);
        printStream.printf("name: %s,age: %d", "huhuixia", 23);

        //BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("BufferedReader:" + bufferedReader.readLine());

        //Scanner
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            System.out.println("Scanner:" + scanner.next());
        }

        //1.序列化
        File file = new File("E:\\3 xuwang\\test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject("this is 撒乱");
        objectOutputStream.close();

        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(System.out);
        objectOutputStream1.writeObject("this is 撒乱");
        objectOutputStream1.close();

        //2.反序列化
        System.out.println("");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Object o = objectInputStream.readObject();
        String str = o.toString();
        System.out.println("反序列化:" + str);
        objectInputStream.close();

        ObjectInputStream objectInputStream1 = new ObjectInputStream(System.in);
        Object o1 = objectInputStream1.readObject();
        String str1 = o1.toString();
        System.out.println("str:" + str1);
    }
}
