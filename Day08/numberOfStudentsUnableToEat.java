package Day08;

public class numberOfStudentsUnableToEat {

	public static void main(String[] args) {
		int[]students= {1,1,0,0};
		int[]sandwiches= {0,1,0,1};
		System.out.println(countStudents(students,sandwiches));
	}
	public static int countStudents(int[] students, int[] sandwiches) {
        int cnt_0=0;         int cnt_1=0;
        for(int num:students){
            if(num==0) cnt_0++;
            else cnt_1++;
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0){
                if(cnt_0>0){
                    cnt_0--;
                }else{
                    break;
                }
            }else{
                if(cnt_1>0){
                    cnt_1--;
                }else{
                    break;
                }
            }
        }
        return cnt_0+cnt_1;
    }

}
