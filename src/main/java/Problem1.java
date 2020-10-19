public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

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
