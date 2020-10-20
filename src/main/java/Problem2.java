public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    The algorithm I used is a double pointer style.
    We set the first pointer to 0 and the other to 1, unless the array is empty.
    While we go through the loop we check to see if the first pointer and second equal.
    If not we increase the first and second pointer while inputting the first into the second.
    If they are equal, the second skips it, then we return i + 1 once the loop is done.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
