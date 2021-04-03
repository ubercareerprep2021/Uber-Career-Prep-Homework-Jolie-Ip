import java.util.ArrayList;
import java.util.HashMap;
import org.javatuples.Pair;

/*
Brute force solution
1) convert both strings to character arrays
2) compare the length of the strings through array length
3) if equal, usee 2 for loops toiterate through the arrays and compare if they have the same elements

Time Complexity = O(n^2)
*/
public boolean isStringPermutation(String s1, String s2) {
    char[] str1 = s1.toCharArray();
    char[] str2 = s2.toCharArray();
    if (str1.length == str2.length) {
      for (int i=0; i<str1.length; i++) {
          for (int j = i+1; j<str1.length; j++) {
              if (str1[i] == str2[j]) {return true;}
          }
      }
    }
  return false;
}

/*
Second Approach
sort the arrays and compare if the characters are identical
O(nlog(n))
*/
   public static boolean isStringPermutation(String s1, String s2) {
    	char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
    	
    	for (int i=0; i<s1.length(); i++) {
    		Arrays.sort(str1);
    		Arrays.sort(str2);
    		return Arrays.equals(str1,str2);
    	}
    	
    	return false;
    }

/*
Optimized solution
HashMap implementation
O(n)
*/
public static boolean isStringPermutation(String s1, String s2) {
	HashMap<Integer, Character> isSame1 = new HashMap<Integer, Character>();
	HashMap<Integer, Character> isSame2 = new HashMap<Integer, Character>();
	char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
	int count =0;
    	
	for (int i=0; i<s1.length(); i++) {
		if (!isSame1.containsValue(str1[i])) {
			isSame1.put(i, str1[i]);
		}
	}
	
	for (int i=0; i<s2.length(); i++) {
		if (!isSame2.containsValue(str2[i])) {
			isSame2.put(i, str2[i]);
		}
	}
	
	for (int i=0; i<s1.length(); i++) {
		if(isSame2.containsValue(str1[i])) {
			count++;
		}
	}
	
	if (count == s1.length() && s1.length() == s2.length()) {
		return true;}
	
	return false;
	
}


/*
Brute Force 
1) two-for loops to find pair that equals to target sum
O(n^2)
*/

   public ArrayList <Pair <Integer,Integer>>  pairsThatEqualSum(int[] inputArray, int targetSum) {
    
    	ArrayList <Pair <Integer,Integer> > thepairs =
                new ArrayList <Pair <Integer,Integer> > ();
    	for (int i=0; i<inputArray.length; i++) {
            for (int j= i+1; j<inputArray.length; j++) {
                if (targetSum - inputArray[i] == inputArray[j]) {
                    
                    thepairs.add(new Pair <Integer, Integer>(inputArray[i], inputArray[j]));
                   
                    
                }
            }
        }
    	return thepairs;
    }


/*
Optimized solution
O(nlogn)
*/

 public ArrayList <Pair <Integer,Integer>>  pairsThatEqualSum(int[] inputArray, int targetSum) {
    
    	ArrayList <Pair <Integer,Integer> > thepairs = new ArrayList <Pair <Integer,Integer> > ();
    	int start =0;
	int end = inputArray.length -1;
        Arrays.sort(inputArray);
         while (start<end) {
	 if (targetSum - inputArray[end] == inputArray[start]) {
			
                    thepairs.add(new Pair <Integer, Integer>(inputArray[start], inputArray[end]));
                  
        	}
		 
	else if (inputArray[start] + inputArray[end] < targetSum) {
		start++;
	}
		 
	else if (inputArray[start] + inputArray[end] > targetSum) {
		end--;
	}
	 }
    	return thepairs;
    }

