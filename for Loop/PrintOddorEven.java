public class PrintOddorEven {

	public static void main(String[] args) {
        System.out.println("Odd numbers are:");
		for(int n=1; n<=100; n++){
			if(n%2==1){
				System.out.println(n);
			}
		}
        System.out.println("Even numbers are:");
		for(int n=1; n<=100; n++){
			if(n%2==0){
				System.out.println(n);
			}
		}
	}

}