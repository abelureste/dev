package CSCI3200Classlist;

import java.util.Scanner;
import java.io.*;

public class CSCI3200Classlist {

    public static void readValues(String[] firstname, String[] lastname){

        File filePath = new File("C:\\Users\\aures\\OneDrive\\Desktop\\VSCode\\dev\\3200 Data Structures\\JavaDemo\\src\\CSCI3200Classlist\\Unsorted_Classlist.txt");

        int count = 0;

        try(Scanner fileInput = new Scanner(filePath);) {
            while (fileInput.hasNextLine()) {
                String data = fileInput.nextLine();
                String[] nameList = data.split(" ");

                if(nameList.length == 2){
                    firstname[count] = nameList[0];
                    lastname[count] = nameList[1];
                    count++;
                }
            }
            }
        catch(FileNotFoundException e) {
            System.out.println("File has not been found.");
        }
    }

    public static void sortByLastNames(String[] firstNames, String[] lastNames){  
        
    }

    public static void sortByFirstNames(String[] firstNames, String[] lastNames){  
    //add code here  
    }

    public static void main (String[] args){

        String[] firstNames = new String[37];
        String[] lastNames = new String[37];

        readValues(firstNames, lastNames);

        for(int i = 0; i < firstNames.length; i++){
            System.out.print(firstNames[i] + " ");
            System.out.println(lastNames[i]);
        }
    }
}
