package CodingTest;

/*
 * 문자열에 들어있는 모든 공백을 %20 으로 바꾼다.
 * 모든 문자열을 담을 수 있는 충분한 공간이 이미 확보되어 있다.
 * 문자열의 최종길이가 함께 주어진다고 가정 
 * 문자열 배열로 배열 안에서 작업할 수 있도록 한다.
 * 
 * Input : "Mr John Smith", 13
 * Output : "Mr%20John%20Smith"
 */

public class SpacingEncode {

	public static void main(String[] args) {
		String str = "Mr John Smith";
		int strLeng = 13;

		replaceSpacingVal(str, strLeng);
	}

	static void replaceSpacingVal(String inputStr, int strLength) {
		String[] strs = new String[strLength];
		for (int i = 0; i < inputStr.length(); i++) {
			strs[i] = inputStr.substring(i, i + 1);
			if (strs[i].equals(" ")) {
				strs[i] = "%20";
			}
		}
		for (String ss : strs)
			System.out.print(ss);
	}
}
