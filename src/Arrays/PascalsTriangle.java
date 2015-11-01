package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem #118
 * 
 * Pascal's Triangle
 * 
 * Given numRows, generate the first numRows of Pascal's triangle.
 * 
 * For example, given numRows = 5
 * 
 * Return
 * 
 [
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 * @author mehmet
 *
 */

public class PascalsTriangle {
	
	/**
	 * Generates row's next row in Pascal Triangle
	 * @param list
	 * @return
	 */
	public List<Integer> generateRow(List<Integer> list){
		List<Integer> generatedRow = new ArrayList<Integer>();
		generatedRow.add(1);
		for(int i = 1; i < list.size(); i++){
			generatedRow.add(list.get(i) + list.get(i - 1));
		}
		generatedRow.add(1);
		return generatedRow;
	}
	
	/**
	 * Generates Pascal's Triangle.
	 * @param numRows
	 * @return
	 */
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	if(numRows == 0)
    		return list;
    	List<Integer> initialList = new ArrayList<Integer>();
    	initialList.add(1);
    	list.add(initialList);
    	
    	for(int i = 1; i < numRows; i++){
    		list.add(this.generateRow(list.get(i - 1)));
    	}
        return list;
    }
    
    public static void main(String[] args) {
		PascalsTriangle pt = new PascalsTriangle();
		int numRows = 0;
		int numRows1 = 1;
		int numRows2 = 2;
		int numRows3 = 3;
		System.out.println(pt.generate(0));
	}
}
