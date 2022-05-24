package leetcode.easy.explorer;

public class RemoceDuplicate {
    static int[] nums = {0,1,0,3,12};
    public static void main(String[] args) {
        RemoceDuplicate rd = new RemoceDuplicate();

        System.out.println(rd.removeDuplicates(nums));
        for(int a : nums){
            System.out.println("a = " + a);
        }
    }

    public int removeDuplicates(int[] nums) {
        int cnt = 0; int dupliCnt = 0; int index = 0;
        // 중복을 제거하고 고유한 요소들만의 개수를 세야한다.

        for (int i = 0; i < nums.length; i ++){
            if(i == 0 || nums[i] != nums[i-1]){
                cnt++;
                nums[index] = nums[i];
                index ++;
            }
        }

        return cnt;
    }

}
