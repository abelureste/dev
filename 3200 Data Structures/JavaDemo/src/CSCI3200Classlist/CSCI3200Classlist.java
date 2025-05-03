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
        } catch(FileNotFoundException e) {
            System.out.println("File has not been found.");
        }
    }

    public static void sortByLastNames(String[] firstNames, String[] lastNames){  
        String[] firstNamesTemp = new String[37];
        String[] lastNamesTemp = new String[37];

        for(int i = 0; i < lastNames.length; i++){
            firstNamesTemp[i] = firstNames[i];
            lastNamesTemp[i] = lastNames[i];
        }

        for(int i = 0; i < lastNamesTemp.length; i++){
            int minimumIndex = i;

            for(int j = i + 1; j < lastNamesTemp.length; j++){
                if(lastNamesTemp[j].compareToIgnoreCase(lastNamesTemp[minimumIndex]) < 0){
                    minimumIndex = j;
                }
            }

            String tempLast = lastNamesTemp[i];
            lastNamesTemp[i] = lastNamesTemp[minimumIndex];
            lastNamesTemp[minimumIndex] = tempLast;

            String tempFirst = firstNamesTemp[i];
            firstNamesTemp[i] = firstNamesTemp[minimumIndex];
            firstNamesTemp[minimumIndex] = tempFirst;

        }

        try{
            File sortedLastNamesFile = new File("Sorted_Last_Names_Classlist.txt");
            PrintWriter write = new PrintWriter(sortedLastNamesFile);

            for(int i = 0; i < lastNamesTemp.length; i++){
                write.print(firstNamesTemp[i] + " ");
                write.println(lastNamesTemp[i]);
            }

            write.close();

        } catch (IOException e) {
            System.out.println("An error has occured!");
        }
    }

    public static void sortByFirstNames(String[] firstNames, String[] lastNames){  
        String[] firstNamesTemp = new String[37];
        String[] lastNamesTemp = new String[37];

        for(int i = 0; i < firstNamesTemp.length; i++){
            firstNamesTemp[i] = firstNames[i];
            lastNamesTemp[i] = lastNames[i];
        }

        for(int i = 0; i < firstNamesTemp.length; i++){
            int minimumIndex = i;

            for(int j = i + 1; j < firstNamesTemp.length; j++){
                if(firstNamesTemp[j].compareToIgnoreCase(firstNamesTemp[minimumIndex]) < 0){
                    minimumIndex = j;
                }
            }

            String tempFirst = firstNamesTemp[i];
            firstNamesTemp[i] = firstNamesTemp[minimumIndex];
            firstNamesTemp[minimumIndex] = tempFirst;

            String tempLast = lastNamesTemp[i];
            lastNamesTemp[i] = lastNamesTemp[minimumIndex];
            lastNamesTemp[minimumIndex] = tempLast;

        }

        try{
            File sortedFirstNamesFile = new File("Sorted_First_Names_Classlist.txt");
            PrintWriter write = new PrintWriter(sortedFirstNamesFile);

            for(int i = 0; i < firstNamesTemp.length; i++){
                write.print(firstNamesTemp[i] + " ");
                write.println(lastNamesTemp[i]);
            }

            write.close();

        } catch (IOException e) {
            System.out.println("An error has occured!");
        }
    }

    public static void main (String[] args){

        String[] firstNames = new String[37];
        String[] lastNames = new String[37];

        readValues(firstNames, lastNames);
        sortByLastNames(firstNames, lastNames);
        sortByFirstNames(firstNames, lastNames);

    }
}
