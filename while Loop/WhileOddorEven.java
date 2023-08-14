public class WhileOddorEven {

	public static void main(String[] args) {
        System.out.println("Odd numbers are:");
		int n=1;
		while(n<=100){
			if(n%2==1){
				System.out.println(n);
			}
			n++;
		}
		int k=1;
        System.out.println("Even numbers are:");
		while(k<=100){
			if(k%2==0){
				System.out.println(k);
			}
			k++;
		}
	}

}