package algorithmstudy;

// 정답
public class TimesToBuyTicket {

    public static void main(String[] args) {
        TimesToBuyTicket ts = new TimesToBuyTicket();
        int[] a = {5, 1, 1, 1};
        int time = ts.timeRequiredToBuy(a,0);
        System.out.println(time);
    }

    public int timeRequiredToBuy(int[] tickets, int k) {
        int timetobuy = 0;
        int len = tickets.length;
        boolean flag = true;
        // k인덱스의 수가 0이 될때까지만 반복
        while(flag){
         for(int i =0; i < len; i ++){
             if(tickets[i] > 0){
                 timetobuy++;
                 tickets[i] = tickets[i] - 1;
                 if(i == k && tickets[k] == 0){
                     flag = false;
                 }
             }
         }
        }
        return timetobuy;
    }
}
