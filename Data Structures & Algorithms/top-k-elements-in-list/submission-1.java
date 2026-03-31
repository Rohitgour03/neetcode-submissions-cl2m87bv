class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create a hashmap
        HashMap<Integer, Integer> countsMap = new HashMap<>();
        for (int num : nums) {
            countsMap.put(num, countsMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer>[] freq = new List[nums.length + 1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        countsMap.forEach((num, count) -> {
            freq[count].add(num);
        });

        int[] result = new int[k];
        int index = 0;

        for (int i = freq.length - 1; i > 0 && index < k ; i--) {
            for (int num : freq[i] ) {
                result[index++] = num;
                if (index == k) return result;
            }
        }
        
        return result;
    }
}
