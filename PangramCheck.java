import java.util.*;
import java.util.Scanner;

public class PangramCheck{
    public static void allLetter(String str){
        str = str.toLowerCase();
        boolean allLetterPresent = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }
        if (allLetterPresent)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        allLetter(str);
    }
}  