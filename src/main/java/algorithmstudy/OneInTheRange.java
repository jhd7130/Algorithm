package algorithmstudy;

public class OneInTheRange {
    static final int[] arr = new int[]{0, 1, 1, 0, 0, 1, 1, 1}; // ex 1

    public OneInTheRange(int s, int e) {
        // implementation
        System.out.println("count = " + numOfOnes(s,e));
    }

    public int numOfOnes(int s, int e) {
        //Prefix sum, 누적 합계
        int count =0;

        for(int a = s ; a <= e; a++){
            if(arr[a] == 1 ){
                count++;
            }
        }
        return count;
    }

}
