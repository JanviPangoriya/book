package solution;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();

        if (a == 0) {
            System.out.print("N/A");
        } else {
            obj.nextLine().trim();
            for (int i = 1; i <= a; i++) {
                String name = obj.nextLine().trim();
                String author = obj.nextLine().trim();
                String an = obj.nextLine().trim();
                solution.Solution obj1 = new solution.Solution(name, author, an);
                obj1.bookDetails();
            }
        }
    }
}



}
