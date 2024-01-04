package goldmanSachs.letterCombinations;

import java.util.LinkedList;
import java.util.List;

class Solution {
    String[] map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<>();
        addCombination(digits, 0, "", res);
        return res;
    }

    private void addCombination(String digits, int cur, String possible, List<String> res) {
        if (cur == digits.length()) {
            if (!possible.isEmpty()) res.add(possible);
            return;
        }
        int index = digits.charAt(cur) - '0' - 2;
        for (char c: map[index].toCharArray()) {
            addCombination(digits, cur + 1, possible + c, res);
        }
    }
}