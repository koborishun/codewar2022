package eight;

//You get an array of numbers, return the sum of all of the positives ones.
//
//Example [1,-4,7,12] => 1 + 7 + 12 = 20
//
//Note: if there is nothing to sum, the sum is default to 0.
public class SumOfPositive {
	public static int sum(int[] array) {
		int sum = 0;
		for (int i : array) {
			if (i >= 0) {
				sum += i;
			}
		}
		return sum;
	}
	//別解
	//	public static int sum(int[] arr){
	//        return Arrays.stream(arr).filter(v -> v > 0).sum();
	//    }
}
