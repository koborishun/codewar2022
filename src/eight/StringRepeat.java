package eight;

//Write a function called repeatStr which repeats the given string string exactly n times.
public class StringRepeat {
	public static void main(String[] args) {
		System.out.println(repeatStr(5, "hello"));
	}

	public static String repeatStr(final int repeat, final String string) {
		return string.repeat(repeat);
	}
	//	別解
	//	public static String repeatStr(final int repeat, final String string) {
	//		StringBuilder sb = new StringBuilder();
	//
	//		for (int i = 0; i < repeat; i++) {
	//			sb.append(string);
	//		}
	//
	//		return sb.toString();
	//	}
}
