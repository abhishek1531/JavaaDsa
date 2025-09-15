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

import java.util.ArrayList;
import java.util.Collections;
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

/*
public class BasicsMaths {
    public static void main(String[] args) {
        int n = 36;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}*/

/*
public class BasicsMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Print all divisors
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1 ; i*i<=n ; i++){
            if(n % i == 0){
                list.add(i);
                if(i != n/i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);

        for(int x : list){
            System.out.print(x+" ");
        }
    }
}*/

/*
public class BasicsMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Prime check
        int n = in.nextInt();
        int count = 0;
        for(int i =  1 ; i * i <= n ; i++){
            if(n % i == 0){
                count++;
                if( i != n/i){
                    count++;
                }
            }
        }
        if(count == 2){
            System.out.println(true);
        }
        else{
            System.out.println("false");
        }
    }
}*/

/*
public class BasicsMaths {
    public static void main(String[] args) {
        //GCD or HCF
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int gcd = 1;
        for(int i = 1 ; i<=Math.min(n1 , n2) ; i++){
            if( n1%i == 0 && n2%i == 0){
                //System.out.println(i);
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}*/

/*
public class BasicsMaths {

    public static void main(String[] args) {
        //Euclidean Algorithm
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        while(a > 0 && b>0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a==0){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}*/


public class BasicsMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input numbers
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int a = n1, b = n2;
        while(a > 0 && b > 0){
            if(a > b){
                a = a % b; 
            }else{
                b = b % a;
            }
        }
        int gcd = (a == 0) ? b : a;

        int lcm = (n1 * n2) / gcd;

        System.out.println(lcm);
    }
}
