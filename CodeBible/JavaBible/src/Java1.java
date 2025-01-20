public class Java1 {
    public static void main(String[] args) throws Exception {

        // --------------------------Primative data types - the simplest data types--------------------------

        boolean a = true;       // Stores true or false
        char b = 'i';           // Stores a single character
        byte c = 1;             // Stores 8-bit signed integer (-128 to 127 no decimals)
        short d = 3;            // Stores 16-bit signed integer (-32,768 to 32,767 no decimals)
        int e = 5;              // Stores 32-bit signed integer (-2,147,483,648 to 2,147,483,647 no decimals)
        long f = 400;           // Stores 64-bit signed integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 no decimals)
        float g = 3;          // Stores 32-bit single-precision floating-point number (numbers with decimals with up to 7 digits of precision)
        double h = 3.14159;     // Stores 64-bit single-precision floating-point number (numbers with decimals with up to 15 digits of precision)

        // ---------------------------------------Reference data types---------------------------------------
        //                        * Store the addresses of the objects they refer to *
        /*
            1. Arrays: A fixed-size data structure that stores elements of the same type.
                Example: int[] arr = new int[5];
                    - Creates an array with 5 elements that must all be int values
                    - Elements begin from the number 0, not one
         */

        String arrayExample1[] = {"First", "Second", "Third", "Fourth", "Fifth"};
        System.out.println(arrayExample1[0]);        // Prints first element in the list
        System.out.println(arrayExample1[2]);        // Prints third element in the list

         /*
            2. Classes: A blueprint or template for creating objects.
                - Contains characteristics (attributes or variables) and behaviors (methods or functions) of objects.
                - A class is like a recipe for a dish. It lists the ingredients (variables) and the steps to follow (methods) to create the dish.
         */

         class carInfo {
            String carMake;
            String carModel;
            int carYear;

            void Start() {
                System.out.println("The " + carYear + " " + carMake + " " + carModel  + " starts its engine.");
            }
         }

         carInfo Car1 = new carInfo();
         Car1.carMake = "Ford";
         Car1.carModel = "Fiesta";
         Car1.carYear = 2014;
         Car1.Start();
    }
}
