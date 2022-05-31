package leetcode.easy.explorer;

public class Height {
    public int heightChecker(int[] heights) {
        // 1,3,2,5,4
        int[] expected = makeOrder(heights);
        int cnt = compareCnt(expected,heights);

        return cnt;
    }


    // 정렬.
    private final int[] makeOrder(int[] height){

        int[] expected = new int [ height.length ] ;
        int len = height.length;

        for ( int i = 0; i < height.length; i++ ) {
            expected[i] = height[i];
        }

        int tmp = 0;

        for (int i = 0; i < len - 1 ; i++ ){
            for (int j = i + 1 ; j < len; j++){
                if ( expected[i] > expected[j] ){
                    tmp = expected[i];
                    expected[i] = expected[j];
                    expected[j] = tmp;
                }
            }
        }

        return expected;
    }

    // 비교
    private final int compareCnt(int[] expect, int[] asIs){
        int cnt = 0 ;
        for ( int i = 0; i < expect.length; i++){
            if(expect[i] != asIs[i]){
                cnt++ ;
            }
        }
        return cnt;
    }

}
