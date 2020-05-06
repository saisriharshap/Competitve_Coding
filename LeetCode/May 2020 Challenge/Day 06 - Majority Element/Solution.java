class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count = (nums.length+1)/2;
        for(int i : nums){
            if(map.get(i)>=count)
                return i;
        }
        return -1;
    }
}