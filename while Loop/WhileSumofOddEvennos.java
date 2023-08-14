public class WhileSumofOddEvennos {

	public static void main(String[] args) {
        int sumofodd=0;
        int sumofeven=0;
        int n=1;
        while(n<=50){
            if(n%2==1){
                sumofodd+=n;
			}
            else{
                sumofeven+=n;
            }
            n++;
        }
		
        System.out.println("Sum of Odd numbers are: "+sumofodd);
        System.out.println("Sum of Even numbers are: "+sumofeven);
	}

}