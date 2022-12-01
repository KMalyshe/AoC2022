import java.util.ArrayList;
public class Day1 {	
	public static void main(String[] args) {
		int midsum = 0;
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int currenti = 0;
		ArrayList<String> calories = FileReader.bububu();
		ArrayList<Integer> added = new ArrayList<Integer>();
		ArrayList<Integer> top3 = new ArrayList<Integer>();
		
		
		for (int i = 0; i<calories.size(); i++) {
			if (calories.get(i).isEmpty()) {
				added.add(midsum);
				midsum = 0;
			}
			else {
				midsum = midsum + Integer.parseInt(calories.get(i));
			}
		}
		for (int i = 0; i<added.size(); i++) {
			if (max1 < added.get(i)) {
				max1 = added.get(i);
			}
		}
		System.out.println(max1);
		for (int i = 0; i<added.size(); i++) {
			if (max1 == added.get(i)) {
				continue;
			}
			if (max2 < added.get(i)) {
				max2 = added.get(i);
				currenti = i;
			}
		}
		System.out.println(max2);
		added.remove(currenti);
		currenti = 0;
		for (int i = 0; i<added.size(); i++) {
			if ((max1 == added.get(i)) || (max2 == added.get(i))) {
				continue;
			}
			if (max3 < added.get(i)) {
				max3 = added.get(i);
			}
		}
		System.out.println(max3);
		int maxtotal = max1 + max2 + max3;
		System.out.println(maxtotal);
	}
}
