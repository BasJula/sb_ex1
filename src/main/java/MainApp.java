import java.util.*;

public class MainApp {
    //сумма типа byte
    public static byte byteSum(byte b, short s) {
        return (byte) (b+s);
    }
    //произведение типа int
    public static int intMult(int i, long l) {
        return (int) (i*l);
    }
    //максимум из двух чисел типа int
    public static int getMaxNumber (int a, int b) {
        if (a>b) {
            return a;
        }
        else {
            return b;
        }
      }
     //проверка буквы "А"
    public static boolean isCharA(char c) {
        if (c == 'A') {
            return true;
        }
        else {
            return  false;
        }
    }
    //проверка на принадлежность к числу
    public boolean isCharNumber(char c) {
        return Character.isDigit(c);
    }
    //вывод бинарного представления 0-30
    public static void binaryShow() {
        for (int j = 0; j<=30; j++) {
            System.out.println(j + "-->" + Integer.toBinaryString(j));
        }
        return;
    }
    //вывод бинарного представления Integer.MAX_VALUE, MAX_VALUE+1
    public static void binaryIntMaxVal() {
        long intMaxValPlusOne = Integer.MAX_VALUE + 1;
        System.out.println("Integer.MAX_VALUE =" + Integer.MAX_VALUE + "-->" + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Integer.MAX_VALUE+1 =" + (Integer.MAX_VALUE + 1) + "-->" + Integer.toBinaryString(Integer.MAX_VALUE+1));
    }

        public static void main(String[] args) {
        binaryShow();
        binaryIntMaxVal();
        System.out.println(78217821);


    }
}

