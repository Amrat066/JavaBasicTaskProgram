package practical1;

import java.util.Scanner;

class MaxMinn{

    static void removeDuplicates(String str) {
        char[] ch = str.toCharArray();
        int length = str.length();
        
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (ch[i] == ch[j]) {
                    ch[j] = '\0';
                
                }
            }
         
        }
    
        System.out.print("String after removing duplicates: ");
        for (int j = 0; j < length; j++) {
            if (ch[j] != '\0') {
                System.out.print(ch[j]);
            }
        }
        System.out.println();

    }
}

public class RemoveDublicateValue {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        MaxMinn.removeDuplicates(str);
        sc.close();
    }
}
