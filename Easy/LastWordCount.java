import java.util.Scanner;
class LastWordCount {
    public static int lastWordCount(String str) {
        String[] strArr = str.split(" ");
        int n = strArr.length;
        return strArr[n-1].length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lastWordCount(s));
    }
}
