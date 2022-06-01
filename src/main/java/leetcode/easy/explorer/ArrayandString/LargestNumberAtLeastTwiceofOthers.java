package leetcode.easy.explorer.ArrayandString;

public class LargestNumberAtLeastTwiceofOthers {
    public int dominantIndex(int[] nums) {

    return vaildValue(isMaxIndex(nums), nums);

 }
    // 가장 큰 값을 찾는 메서드
    private int isMaxIndex(int[] nums){
        int maxIdx = 0;
        int maxValue = nums[0];
        for (int i = 0 ;i < nums.length; i++){
            if(maxValue <= nums[i]){
                maxValue = nums[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    // 해당 인덱스를 제외하고 각 인덱스의 값들의 2배가 최대 값인지 체크
    private int vaildValue(int max, int[] nums){
        if ( nums.length == 1 ){return 0;}
        for ( int i = 0 ;i < nums.length; i++ ){
            if ( i == max || nums[i] == 0 ){
                continue;
            } else if ( nums[max]/nums[i] < 2 ){
                return -1;
            }
        }
        return max;
    }

}
