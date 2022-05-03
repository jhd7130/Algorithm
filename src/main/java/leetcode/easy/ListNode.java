package leetcode.easy;

public class ListNode {
    /*
    들어온 값을 100,10,1로 나눈 몫을 하나씩 배열에 저장한다. l1과 l2 모두 구분하여 저장하고
    그리고 각 인덱스를 더한 뒤 10이 넘으면 다음 인덱스로 1을 넘겨주어 더한다.
    * */
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}