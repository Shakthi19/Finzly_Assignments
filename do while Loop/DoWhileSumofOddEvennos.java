public class DoWhileSumofOddEvennos {

	public static void main(String[] args) {
        int sumofodd=0;
        int sumofeven=0;
        int n=1;
        do{
            if(n%2==1){
                sumofodd+=n;
			}
            else{
                sumofeven+=n;
            }
            n++;
        }
        while(n<=50);
		
        System.out.println("Sum of Odd numbers are: "+sumofodd);
        System.out.println("Sum of Even numbers are: "+sumofeven);
	}

}