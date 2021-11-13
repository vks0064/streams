package fruit.java;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class calories {

	public static void main(String[] args) {
		List<fruits> fruitslist=Arrays.asList(new fruits("Mango",95, 90,"Yellow"),
				new fruits("Apple", 95, 30, "Red"),
			    new fruits("Strawberry", 25, 10,"Red"),
				new fruits("Cherry", 10, 10, "Red"),
				new fruits("Grapes", 15, 20, "Green"));
				
				//fruits.forEach(System.out::println);
			
				List<fruits>sortedList=fruitslist.stream().sorted(Comparator.comparingInt(fruits::getCalories).reversed()).collect(Collectors.toList());
				System.out.println("Fruits with calories<100 are:");
				sortedList.forEach(System.out::println);
	}
} 

	


