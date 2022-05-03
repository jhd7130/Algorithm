package leetcode.easy.explorer;

public class RemoveElement {
    public int[] input = {0,1,2,2,3,0,4,2};
    public int val =2;
    public static void main(String[] args) {
        /**
         * Input: nums = [0,1,2,2,3,0,4,2], val = 2
         *                7,7,
         * Output: 5, nums = [0,1,4,0,3,_,_,_]
         */

        RemoveElement rm = new RemoveElement();
        System.out.println(rm.removeElement(rm.input,rm.val));
        for(int a : rm.input){
            System.out.print(a + ",");
        }
    }

    public int removeElement(int[] nums, int val) {
        int k = 0;
        int len = nums.length;

        // 첫번째 val을 찾아서 해당 인덱스에서 시작해서 하나씩 옮겨와
        for(int i = 0; i < len; i++ ){
            if(nums[i] == val){
                nums[i] = nums[len -1];
                nums[len -1] = 0;
                len--;
                k++;
                if(nums[i] == val){
                    i--;
                }
            }
        }
        return nums.length - k;
    }
}
