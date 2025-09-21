import java.util.*;
/*public class Calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int number = in.nextInt();

        switch (number) {
            case 1:
                System.out.println(a+b);
                break;

            case 2:
            System.out.println(a-b);
            break;
            
            case 3:
            System.out.println(a*b);
            break;

            case 4:
            System.out.println(a/b);
            break;

            default:
            System.out.println("Invalid operation");
                break;
        }
    }
}*/

/*
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if(choice == 1){   // Factorial
            int n = sc.nextInt();
            int fact = 1;
            for(int i=1; i<=n; i++){
                fact = fact * i;
            }
            System.out.print(fact);
        }
        else if(choice == 2){   // GCD
            int a = sc.nextInt();
            int b = sc.nextInt();
            while(a != b){
                if(a > b){
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.print(a);
        }
        else if(choice == 3){   // Prime Check
            int p = sc.nextInt();
            int c = 0;
            for(int i=2; i<=p/2; i++){
                if(p % i == 0){
                    c = 1;
                    break;
                }
            }
            if(p == 1) System.out.print("Not Prime");
            else if(c == 0) System.out.print("Prime");
            else System.out.print("Not Prime");
        }
        else{
            System.out.print("Invalid");
        }
    }
}
*/

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();   // user choice
        int n = sc.nextInt();        
        int arr[] = new int[n];

        for(int i=0; i<n; i++){      
            arr[i] = sc.nextInt();
        }

        if(choice == 1){   // Maximum
            int max = arr[0];
            for(int i=1; i<n; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.print(max);
        }
        else if(choice == 2){   // Minimum
            int min = arr[0];
            for(int i=1; i<n; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            System.out.print(min);
        }
        else if(choice == 3){   // Reverse
            for(int i=n-1; i>=0; i--){
                System.out.print(arr[i] + " ");
            }
        }
        else if(choice == 4){   // Sum
            int sum = 0;
            for(int i=0; i<n; i++){
                sum += arr[i];
            }
            System.out.print(sum);
        }
        else{
            System.out.print("Invalid");
        }
    }
}
