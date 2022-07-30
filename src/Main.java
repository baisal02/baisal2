import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
    }
     static  boolean java(String a) {
         int c = 0;
         for (int i = 0; i < a.length(); i++) {
             if (a.substring(i, i + 1).equals("e")) {
                 c++;
             }
         }
         if (c == 3) {
             return true;
         }
         return false;
     }
}

