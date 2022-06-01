package leetcode.easy.explorer.ArrayandString;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] arrs = po.plusOne(arr);
        for(int a : arrs){
            System.out.println("a = " + a);
        }
    }

    public int[] plusOne(int[] digits) {
        // 왜우... 왜우..
        /*
        맨 마지막 인덱스의 숫자에 1을 더하고 10이 되지 않으면 바로 반환한다.
        10이 넘으면 해당 인덱스에 0을 입력하고 다음 인덱스에서 1을 더해준다.
        그렇게 인덱스 0번까지 체크하고나면 배열을 1자리 더 올리고 새로 생성. 하고 0번째 인덱스에 1 삽입.
        하고 반환.
         */
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;

            if (digits[i] < 10) {
                return digits;
            }

            digits[i] = 0;
        }

        int[] res = new int[n + 1];
        res[0] = 1;

        return res;
    }
}
