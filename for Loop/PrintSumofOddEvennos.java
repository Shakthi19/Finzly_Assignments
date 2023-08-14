public class PrintSumofOddEvennos {

	public static void main(String[] args) {
        int sumofodd=0;
        int sumofeven=0;
		for(int n=1; n<=50; n++){
            if(n%2==1){
                sumofodd+=n;
			}
            else{
                sumofeven+=n;
            }
        }
        System.out.println("Sum of Odd numbers are: "+sumofodd);
        System.out.println("Sum of Even numbers are: "+sumofeven);
	}

}