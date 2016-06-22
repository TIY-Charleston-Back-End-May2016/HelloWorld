/**
 * Created by zach on 6/22/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        int num = 12345;
        // 54321

        solveViaLoop(num);
        solveViaStringBuilder(num);
        solveViaMath(num);
    }

    public static void solveViaLoop(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        char[] reverseChars = new char[chars.length];

        int n = chars.length - 1;
        for (char c : chars) {
            reverseChars[n] = c;
            n--;
        }

        int reverseNum = Integer.valueOf(String.valueOf(reverseChars));
        System.out.println(reverseNum);
    }

    public static void solveViaStringBuilder(int num) {
        StringBuilder s = new StringBuilder(String.valueOf(num));
        int reverseNum = Integer.valueOf(s.reverse().toString());
        System.out.println(reverseNum);
    }

    public static void solveViaMath(int num){
        int reverseNum = 0;
        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
        }
        System.out.println(reverseNum);
    }
}
