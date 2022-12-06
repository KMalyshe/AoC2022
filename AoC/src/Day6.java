import java.util.ArrayList;
public class Day6 {

	public static void main(String[] args) {
		ArrayList<String> inputs = FileReader.bububu();
		String str = inputs.get(0);
		int distinct = 14;
		for (int i = distinct-1; i<str.length(); i++) {
			boolean found = true;
			char[] tmp = new char[distinct];
			for (int j = 0; j<distinct; j++) {
				tmp[j] = str.charAt(i - (distinct - 1) + j);
			}
			for (int j = 0; j<distinct; j++) {
				for (int k = 0; k<distinct; k++) {
					if (k != j && tmp[j] == tmp[k]) {
						found = false;
					}
				}
			}
			if (found) {
				System.out.println(i+1);
				break;
			}
		}
	}
}
