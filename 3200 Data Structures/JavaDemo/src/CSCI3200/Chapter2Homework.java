package CSCI3200;

public class Chapter2Homework {
    public static int alg1(int n) {
        int steps = 0;                          //O(1)
        System.out.println("N is: " + n);       //O(1)
        for (int k = 1; k < n; k *= 2) {        //O(log n)
            System.out.println("Step " + steps + ", K = " + k);     //O(1)
            steps++;    //O(1)
        }
        return steps;   //O(1)
    }

    public static int alg2(int n) {
        int steps = 0;      //O(1)
        System.out.println("N is: " + n);    //O(1)
        for (int i = 0; i < n * n; i++){     //O(n^2)
            System.out.println("[Outer loop] Iteration " + i);     //O(1)
            for (int j = 1; j < n; j*= 2){   //O(log n)
                System.out.println("[Inner loop] Step " + steps + ", J = " + j);  //O(1)
            steps++;    //O(1)
            }
         }
        return steps;   //O(1)
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
        
        alg1(100);
        alg2(10);
    }
}
