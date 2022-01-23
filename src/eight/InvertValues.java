package eight;

import java.util.Arrays;

//Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
//
//invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
//invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
//invert([]) == []
public class InvertValues {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(invert(array)));
	}

	//自答
	public static int[] invert(int[] array) {
		int[] i = new int[array.length];
		for (int j = 0; j < i.length; j++) {
			i[j] = -(array[j]);
		}
		return i;
	}

	//自答をよりbetterにしたもの
	//	public static int[] invert(int[] array) {
	//		for (int j = 0; j < i.length; j++) {
	//			array[i] *= -1;
	//		}
	//		return array;
	//	}

	//１行で表現
	//	return Arrays.stream(array).map(i -> -i).toArray();
}
