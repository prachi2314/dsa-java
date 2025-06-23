package com.prachi;

public class pattern {
    public static void main(String[] args) {
        
        pattern8(6);
    }

    static void pattern8(int n){
        n = 2*n;
        for(int i=0; i<= n; i++){
            for(int j=0; j <= n; j++){
                int atEveryIndex=Math.min(Math.min(i, j), Math.min(n-i, n-j));
                System.out.print(atEveryIndex+ " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i=0; i<=n; i++){
            for(int s=0; s<n-i; s++){
                System.out.print("  ");
            }

            for(int j=i; j>=1; j--){
                System.out.print(j+ " ");
            }

            for(int j=2; j<=i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i =0; i<=2*n; i++){
            int totalColsInRow = i>n ? 2*n-i: i;
            int noOfSpace = n-totalColsInRow;
            for(int s=0; s<noOfSpace; s++){
                System.out.print(" ");
            }

            for(int j = 1; j<=totalColsInRow; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i= 0; i <= 2 * n; i++){
            int totalColsInRow = i>n ? 2*n-i: i;
            for(int j=0; j<=totalColsInRow; j++){
                System.out.print("* ");
            } 
            System.out.println();
        }
    }

    static void pattern1(int n){
        for(int i=1; i<= n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
