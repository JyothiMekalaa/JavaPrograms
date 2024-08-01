import java.util.*;
public class StringReversal {
public static String strrev(String str) {
        char[] charArray = str.toCharArray();
        int s = 0, e = charArray.length - 1;
        char temp;

        while (s < e) {
            temp = charArray[s];
            charArray[s] = charArray[e];
            charArray[e] = temp;
            s++;
            e--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();
        String reversed = strrev(input);
        System.out.println("Reversed string: " + reversed);
       
    }
}
