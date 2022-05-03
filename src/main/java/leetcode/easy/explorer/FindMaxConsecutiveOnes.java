package leetcode.easy.explorer;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Hint: Initialise and declare a variable here to
        System.out.println(nums.length);
        int maxCnt = 0;
        int cnt=0;
        for(int i =0; i<nums.length; i ++){
            if(nums[i]==1){
                cnt++;
                if(maxCnt < cnt){
                    maxCnt = cnt;
                }
            }else{
                cnt = 0;
            }
        }
        return maxCnt;
    }
}


