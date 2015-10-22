package Math;

public class ExcelSheetColumnTitle {

	public String convertToTitle(int n) {
		int remainder = 0;
		String result = "";
		while(n != 0){
			n--;
			remainder = n % 26;
			n /= 26;
			result = (char)(remainder + 97) + result;
		}
		
        return result.toUpperCase();
    }
	
	public static void main(String[] args) {
		int n = 26;
		ExcelSheetColumnTitle esc = new ExcelSheetColumnTitle();
		System.out.println(esc.convertToTitle(n));

	}
}
