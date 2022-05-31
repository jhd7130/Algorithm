package algorithmstudy;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        // 첫번째부터 그냥 다 구한다. 아니면 첫번째만 탐색한다. 아니면 절반 이상의 길이 인덱스 값만 구함
        // 길이를 반으로 나눈다. 인덱스 0부터 절반으로 나눈 길이만큼 시작과 끝의 값을 비교 작은 값을 기준으로 절반 길이와 비교
        int last = height.length - 1;
        int start = 0;
        int target = 0;
        int max = height[0];

        while(start < last ){
            //시작은 인덱스 0부터
            // 메서드에서 나머지 평균 계산 후 맥스 값 처리
            if (height[start]*height[target] > max){
                max = height[start]*height[target];
            }
            max++;
        }

        return 1;

    }

    public int getMaxInPartition(int [] height, int start, int last){
        int max = 0;
        int target = start + 1;
        while(start < last){


        }


        return 1 ;
    }
}
