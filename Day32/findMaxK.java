package Day32;
import java.util.*;
public class findMaxK {

	public static void main(String[] args) {
		int[]nums = {-1,2,-3,3};
		System.out.println(findMaxK(nums));
		System.out.println(findMaxK1(nums));
	}
	public static int findMaxK(int[] nums) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==-nums[j] ){
                    ans= Math.max(ans,Math.abs(nums[i]));
                }
            }
        }
        return ans==Integer.MIN_VALUE?-1:ans;
    }
	public static int findMaxK1(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            set.add(i);
            int k=i*(-1);
            if(set.contains(k)){
                max=Math.max(max,Math.abs(k));
            }
        }
        return max==Integer.MIN_VALUE?-1:max;
    }
	

}
