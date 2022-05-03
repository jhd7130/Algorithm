package leetcode.easy.explorer;

import java.util.ArrayList;
import java.util.List;

public class FindNumbers {
    public static void main(String args[]){
        FindNumbers find = new FindNumbers();
        int[] a = {-12,345,2,6,7896};
        //System.out.println(find.findNumbers(a));
        int[] b = find.sortedSquares(a);
        for(int c : b){
            System.out.println(c);
        }
    }


    /*
    * 배열의 각각의 값들의 자리수를 체크하여 짝수 자릿수인ㅣ인덱스의 개수를 반환해주는 메서드
    * */
    public int findNumbers(int[] nums){
        int evenCnt =0;
        for(int i =0; i<nums.length; i++){
           if(((int)Math.log10(nums[i])+1)%2 == 0)
               evenCnt ++;
        }

        return evenCnt;
    }

    /*
    * 각 index에 해당하는 값을 제곱하고 제곱된 배열의 값들을 정렬 시켜주는 메서드이다.
    * */
    public int[] sortedSquares(int[] nums) {
        //값이 주어지면 각인덱스의 값을 제곱하고(squaring)한다 그리고 솔팅한다.
        for(int i =0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
            System.out.println("제곱 : " + nums[i]);
        }

        int tmp = 0;
        for(int i =0; i < nums.length -1 ; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }

        }
    return nums;
    }
}
