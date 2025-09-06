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

/* 

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
*/

/*

class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}
*/

/* 
class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        for(int i = 1; i <= n; i++) {
            int temp = i;
            int sum = 0;
            int digits = 0;
            int t = temp;
            while(t > 0) {
                digits++;
                t /= 10;
            }

            t = temp;
            while(t > 0) {
                int d = t % 10;
                int pow = 1;
                for(int j = 1; j <= digits; j++) {
                    pow = pow * d;
                }
                sum = sum + pow;
                t /= 10;
            }
            if(sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
*/

/* 
class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
*/


public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        // Find divisors and add
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }
}

