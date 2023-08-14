public class SumofFiftyOddnos {

	public static void main(String[] args) {
        int sum=0;
		for(int n=1; n<=50; n++){
            if(n%2==1){
                sum+=n;
			}
        }
        System.out.println(sum);
	}

}