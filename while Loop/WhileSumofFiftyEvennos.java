public class WhileSumofFiftyEvennos {

	public static void main(String[] args) {
        int sum=0,n=1;
        while(n<=50){
            if(n%2==0){
                sum+=n;
			}
            n++;
        }
		
        System.out.println(sum);
	}

}