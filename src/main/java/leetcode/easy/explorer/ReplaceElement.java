package leetcode.easy.explorer;

public class ReplaceElement {
    public static void main(String[] args) {
        ReplaceElement re = new ReplaceElement();

        int[] arr = {400};

        arr =  re.replaceElements(arr);
        for(int a : arr){
            System.out.println("a = " + a);
        }
    }

        public int[] replaceElements(int[] arr) {

            int max =0;
            int len = arr.length;
            //기준 인덱스 이후의 값들을 비교한다.(본인 제외)
            // arr[0]이 기준이면 arr[1]부터 끝까지 체크 그다음은 arr[1]로 넘어가고 그 다음 체크

            for (int i = 1; i < len; i++){
                max = arr[i];
                for (int j = i + 1; j < len; j++){

                    if( max < arr[j]){
                        max = arr[j];
                    }
                }
                arr[i - 1] = max;
            }

            arr[len - 1] = -1;
            return arr;
        }
}
