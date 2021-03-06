package CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        System.out.print(new CombinationSum().combinationSum(nums,7));
    }
public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> temres,int[] nums,int target,int i){
        if(target == 0)
            result.add(new ArrayList<>(temres));
        else {
            for(;i<nums.length;i++){
                if(target<0)break;
                temres.add(nums[i]);
                backtrack(result,temres,nums,target-nums[i],i);
                temres.remove(temres.size()-1);
            }
        }
    }

}
