package Day34;
import java.util.Arrays;
public class BoatsToSavePeople {

	public static void main(String[] args) {
		int[]people = {1,2};int limit = 3;

		Arrays.sort(people);
        int i=0;int j=people.length-1;
        int boats=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
            }else{
                j--;
            }
            boats++;
        }
        System.out.println(boats);
	}

}
