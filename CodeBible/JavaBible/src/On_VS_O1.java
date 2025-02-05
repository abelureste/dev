public class On_VS_O1 {
    public static int addUp(int n){             // O(n) function
        System.out.println("O(n) function:");
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;                           //Each iteration of this loop is a step
            System.out.println("Step: " + i + ", sum: " + sum);
        }
        return sum;                             //Ends up being n steps, making this function O(n)
    }

    public static int addUp2(int n){            // O(1) function
        System.out.println("O(1) function:");
        int step = 0;
        int sum = n * (n + 1) / 2;              //No loops, meaning the amount of steps we see is the amount of steps total
        step =+ 1;
        System.out.println("Step: " + step + ", sum: " + sum);
        return sum;                             //Ends up being 4 steps, ignoring smaller operations, this is 0(1) since number of steps is so small
    }

    public static void main(String[] args) {
        addUp(100);
        System.out.println("");
        addUp2(100);
    }
}
