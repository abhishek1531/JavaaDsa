// import java.util.Scanner;
// class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++) arr[i] = sc.nextInt();
//         int max = arr[0];
//         for(int i=1;i<n;i++) if(arr[i]>max) max = arr[i];
//         System.out.println(max);
//     }
// }

// import java.util.*;

// class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();   
//         int a[] = new int[n];

//         for(int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         int sum = 0;
//         for(int i = 0; i < n; i++) {
//             sum += a[i];         
//         }

//         System.out.print(sum);
//     }
// }


// import java.util.*;

// class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int a[] = new int[n];

//         for(int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         int max1 = Integer.MIN_VALUE;
//         int max2 = Integer.MIN_VALUE;

//         for(int i = 0; i < n; i++) {
//             if(a[i] > max1) {
//                 max2 = max1;
//                 max1 = a[i];
//             } else if(a[i] > max2 && a[i] != max1) {
//                 max2 = a[i];
//             }
//         }

//         System.out.print(max2);
//     }
// }

import java.util.*;

class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int even = 0, odd = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.print(even + " " + odd);  
    }
}
