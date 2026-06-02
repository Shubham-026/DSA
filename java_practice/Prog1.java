//leetcode problem - 66 Plus One
//https://leetcode.com/problems/plus-one/

// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
// The digits are ordered from most significant to least significant in left-to-right order. 
// The large integer does not contain any leading 0's.

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].


import java.util.Arrays;
public class Main{
  public static void main(String[] args){

    int[] arr = {9,,9};                      //<----   Edit the array here.   <-----
    System.out.print(Arrays.toString(plusOne(arr)));
    System.out.print(Arrays.toString(newArray(arr, arr.length)));


  }



  public static int[] plusOne(int[] digits) {
      int arrayLength = digits.length;
      int[] answer = digits;
      for(int i = 1; i<=arrayLength; i++ ){
          if(answer[arrayLength-i]!= 9){
              answer[arrayLength - i]++;
              break;
          }
          else{
              answer[arrayLength - i] = 0;
          }
      }
      return answer;

  }
   
    static int[] newArray(int[] arr, int len){
        int[] ans = new int[len+1];
        arr[0]=1;
        for(int i = 0; i<len; i++){
            ans[i+1] = arr[i];
        }
        return arr;
    }
}