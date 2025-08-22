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

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1 ; i <11 ; i++){
            System.out.println(i*n);
        }
    }
}