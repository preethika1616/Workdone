class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1); //prefix sum=0 in the beginning

        int maxResult=0;
        int prefixSum=0;

        for (int num : nums){
            prefixSum=prefixSum + num;


            
            if(map.containsKey(prefixSum - k)){
                maxResult += map.get(prefixSum - k);
            }
            
            map.put(prefixSum, map.getOrDefault(prefixSum,0) +1 );

            
        }
        return maxResult;
    }
}