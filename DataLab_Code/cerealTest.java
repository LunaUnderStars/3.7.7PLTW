import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class cerealTest {

    public static void main(String[] args) {

        ArrayList<Cereal> cerealArrayList = new ArrayList<Cereal>();

        /**
        * Constructor for the Library class. Loads data from the childrensbooksearly1900s.txt file
        * and populates the ArrayList childrensBooks.
        */
        {
            // a try is like an if statement, "throwing" an error if the body of the try fails
            try {
                Scanner sc = new Scanner(new File("Cereal.csv"));
                sc.nextLine();
                while (sc.hasNextLine()) {
                    // String method trim removes whitepsace from the beginning
                    // and end of strings
                    String temp = sc.nextLine().trim();
                    // String method split splits this string based on the
                    // specified token and returns an array of individual substrings
                    String[] tokens = temp.split(",");
                    String name = tokens[0];
                    int sugar = Integer.parseInt(tokens[8]);
                    double rating = Double.parseDouble(tokens[14]);

                    // add the book to the array list
                    cerealArrayList.add(new Cereal(name, sugar, rating));
	            }
            } catch (Exception e) { System.out.println("Error reading or parsing childrensbooksearly1900s.txt" + e); }
        }

        
        Cereal maxSugar = new Cereal("filler", 0, 0.0);

        for (Cereal cereal: cerealArrayList) {
            //System.out.println(cereal);
            if (cereal.getSugar() >= maxSugar.getSugar()) {
                maxSugar = cereal;
            }
        }

        System.out.println("Cereal with largest sugar content is " + maxSugar.getName() + " with " + maxSugar.getSugar() + " grams of sugar.");
    
    }
}
