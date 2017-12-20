package CodingTest;
import java.util.ArrayList;

public class DuplicateVerification {

	public static void main(String args[]) {

		if (verifyDuplicate2("abcdeg"))
			System.out.println("중복");
	}

	static boolean verifyDuplicate(String str) {

		ArrayList<String> pasingTxt = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			pasingTxt.add(str.substring(i, i + 1));
		}

		for (int j = 0; j < pasingTxt.size(); j++) {
			for (int k = j + 1; k < pasingTxt.size(); k++) {
				if (pasingTxt.get(j).equals(pasingTxt.get(k))) {
					return true;
				}
			}
		}
		return false;
	}

	static boolean verifyDuplicate2(String str) {
		String str1 = "";
		String str2 = "";

		for (int h = 0; h < str.length(); h++) {
			str1 = str.substring(h, h + 1);
			for (int l = h + 1; l < str.length(); l++) {
				str2 = str.substring(l, l + 1);
				System.out.println("str1 = " + str1);
				System.out.println("str2 = " + str2);
				if (str1.equals(str2)) {
					return true;
				}
			}
		}

		return false;
	}
}
