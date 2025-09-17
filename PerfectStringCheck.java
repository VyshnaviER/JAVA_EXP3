import java.util.Scanner;

public class PerfectStringCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();

        boolean isPerfect = true;
        char repeatChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (c == Character.toLowerCase(str.charAt(j))) {
                    isPerfect = false;
                    repeatChar = str.charAt(j);
                    break;
                }
            }
            if (!isPerfect) break;
        }

        if (isPerfect) {
            System.out.println("PERFECT");
            System.out.println("[Reason: \"" + str + "\" does not have any character repeating]");
        } else {
            System.out.println("NOT PERFECT");
            System.out.println("[Reason: \"" + str + "\" has '" + repeatChar + "' as repeating character]");
        }
        sc.close();
    }
}

