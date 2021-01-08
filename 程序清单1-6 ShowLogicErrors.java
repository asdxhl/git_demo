public class ShowLogicErrors {

	public static void main(String[] args) {
		System.out.print("Celsius 35 is Fahrenheit degree");
		System.out.print((9/5)*35+32);

	}
}


/*你将得到结果为华氏67度，而这是错误的，正确结果为95.0.
java中，整数相除是返回除法的整数部分，及小数部分被截掉，因此Java中9/5的结果是1.要得到正确的结果，需要使用9.0/5，这样得到的结果1.8
*/
