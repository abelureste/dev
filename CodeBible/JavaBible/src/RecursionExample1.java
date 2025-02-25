public class RecursionExample1 {
    public static void main(String[] args) {
        
        walk(5);
    }

    public static void walk(int steps) {

        if(steps < 1){
            return;
        }
        System.out.println("You take a step! Step: " + steps);
        walk(steps - 1);
    }
}
