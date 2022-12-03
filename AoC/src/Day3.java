import java.util.ArrayList;

public class Day3 {

	public static void main(String[] args) {
		ArrayList<String> inputs = FileReader.bububu();
		int sum = 0;
		int badgesum = 0;
		int tempsum = 0;
		char matchchar = '$';
		boolean found = false;
		
		// part one
		ArrayList<String> split = new ArrayList<String>();	
		for (int i = 0; i<inputs.size(); i++) {
			split.add(inputs.get(i).substring(0, inputs.get(i).length() / 2));
			split.add(inputs.get(i).substring(inputs.get(i).length() / 2));
		}
		
		for (int i = 1; i<split.size(); i = i+2) {
			for (int j = 0; j<split.get(i-1).length(); j++) {
				tempsum = sum;
				for (int k = 0; k<split.get(i).length(); k++) {
					if (split.get(i-1).charAt(j) == split.get(i).charAt(k)) {
						sum += charcheck(split.get(i).charAt(k));
						break;
					}
				}
				if (tempsum != sum) break;
			}
		}
		
		System.out.println(sum);
		// end part one
		
		for (int i = 2; i<inputs.size(); i = i+3) {
		
			for (int j = 0; j<inputs.get(i-2).length(); j++) {
				for (int k = 0; k<inputs.get(i-1).length(); k++) {
					if (inputs.get(i-2).charAt(j) == inputs.get(i-1).charAt(k)) {
						matchchar = inputs.get(i-2).charAt(j);
						for (int n = 0; n<inputs.get(i).length(); n++) {
							if (inputs.get(i).charAt(n) == matchchar) {
								found = true;
								break;
							}
						}
						if (found) {
							badgesum = badgesum + charcheck(matchchar);
							break;
						}
					}
				}
				if (found) {
					found = false;
					break;
				}
				matchchar = '$';
			}
		}
		System.out.println(badgesum);
	}
	
	static int charcheck(char character) {
		if (Character.isUpperCase(character)) {
			return ((int) character - 38);
		}
		else return ((int) character - 96);
	}

}
