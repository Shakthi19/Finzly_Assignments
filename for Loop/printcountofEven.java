public class printcountofEven {

	public static void main(String[] args) {
        int c=0;
		for(int n=1; n<=25; n++){
            if(n%2==0){
                c++;
            }
		}
        System.out.println("Count of Even numbers = "+c);
	}

}