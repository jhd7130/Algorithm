package algorithmstudy;

import java.util.Stack;
import java.util.Vector;

public class MaxStack<T> extends Stack<T> {

    /*
    * 기본적인 stack의 룰(push, pop, top)을 따르면서 추가적으로  peekMax, popMax를 지원하는 stack class를 구현해보세요.
        지원하는 methods:
        push(x) - stack에 x를 넣습니다
        pop() - stack의 최상위 element를 삭제하면서 리턴합니다
        top() - stack의 최상위 element를 리턴합니다 (삭제하지 않음)
        peekMax() - stack에서 가장 높은 값을 리턴합니다 (삭제하지 않음)
        popMax() - stack에서 가장 높은 값을 삭제하면서 리턴합니다. 만약 최대값이 하나 이상이면 최상위의 높은 값을 삭제합니다.
    * */

    /*
    * 가장 높은 값을 리턴한다
    * 순서에 상관없이 지우지 않고 리턴만 한다.
    * */
    public T peekMax(){
        int indxNo = 0;
        int maxNo = 0;
        // 현재 쌓여있는 스택의 개수를 체크한다.
        int size = size();

        // 현재 가지고 있는 stack을 모두 peek로 값만 추출한 뒤 루프를 통해 이전 값과 비교하면 된다.
        // 비교를 통해 가장 큰 값이 나온다면 해당 인덱스 번호를 저장한다.

        return pop();
    }

}
