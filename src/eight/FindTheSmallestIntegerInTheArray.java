package eight;

import java.util.Arrays;

//Given an array of integers your solution should find the smallest integer.
//引数の配列の中の最小値を返す。
public class FindTheSmallestIntegerInTheArray {
	public static void main(String[] args) {

	}

	public static int findSmallestInt(int[] args) {
		Arrays.sort(args);
		return args[0];
	}

	//	//別解
	//	public static int findSmallestInt(int[] args) {
	//		return IntStream.of(args).min().getAsInt();
	//	}
	//Streamに慣れれば別解の方が腑に落ちる
}
