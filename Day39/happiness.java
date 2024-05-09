package Day39;

import java.util.Arrays;

public class happiness {
    public static void main(String[] args) {
        int[]happiness = {1,2,3}; int k = 2;
        long ans=maximumHappinessSum(happiness,k);
        System.out.println(ans);
    }
     public static  long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans=0;
        int n=happiness.length;
        for(int i=0;i<k;i++){
            if((happiness[n-i-1]-i)<0){
                return ans;
            }
            ans+=(happiness[n-i-1]-i);
        }
        return ans;
    }
}
