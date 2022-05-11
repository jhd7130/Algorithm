package leetcode.easy.explorer;

public class VaildMountainArray {

    public boolean validMountainArray(int[] arr) {


        int len = arr.length;
        int step = 0;
        //우선 배열이 비여있거나 길이가 3보다 짧으면 반환 이유는 산을 올라갔다 내려가려면 적어도 3개(시작,피크,마지막)이 존재해야함
        if (arr == null || len < 3){return false;}

        // step은 0부터 시작하고 총 길이 전만큼 확인해야한다.
        // 그리고 올라가는 과정에 있어서 이전 배열인덱스는 다음 배열 인덱스 보다 작아야한다.
        // 조건을 만족하면 인덱스가 하나씩 올라간다.
        // increasing count
        while (step + 1 < len && arr[step] < arr[step + 1]){
            step++;
        }

        // 올라가는 과정이 끝나고 피크를 만나면 다음 이프문으로 넘어간다.
        // 이때 배열의 마지막 인덱스번호와 step이 같으면 즉, 피크가 배열의 마지막 인덱스와 같거나 피크가 첫번째 이면 거짓을 반환한다.
        if( step == len -1 || step == 0){return false;}

        // 피크가 마지막이거나 처음이 아니면 내려가는 작업을 통해 step을 체크한다.
        // decreasing count
        while (step + 1 < len && arr[step] > arr[step + 1]){
            step ++;
        }
        return step == len -1;
    }
}
