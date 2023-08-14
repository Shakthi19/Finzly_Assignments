public class DoWhileOddorEven {

	public static void main(String[] args) {
        System.out.println("Odd numbers are:");
		int n=1;
		do{
			if(n%2==1){
				System.out.println(n);
			}
			n++;
		}
		while(n<=100);
		int k=1;
        System.out.println("Even numbers are:");
		do{
			if(k%2==0){
				System.out.println(k);
			}
			k++;
		}
		while(k<=100);
	}

}