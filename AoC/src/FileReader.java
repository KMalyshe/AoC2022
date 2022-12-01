import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class FileReader {

	    public static ArrayList<String> bububu() {

	        try {
	            System.out.print("filename:");

	            Scanner input = new Scanner(System.in);

	            File file = new File(input.nextLine());

	            input = new Scanner(file);

                ArrayList<String> calories = new ArrayList<String>();
                
	            while (input.hasNextLine()) {
	                String line = input.nextLine();
	                calories.add(line);
	            }
	            input.close();
	            
	            return calories;

	        } catch (Exception ex) {
	            System.out.println("mimimi");
	            ArrayList<String> nulls = new ArrayList<String>();
	            nulls.add("Error");
	            return nulls;
	        }
	    }

	}

