public class ReverseArray {
    // This method uses another array to reverse the array from back to front.
    // // Uses extra memory to create a new reversed array.
    public static int[] reverse1 (int[] arr){
        int[] newArr = new int[arr.length];
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){
            newArr[j] = arr[i];
        }
        return newArr;
    }
    
    // This method uses swapping technique using third variable to swap from both ends.
    // It does not uses 2nd Array and iterates only halfway through the array.
    // It is both Time and Memory efficient.
    public static int[] reverse2 (int[] arr){
        int temp;
        for(int i = 0; i < arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}