package Math;

public class ExcelSheetColumnNumber {
	
	public int titleToNumber(String s) {
		s = s.toLowerCase();
		char [] arr = s.toCharArray();
		int counter = 0;
		int sum = 0;
		for(int i = arr.length - 1; i >= 0; i--){
			int value = (int)arr[i] - 96;
			sum += Math.pow(26, counter) * value;
			counter++;
		}
        return sum;
    }
	
	public static void main(String[] args) {
		String s = "Z";
		ExcelSheetColumnNumber esc = new ExcelSheetColumnNumber();
		System.out.println(esc.titleToNumber(s));
	}
}
