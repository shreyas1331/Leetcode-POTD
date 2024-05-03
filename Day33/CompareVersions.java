package Day33;

public class CompareVersions {

	public static void main(String[] args) {
		String  version1 = "1.01";String version2 = "1.001";
		System.out.println(compareVersion(version1,version2));
	}
	    public static int compareVersion(String version1, String version2) {
	        String[] a=version1.split("\\.");
	        String[] b=version2.split("\\.");
	        int n=Math.max(a.length,b.length);
	        for(int i=0;i<n;i++){
	            int num1= i<a.length ? Integer.parseInt(a[i]):0;
	            int num2= i<b.length ? Integer.parseInt(b[i]):0;
	            if(num1>num2){
	                return 1;
	            }
	            else if(num1<num2){
	                return -1;
	            }
	        }
	        return 0;
	    }
	

}
