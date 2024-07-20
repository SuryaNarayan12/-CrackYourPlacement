class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> nums , int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Collections.sort(nums);
        dfs(nums, new boolean[nums.size()], new ArrayList<>(), ans);
        return ans;
    }

  private static void dfs(ArrayList<Integer> nums, boolean[] used, List<Integer> path, ArrayList<ArrayList<Integer>> ans) {
    if (path.size() == nums.size()) {
      ans.add(new ArrayList<>(path));
      return;
    }

    for (int i = 0; i < nums.size(); ++i) {
      if (used[i])
        continue;
      if (i > 0 && nums.get(i) == nums.get(i-1) && !used[i - 1])
        continue;
      used[i] = true;
      path.add(nums.get(i));
      dfs(nums, used, path, ans);
      path.remove(path.size() - 1);
      used[i] = false;
    }
  }

}
