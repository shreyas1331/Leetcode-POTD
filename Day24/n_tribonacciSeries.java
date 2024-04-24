package Day24;

public class n_tribonacciSeries {

	public static void main(String[] args) {
		int n=4;
		tribonacci(n);

	}
	public static  int f(int n){ 
        int []t=new int[38];
        t[0]=0;
        t[1]=1;
        t[2]=1;
        for(int i=3;i<=37;i++){
            t[i]=t[i-1]+t[i-2]+t[i-3];
        }
        return t[n];
        // int[]dp=new int[n+1];
        // if(n==0) return 0;
        // if(n==1 || n==2) return 1;
        // if(dp[n]!=0)return dp[n];
        // int a=f(n-1);
        // int b=f(n-2);
        // int c=f(n-3);
        // return dp[n]=a+b+c;
    }
    public static int tribonacci(int n) {
        return f(n);
    }

}
