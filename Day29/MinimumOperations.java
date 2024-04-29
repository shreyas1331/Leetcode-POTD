package Day29;

public class MinimumOperations {

	public int minOperations(int[] nums, int k) {
        int operations = 0;    int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        if (xor == k)   return 0;
        
        int target = xor ^ k;   // If not, find the xor of elements and k

        while (target > 0) {    // Count the number of set bits in the target
            operations++;
            target &= (target - 1); // clear the rightmost set bit
        }
        return operations;
    }

}
