/* Given an integer n, Java Program to count the total number of digit 1 appearing in all non-negative 
integers less than or equal to n. */

import java.util.Scanner;
import java.lang.Math;

public class CountDigitOne {
    public static int countDigitOne(int n)
    {
      int count = 0;
      for (int i = 1;i <= n; i *= 10) {
          int divider = i * 10;
          count += (n / divider) * i + 
          Math.min(Math.max(n % divider - i + 1, 0), i);
      }
      return count;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigitOne(n));
    }
}
