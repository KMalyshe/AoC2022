import java.util.ArrayList;
import java.util.HashSet;

public class Day4 {

	public static void main(String[] args) {
		ArrayList<String> inputs = FileReader.bububu();
		String start = "";
		String finish = "";
		String start2 = "";
		String finish2 = "";
		int dashindex = 0;
		int commaindex = 0;
		int counter = 0;
		
		for (int i = 0; i<inputs.size(); i = i+1) {
			for (int j = 0; j<inputs.get(i).length(); j++) {
				if (inputs.get(i).charAt(j) == '-') {
					dashindex = j;
					break;
				}
				else start = start + Character.toString(inputs.get(i).charAt(j));
			}
			for (int j = dashindex+1; j<inputs.get(i).length(); j++) {
				if (inputs.get(i).charAt(j) == ',') {
					commaindex = j;
					break;
				}
				else finish = finish + Character.toString(inputs.get(i).charAt(j));
			}
			for (int j = commaindex+1; j<inputs.get(i).length(); j++) {
				if (inputs.get(i).charAt(j) == '-') {
					dashindex = j;
					break;
				}
				else start2 = start2 + Character.toString(inputs.get(i).charAt(j));
			}
			for (int j = dashindex+1; j<inputs.get(i).length(); j++) {
				if (inputs.get(i).charAt(j) == ',') {
					commaindex = j;
					break;
				}
				else finish2 = finish2 + Character.toString(inputs.get(i).charAt(j));
			}
			
			HashSet<Integer> temp = new HashSet<Integer>();
			HashSet<Integer> temp2 = new HashSet<Integer>();
			
			for (int j = Integer.parseInt(start); j<=Integer.parseInt(finish); j++) {
				temp.add(j);
			}
			for (int j = Integer.parseInt(start2); j<=Integer.parseInt(finish2); j++) {
				temp2.add(j);
			}
			
			HashSet<Integer> inters = new HashSet<Integer>(temp);
			inters.retainAll(temp2);
			
			// part one: if ((inters.size() == temp.size()) || (inters.size() == temp2.size())) counter++;
			if (!(inters.isEmpty())) counter++;
			start = "";
			finish = "";
			start2 = "";
			finish2 = "";
			
		}
		System.out.println(counter);
		

	}

}
