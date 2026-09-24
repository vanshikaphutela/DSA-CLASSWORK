import java.util.*;

public class Main {

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), ans);
        return ans;
    }

    static void backtrack(int[] nums, List<Integer> curr, List<List<Integer>> ans) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int num : nums) {
            if (curr.contains(num)) continue;

            curr.add(num);
            backtrack(nums, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }
}