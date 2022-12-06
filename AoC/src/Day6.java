import java.util.ArrayList;
public class Day6 {

	public static void main(String[] args) {
		ArrayList<String> inputs = FileReader.bububu();
		String str = inputs.get(0);
		int mrlglr = 14;
		for (int i = mrlglr-1; i<str.length(); i++) {
			boolean found = true;
			char[] tmp = new char[mrlglr];
			for (int j = 0; j<mrlglr; j++) {
				tmp[j] = str.charAt(i - (mrlglr - 1) + j);
			}
			for (int j = 0; j<mrlglr; j++) {
				for (int k = 0; k<mrlglr; k++) {
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
