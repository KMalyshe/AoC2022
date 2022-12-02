import java.util.ArrayList;

public class Day2 {

	public static void main(String[] args) {
		ArrayList<String> inputs = FileReader.bububu();
		int sum = 0;
		
		for (int i = 0; i<inputs.size(); i++) {
			switch (inputs.get(i).charAt(0)) {
			case 'A':
				switch (inputs.get(i).charAt(2)) {
				case 'X':
					sum += 3;
					break;
				case 'Y':
					sum += 4;
					break;
				case 'Z':
					sum += 8;
					break;
				}
				break;
				
			case 'B':
				switch (inputs.get(i).charAt(2)) {
				case'X':
					sum += 1;
					break;
				case 'Y':
					sum += 5;
					break;
				case 'Z':
					sum += 9;
					break;
				}
				break;
				
			case 'C':
				switch (inputs.get(i).charAt(2)) {
				case'X':
					sum += 2;
					break;
				case 'Y':
					sum += 6;
					break;
				case 'Z':
					sum += 7;
					break;
					
				}
				break;
			}
		}
		
		System.out.println(sum);

	}

}
