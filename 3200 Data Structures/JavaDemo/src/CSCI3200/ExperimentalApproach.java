package CSCI3200;

public class ExperimentalApproach {
    public static int alg2 (int n) {
            int steps = 0;
            for (int j =0; j < n*n; j++) {
                steps++;
                System.out.println(steps);
            }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(alg2(8));
    }
}
