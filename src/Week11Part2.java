
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Week11Part2 {

	public static void main(String[] args)   {
        // Creating a character list
        List<String> cheeseNames = Arrays.asList(
            "Harvati", "Swiss", "Cheddar", "Provolone");
 
        // Converting character list into string
        // using joining() method of Collectors class
        String cheeseNamesString
            = cheeseNames.stream()
            .sorted()
                  .map(String::valueOf)
                  .collect(Collectors.joining(", "));
 
        // Printing the concatenated string
        System.out.println(cheeseNamesString);
    }
}
	

