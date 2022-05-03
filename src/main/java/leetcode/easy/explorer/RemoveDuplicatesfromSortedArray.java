package leetcode.easy.explorer;

public class RemoveDuplicatesfromSortedArray {

  /*  Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]*/

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int k = 0;
        // 모든 숫자를 체크하는 과정에서
        // 연속되는 숫자가 중복되면
        // 앞의 숫자를 지우고
        // 한칸씩 땡기기(덮어씌우기)
        // 땅기면

        //모든 숫자 체크 포문
        for(int i =1; i < len; i++){
            if(nums[i] == nums[i - 1]){
                for(int j = i; j < len; j++){
                    nums[j - 1 ] = nums[j];
                }
                len--;
                k++;
                i--;
            }
        }
        for(int a : nums){
            System.out.println(a);
        }
        return nums.length - k;
    }
}
