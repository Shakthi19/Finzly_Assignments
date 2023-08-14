public class WhilecountofEven {

	public static void main(String[] args) {
        int c=0;
        int n=1;
        while(n<=25){
            if(n%2==0){
                c++;
            }
            n++;
        }
		
        System.out.println("Count of even numbers = "+c);
	}

}