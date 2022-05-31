package leetcode.easy.explorer.ArrayandString;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        //하나씩 찾아가는 선형 탐색으로 갑니다.
        // 첫번째 인덱스를 기준으로 양 쪽을 검사합니다. 만약에 인덱스 번호가 0일때 왼쪽의 합은 0입니다.
        // 인덱스번호가 마지막일때는 오른쪽의 합은 0입니다.
        // 기준은 해당 인덱스

        for (int i = 0 ; i < nums.length; i++ ){
            if(rightSum(i,nums) == leftSum(i,nums)){
                return i;
            }
        }

        return -1;
    }
    //오른쪽의 합을 체크해주는 메서드
    public int rightSum(int middleIdx, int[] nums){
        if(middleIdx == nums.length -1) return 0;

        int sum = 0 ;
        for (int i = middleIdx + 1; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    //왼쪽의 합을 체크해주는 메서드
    public int leftSum(int middleIdx, int[] nums){
        if(middleIdx == 0) return 0;

        int sum = 0 ;
        for (int i = 0; i < middleIdx; i++){
            sum += nums[i];
        }
        return sum;
    }
}
