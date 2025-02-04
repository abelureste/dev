package CSCI3200;

public class Chapter2Homework {
    public static int alg1(int n) {
        int steps = 0;
        System.out.println("N is: " + n);
        for (int k = 1; k < n; k *= 2) {
            System.out.println("Step " + steps + ", K = " + k);
            steps++;
        }
        return steps;
    }

    public static int alg2(int n) {
        int steps = 0;
        for (int i = 0; i < n * n; i++){
            for (int j = 0; j < n; j*= 2){
            steps++;
            }
         }
        return steps;
    }
        
    public static int alg3(int n){
        int steps = 0;
        for (int i = 0; i < n; i++) {
            steps++;
        }
        for (int i = 0; i < n; i++) {
            steps++;
        }
        return steps;
    }

    public static void main (String[] args) {
        //System.out.print(alg1(100));          //Only returns the final step #
        alg1(100);
    }
}
