/* Given a string s consisting of words and spaces, Java Program to return the length of the last word in the string.*/

import java.util.Scanner;

class LastWordCount {
    public static int lastWordCount(String str) {
        String[] strArr = str.split(" ");  // Split the string to obtain the last word
        int n = strArr.length;
        return strArr[n-1].length(); // returns the length of the last word
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lastWordCount(s));
    }
}
