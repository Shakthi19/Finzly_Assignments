public class DoWhileSumofFiftyODDnos {

	public static void main(String[] args) {
        int sum=0,n=1;
        do{
            if(n%2==1){
                sum+=n;
			}
            n++;
        }
        while(n<=50);
		
        System.out.println(sum);
	}

}