class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int remove = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                remove++;
                nums[i] = 101;
            }
        }
        Arrays.sort(nums);
        return nums.length - remove;
    }
}