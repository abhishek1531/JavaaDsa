/*public class BasicsMaths {
    public static void main(String[] args) {
        //count digits
        int n = 7789;
        int c = 0;
        while(n>0){
           // int lastdigit = n % 10;
            c++;
            n=n/10;
        }
        System.out.println(c);
    }
}*/

import java.util.Scanner;
/*
public class BasicsMaths {
    public static void main(String[] args) {
    //Reverse number
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int reversenum = 0 ;
        while(n>0){
            int lastdigit = n % 10;// 7789 = 9
            reversenum = (reversenum * 10) + lastdigit; // 7789 = 0 * 10 + 9 = 9;
            n = n/10;// 7789 = 778 
        }
        System.out.println(reversenum);
    }
}
*/

/* 
public class BasicsMaths {
    public static void main(String[] args) {
        //Palindrome 121 = 121 , 1331 = 1331
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int dup = n;
        int reversenum = 0;
        while(n>0){
            int lastdigit = n % 10;
            reversenum = (reversenum * 10) + lastdigit;
            n = n / 10;
        }
        if(reversenum== dup){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
*/

/*
public class BasicsMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Armstrong number inke digits ki power ka sum karkr agar wahi digit aa jaye toh armstrong num hai 
        int n = in.nextInt();
        int sum = 0; 
        while(n>0){
            int lastdigit = n % 10;
            sum = sum + (lastdigit * lastdigit * lastdigit * lastdigit);
            n = n / 10;
        }
        System.out.println(sum);
    }
}*/

/* 
public class BasicsMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Armstorng logic for all conditions
        int n = in.nextInt();
        int t = n;
        int c = 0;
        while(t>0){
            c++;
            t = t/10;
        }
        int sum = 0;
        t = n;
        while (t>0) {
            int lastdigit = t % 10;
            int power = 1;
            for(int i = 0 ; i< c ; i++){
                power = power * lastdigit;
            }
            sum = sum + power;
            t /= 10;
        }
        System.out.println(sum == n);
    }
}*/

public class BasicsMaths {
    public static void main(String[] args) {
        int n = 36;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}