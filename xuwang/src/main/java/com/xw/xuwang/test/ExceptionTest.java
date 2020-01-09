package com.xw.xuwang.test;

/**
 * @author huixia.hu
 * Date:     2020/1/9 10:34
 * @version 1.0
 */
public class ExceptionTest {

    //finally:一般用于释放资源
    //异常捕获到的时候，执行finally,继续执行
    //异常未捕获到的时候，执行finally,中断

    //继承关系：Throwable (Exception、Error) RuntimeException IllegalArgumentException NumberFormatException
    // 因为用户处理不了Error,所以用户处理异常用Exception。是否更细的处理异常，根据实际情况而定。

    //Throws:不建议在主方法上使用，会直接抛给JVM,中断程序。
    //Throws、Throw一起使用
    public static void main1(String[] args) throws Exception {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("一定输出");
        }
    }

    //RuntimeException是Exception的子类。用户可以选择不处理，发生异常交由JVM处理，常见的有：空指针、数组下标越界、算术异常。但是Exception必须处理。
    //parseInt(String s) throws NumberFormatException 继承了RuntimeException
    public static void main2(String[] args) {
        int i = Integer.parseInt("a");
        System.out.println(i);
    }

    //assert默认是关闭的，可在Run->Edit Configurations中加入-ea打开。不适用于业务处理，适用于复杂的调试过程。
    //AssertionError extends Error,不继承Exception,catch无法捕获。
    public static void main(String[] args) {
        int num = 10;
        assert num == 20 : "num不为20";
        System.out.println("num:" + num);
    }

    //自定义异常，可extends Exception(必须被捕获)，可extends RuntimeException(可选择捕获)

}
