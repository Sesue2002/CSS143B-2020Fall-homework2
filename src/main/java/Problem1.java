public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    The algorithm used is a range method.
    Each "color" has a certain range of low, mid, or high (written as for1s, etc..).
    When we see a number, while traversing the array all in one go, we set it to a certain range.
    After we set it to the correct range we update the amount in it for that range.
    Using the switch statement, we update the array as we go.
     */
    //Got some help from this website for how the function is written
    //https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int for0s = 0;
        int for1s = 0;
        int for2s = nums.length - 1;
        int tmp = 0;
        while (for1s <= for2s){
            switch (nums[for1s]){
                case 0:{
                    tmp = nums[for0s];
                    nums[for0s] = nums[for1s];
                    nums[for1s] = tmp;
                    for0s++;
                    for1s++;
                    break;
                }
                case 1:
                    for1s++;
                    break;
                case 2:{
                    tmp = nums[for1s];
                    nums[for1s] = nums[for2s];
                    nums[for2s] = tmp;
                    for2s--;
                    break;
                }
            }
        }

    }
}
