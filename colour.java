package fruit.java;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class colour {

	public static void main(String[] args) {
		List<fruits> fruitslist=Arrays.asList(new fruits("Mango",99,90, "Yellow"),
				new fruits("Apple", 95, 30, "Red"),
			    new fruits("Strawberry", 25, 10,"Red"),
				new fruits("Cherry", 10, 10, "Red"),
				new fruits("Grapes", 15, 20, "Green"));
				
				//fruits.forEach(System.out::println);
				List<fruits> colorList=fruitslist.stream().sorted(Comparator.comparing(fruits::getColour)).collect(Collectors.toList());
				System.out.println("Colorwise sorting of fruits is:");
				colorList.forEach(System.out::println);
			}

		}