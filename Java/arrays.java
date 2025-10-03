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

// import java.util.*;

// class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int a[] = new int[n];

//         for(int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         int even = 0, odd = 0;
//         for(int i = 0; i < n; i++) {
//             if(a[i] % 2 == 0) {
//                 even++;
//             } else {
//                 odd++;
//             }
//         }

//         System.out.print(even + " " + odd);  
//     }
// }


// import java.util.*;

// class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int a[] = new int[n];

//         for(int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         for(int i = n-1; i >= 0; i--) {
//             System.out.print(a[i] + " ");   
//         }
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

//         int min = a[0];
//         for(int i = 1; i < n; i++) {
//             if(a[i] < min) {
//                 min = a[i];
//             }
//         }

//         System.out.print(min);
//     }
// }

// import java.util.*;

// class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int a[] = new int[n];
//         boolean visited[] = new boolean[n];

//         for(int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         for(int i = 0; i < n; i++) {
//             if(visited[i]) continue;

//             boolean duplicate = false;
//             for(int j = i+1; j < n; j++) {
//                 if(a[i] == a[j]) {
//                     duplicate = true;
//                     visited[j] = true;
//                 }
//             }
//             if(duplicate) {
//                 System.out.print(a[i] + " ");
//             }
//         }
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

//         int i = 0, j = n-1;
//         boolean flag = true;

//         while(i < j) {
//             if(a[i] != a[j]) {
//                 flag = false;
//                 break;
//             }
//             i++;
//             j--;
//         }

//         if(flag) System.out.print("YES");
//         else System.out.print("NO");
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

        int key = sc.nextInt();   
        int index = -1;

        for(int i = 0; i < n; i++) {
            if(a[i] == key) {
                index = i;
                break;
            }
        }

        System.out.print(index);  
    }
}
