class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }  
        for (int num : map.keySet()) {
            if (map.get(num) % 3 != 0) {
                return num;
            }
        }
          return 0;
         }
}