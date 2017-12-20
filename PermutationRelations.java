package CodingTest;
import java.util.ArrayList;

public class PermutationRelations {

	static String str1 = "aacc";
	static String str2 = "ccaa";
	static String str3 = "";
	static String str4 = "";
	static ArrayList<String> arrayList;

	public static void main(String[] args) {
		arrangementArrayList(str1);
		arrangementArrayList(str2);
		System.out.println(checkDuplication(arrangementArrayList(str1), arrangementArrayList(str2)));
	}

	static String checkDuplication(ArrayList<String> a, ArrayList<String> b) {
		if (a.size() != b.size())
			return "순열 관계 아님, 배열 크기 오류";
		for (int o = 0; o < a.size(); o++) {
			if (a.get(o).equals(b.get(o))) {
			} else {
				//openArray(a);
				//openArray(b);
				return "순열관계 아님";
			}
		}
		return "순열관계";
	}

	static ArrayList<String> arrangementArrayList(String str) {
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int w = 0; w < str.length(); w++) {
			arrayList.add(str.substring(w, w + 1));
		}

		for (int k = 0; k < arrayList.size(); k++) {
			for (int l = k + 1; l < arrayList.size(); l++) {
				str3 = arrayList.get(k);
				str4 = arrayList.get(l);
				if (str3.compareTo(str4) > 0) {
					arrayList.set(k, str4);
					arrayList.set(l, str3);
				}
			}
		}
		return arrayList;
	}
	/*
	 * static void openArray(ArrayList list) {
	 * System.out.println("================"); for (int i = 0; i < list.size(); i++)
	 * { System.out.println(i + " : " + list.get(i)); }
	 * System.out.println("================"); }
	 */
}
