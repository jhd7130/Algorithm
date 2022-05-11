package study;

import leetcode.easy.explorer.IsThereAnyIndex;
import leetcode.easy.explorer.RemoveDuplicatesfromSortedArray;
import leetcode.easy.explorer.VaildMountainArray;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlgorithmTest {

    @Test
    @DisplayName("정렬된 배열에서 중복 처리 알고리즘 테스트")
    void removeDuplicateNumberInSortedArray(){
        RemoveDuplicatesfromSortedArray rdsa = new RemoveDuplicatesfromSortedArray();
        // 이 배열 입력시 5라는 숫자가 나와야한다.
       // int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] arr = {1,1,2};
        Assertions.assertThat(rdsa.removeDuplicates(arr)).isEqualTo(2);
    }

    @Test
    @DisplayName("배열의 인덱스의 값 중 자신 보다 두배인 값이 존재하는 배열을 찾아라")
    void isThereValueSameWithDoubleOfAnyIndex(){
        IsThereAnyIndex it = new IsThereAnyIndex();
        int[] arr = {-2,0,10,-19,4,6,-8};
        Assertions.assertThat(it.checkIfExist(arr)).isFalse();
    }

    @Test
    @DisplayName("산올라가기 코드")
    void isRightMountain(){
        VaildMountainArray vm = new VaildMountainArray();

        int[] arr = {4,4,3,2,1};

        boolean result = vm.validMountainArray(arr);

        Assertions.assertThat(result).isFalse();
    }
}
