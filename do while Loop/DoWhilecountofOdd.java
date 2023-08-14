public class DoWhilecountofOdd {

	public static void main(String[] args) {
        int c=0;
        int n=1;
        do{
            if(n%2==1){
                c++;
            }
            n++;
        }
        while(n<=25);
		
        System.out.println("Count of odd numbers = "+c);
	}

}