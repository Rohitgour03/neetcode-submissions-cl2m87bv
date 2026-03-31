class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> uniqueNums = new ArrayList<>();
        for (int val : nums) {
            for (int uniqueVal : uniqueNums) {
                if (val == uniqueVal) return true;
            }
            uniqueNums.add(val);
        }
        
        return false;
    }
}