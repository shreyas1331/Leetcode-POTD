package Day09;
import java.util.*;
public class time_needed_to_buy_tickets {

	public static void main(String[] args) {
		int[]tickets= {2,3,2};
		int k=2;
		System.out.println(timeRequiredToBuy(tickets,k));
	}
	public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++)     q.add(i);
        int sec=0;
        while(!q.isEmpty()){
            sec++;
            int person=q.poll();
            if(tickets[person]>=1 ){
                tickets[person]--;
            }
            if(tickets[person]==0 && person==k){
                break;
            }
            if(tickets[person]==0 && person!=k){
                continue;
            }
            q.add(person);
        }
        return sec;
    }

}
