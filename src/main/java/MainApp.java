import java.util.*;

public class MainApp {
    //сумма типа byte
    public static byte byteSum(byte b, short s) {
        short sum = (short) (b + s);
        if (sum >= Byte.MAX_VALUE) {
            return Byte.MAX_VALUE;
        } else {
            return (byte) sum;

        }
    }
    //произведение типа int
    public static int intMult(int i, long l) {
        long mul = i*l;
        if (mul >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) (i * l);
        }
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
    public static boolean isCharNumber(char c) {
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
        //long intMaxValPlusOne = Integer.MAX_VALUE + 1;
        System.out.println("Integer.MAX_VALUE =" + Integer.MAX_VALUE + "------>" + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Integer.MAX_VALUE+1 =" + (Integer.MAX_VALUE + 1) + "-->" + Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }
        //char в число
    public static int charTiNumber(char c) {
        return (int) c;
    }
    //число в char
    public static char intToChar(int i) {
        return Character.toChars(i)[0] ;
    }
        public static void main(String[] args) {
        System.out.println(byteSum((byte) 3, (short) 120));
        System.out.println(intMult(5, 1474836480));
        System.out.println(getMaxNumber(4,8));
        System.out.println(isCharA('v'));
        System.out.println(isCharNumber('8'));
        binaryShow();
        binaryIntMaxVal();
        System.out.println(charTiNumber('c'));
        System.out.println(intToChar(99));


        }
}

