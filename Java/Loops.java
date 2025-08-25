import java.util.Scanner;
/* 
public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum =0;
        for(int i = 1 ; i<=n ; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
*/

// Printing table
/* 
public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1 ; i <11 ; i++){
            System.out.println(i*n);
        }
    }
}*/

/* 
class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prev = sc.nextInt();
        int currLen = 1;
        int best = 1;

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();

            if (x > prev) {
                currLen++;
            } else {
                if (currLen > best) {
                    best = currLen;
                }
                currLen = 1;
            }

            prev = x;
        }

        if (currLen > best) {
            best = currLen;
        }

        System.out.print(best);
    }
}
*/



public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
