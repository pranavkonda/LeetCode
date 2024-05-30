class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueElements = 1;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[uniqueElements] = nums[i+1];
                uniqueElements++;
            }
        }
        return uniqueElements;
    }
}