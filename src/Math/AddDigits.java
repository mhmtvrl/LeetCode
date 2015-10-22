package Math;

//https://leetcode.com/problems/add-digits/

public class AddDigits {
	public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }
}
