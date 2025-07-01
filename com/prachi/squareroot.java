package com.prachi;

public class squareroot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;

        System.out.println(sqrt(n, p));
    }

    static double sqrt(int n, int p){
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {
            int m = s + (e-s)/2;
            if(m * m == n){
                return root;
            }
            if(m*m > n){
                m = e -1;
            }else{
                m = s + 1;
            }
        }

        double incr = 0.1;
        for(int i = 1; i < p; i++){
            while(root * root <= n){
                root += incr;
            }
            root -= i;
            incr /= 10;
        }

        return root;
    }
}
