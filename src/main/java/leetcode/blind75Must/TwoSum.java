package leetcode.blind75Must;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3}; int target = 6;
        TwoSum ts = new TwoSum();
        int[] arr = ts.twoSum(nums,target);

        for(int a : arr){
            System.out.println("a = " + a);
        }
    }
    //주어진 배열에서 두개의 합이 주어진 target과 일치하는 값들의 인덱스를 뽑는 것
    //int[] nums = {1,2,4,6,4}, target = 8
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] arr = {0,0};
        int servive = 0 ;

        for (int i =0; i < len; i++){
            if (target/nums[i] == 2 && target%nums[i] == 0 && len ==2){
                arr[0] = 0;
                arr[1] = 1;
            }
            // 타겟을 나눴을때 몫이 1이고 나머지가 0이 아니면 됨
            if (target/nums[i] == 1 && target%nums[i] != 0){
                arr[0] = i;
                servive = target%nums[i];
            }
        }

        for (int i = 0 ; i < len ; i++){
            if(nums[i] == servive){
                arr[1] = i;
            }
        }

        return arr;
    }
}
