public class WhilecountofOdd {

	public static void main(String[] args) {
        int c=0;
        int n=1;
        while(n<=25){
            if(n%2==1){
                c++;
            }
            n++;
        }
		
        System.out.println("Count of odd numbers = "+c);
	}

}