class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] countArr = new int[26];
            char[] charArr = s.toCharArray();
            for (char ch : charArr) {
                countArr[ch - 'a']++;
            }
            String key = Arrays.toString(countArr);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
