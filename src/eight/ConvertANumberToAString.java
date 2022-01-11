package eight;

public class ConvertANumberToAString {
	public static void main(String[] args) {
		System.out.println(123);
		System.out.println(789);
	}

	public static String numberToString(int num) {
		return Integer.toString(num);
	}
	//別解
	//	public static String numberToString(int num) {
	//		return String.valueOf(num);
	//	}
	//memo
	//基本的にvalueOf()もtoString()も同じだが、toString()の場合null参照時の例外を気にする必要あり
}
