import java.util.ArrayList;
import java.util.Collections;

public class Day5 {

	public static void main(String[] args) {
		ArrayList<String> inputs = FileReader.bububu();
		
		int stacks = 0;
		int whichstack = 0;
		
		for (int i = 0; i<inputs.size(); i++) {
			if (inputs.get(i).contains("move")) {
				stacks = i-1;
				break;
			}
		}
		
		ArrayList<ArrayList<Character>> mimimi = new ArrayList<ArrayList<Character>>();
		
		for (int i = 0; i<9; i++) {
			mimimi.add(new ArrayList<Character>());
		}
		for (int j = 0; j<stacks; j++) {
			for (int i = 1; i<inputs.get(j).length(); i = i+4) {
				mimimi.get(whichstack).add(inputs.get(j).charAt(i));
				whichstack++;
			}
			whichstack = 0;
		}
		for (int i = 0; i<9; i++) {
			Collections.reverse(mimimi.get(i));
			for (int j = mimimi.get(i).size()-1; j>=0; j--) {
				if (mimimi.get(i).get(j) == ' ') mimimi.get(i).remove(j);
			}
		}
		
		for (int i = stacks+1; i<inputs.size(); i++) {
			inputs.set(i, inputs.get(i).replace("move ", ""));
			inputs.set(i, inputs.get(i).replace(" from ", "/"));
			inputs.set(i, inputs.get(i).replace(" to ", "/"));
		}
		for (int i = stacks+1; i<inputs.size(); i++) {
			String[] tmp = new String[3];
			tmp = inputs.get(i).split("/");
			char temp = ' ';
			/* Part one
			for (int j = 0; j<Integer.parseInt(tmp[0]); j++) {
				temp = mimimi.get(Integer.parseInt(tmp[1])-1).get(mimimi.get(Integer.parseInt(tmp[1])-1).size() - 1);
				mimimi.get(Integer.parseInt(tmp[1])-1).remove(mimimi.get(Integer.parseInt(tmp[1])-1).size() - 1);
				mimimi.get(Integer.parseInt(tmp[2])-1).add(temp);
			}
			End Part one*/
			for (int j = Integer.parseInt(tmp[0])-1; j>=0; j--) {
				temp = mimimi.get(Integer.parseInt(tmp[1])-1).get(mimimi.get(Integer.parseInt(tmp[1])-1).size() - j - 1);
				mimimi.get(Integer.parseInt(tmp[1])-1).remove(mimimi.get(Integer.parseInt(tmp[1])-1).size() - j - 1);
				mimimi.get(Integer.parseInt(tmp[2])-1).add(temp);
			}
		}
		String result = "";
		for (int i = 0; i<mimimi.size(); i++) {
			result = result + mimimi.get(i).get(mimimi.get(i).size()-1);
		}
		System.out.println(result);
	}

}
