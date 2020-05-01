class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        while(low<=high){
            int mid = low +(high - low)/2;
            if(nums[mid]==target){
                index = mid;
                break;
            }
            if(nums[mid]<target)
                low = mid+1;
            if(nums[mid]>target)
                high = mid-1;
        }
        return index;
    }
}