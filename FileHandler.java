import java.io.*;
import java.util.*;

public class FileHandler {
    public static ArrayList<Property> readFile(String fileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            ArrayList<Property> readList = new ArrayList<>();
            //YOUR IMPLEMENTATION HERE!
            //TRY TO FOLLOW THIS FORMAT HOUSE|1990 Blue Lake Blvd|500000|4|3
            return readList;
        } catch (Exception e) {
            return new ArrayList<Property>();
        }
    }

    public static void writeToFile(ArrayList<Property> list, String fileName){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            //ANDY WILL DO THIS!
        } catch (Exception e) {

        }
    }
}
