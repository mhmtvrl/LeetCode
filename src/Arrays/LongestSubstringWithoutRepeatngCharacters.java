package Arrays;

public class LongestSubstringWithoutRepeatngCharacters {
	//Given a string, find the length of the longest substring without repeating characters. 
	//For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
	
public int lengthOfLongestSubstring(String str) {
        
        if(str.compareTo("") == 0)
        {
        	return 0;
        }
            
        if(str.length() == 1)
        {
        	return 1;
        }
            		
		boolean charSet[] = new boolean[256];
		int begin = 0;
		int end = 0;
		int maxBegin = 0;
		int maxEnd = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			int value = str.charAt(i);
			if(charSet[value])
			{				
				for(int j = begin; j <= end; j++)
				{
					
					if(str.charAt(j) == str.charAt(i))
					{
						begin = j + 1;
						break;
					}
					charSet[j] = false;
				}
				
				//begin = i;
				end = i;
			}
			else
			{
				charSet[value] = true;
				end = i;
			}
			
			if((maxEnd - maxBegin + 1) < (end - begin + 1))
			{
				maxBegin = begin;
				maxEnd = end;
			}
			
		}

		return (maxEnd - maxBegin + 1);

    }
}
