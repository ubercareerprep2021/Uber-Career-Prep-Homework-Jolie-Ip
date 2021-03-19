import java.util.ArrayList
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
Brute Force 
1) two-for loops to find pair that equals to target sum
*/

public Array<Int, Int> pairsThatEqualSum (Array<Int> inputArray, Int targetSum) {
    for (int i=0; i<inputArray.length; i++) {
        for (j= i+1; j<inputArray.length; j++) {
            if (targetSum - inputArray[i] == inputArray[j]) {
                
            }
        }
    }
    
}
