package algorithmstudy;

import java.util.Objects;

public class ValidPalindrome {


    public boolean validPalindrome(String s){

        // 하나의 문자열이 있다. 거꾸로해도 같은 문자열이여야한다.
        // 양 끝 수를 비교했을 때 같으면 더이상 신경쓸 필요 없다.
        // 다르면 둘 중 하나를 지우고 나머지가 palindrome인지를 체크한다.

        int i = 0; //startPoint
        int j = s.length() -1; //endPoint

        // 양끝이 다르면 둘중 하나를 지웟을 경우 palindrome이 되는지 확인 필요
        while(i > j){
            if(s.charAt(i) != s.charAt(j)){
                return checkPalindrome(s,i+1,j) || checkPalindrome(s, i , j -1);
            }
        }

        return true;
    }

    public boolean checkPalindrome(String target, int i, int j){
        //시작 점과 끝 점을 비교
        while(i > j){
            if (target.charAt(i) != target.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}
/*
문제
문자열 s가 주어졌을때, 최대 하나의 문자를 지워서 palindrome(회문, 거꾸로 읽어도 똑같은 문자열 - ex: 이하이)이 가능하면 true를 리턴하는 함수를 작성하세요. (지우지 않고 palindrome이 되어도 true를 리턴)

예제 1:
입력: s = “aba”
출력: true

예제 2:
입력: s = “abca”
출력: true
설명: 문자 c를 지우면 aba가 되므로 palindrome이 성립됩니다

예제 3:
입력: s = “abc”
출력: false
설명: 어떤 문자를 지우더라도 palindrome을 성립시킬 수 없습니다

제약사항:
1 <= s.length <= 10^5
s는 영어 소문자로만 이루어져있습니다

작성할 method:
public boolean validPalindrome(String s) {
// implementation
	}

 */