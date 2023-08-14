public class printcountofOdd {

	public static void main(String[] args) {
        int c=0;
		for(int n=1; n<=25; n++){
            if(n%2==1){
                c++;
            }
		}
        System.out.println("Count of Odd numbers = "+c);
	}

}