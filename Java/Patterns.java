public class Patterns {
   /*  public static void main(String[] args) {
        int n = 4;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}*/
//For the outer loops count rows and for inner count columns. Print them inside inner loop.

/*public static void main(String[] args) {
    int n = 5;
    for(int i = 0 ; i<n ; i++){
        for(int j = 0 ; j<=i ; j++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}
}*/

/* 
public static void main(String[] args) {
    int n = 5;
    for(int i = 1 ; i<=n ; i++){
        for(int j = 1 ; j<=i ; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}*/

/* 
public static void main(String[] args) {
    int n = 5;
    for(int i = 1 ; i<=n ; i++){
        for(int j = 1 ; j<=i ; j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
}*/

/* 
public static void main(String[] args) {
    int n = 5;
    for(int i = 1 ; i<=n ; i++){
        for(int j = 1 ; j<= n-i+1 ; j++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}
}*/

/* 
public static void main(String[] args) {
    int n = 5;
    for(int i = 1 ; i<=n ; i++){
        for(int j = 1 ; j<=n-i+1 ; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
}*/

/* 
public static void main(String[] args) {
    int n =5;
    for(int i = 0 ; i<n ;i++){
        
    for(int j = 0 ; j <i ; j++){
        System.out.print(" ");
    }
    for(int j = 0 ; j< 2*n-(2*i + 1) ; j++){
        System.out.print("*");
    }
    System.out.println();
}
}
}*/

/* 
public static void main(String[] args) {
        int n = 5;  // pyramid ki height
        for (int i = 0; i < n; i++) {
            
            // left side ke spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // stars print karna (2*i + 1 stars each row)
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // right side ke spaces (optional, symmetry ke liye)
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // next line
            System.out.println();
        }
    }
}*/

/* 
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            
            // 1. spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // 2. stars (left + right merge)
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // 3. newline
            System.out.println();
        }
    }
}
*/

    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
