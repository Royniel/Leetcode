// Two Pointers Approach, find the numbers from nums which add upto k, and return the number of pairs found.
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right= nums.length-1;
        int ops=0;
        while(left<right){
            int sum= nums[left]+nums[right];
            if(sum==k){
                left++;
                right--;
                ops++;
            }else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return ops;
        
    }
}