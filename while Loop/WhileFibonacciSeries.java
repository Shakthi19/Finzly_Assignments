public class WhileFibonacciSeries {

	public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.print(a+" "+b);
		int n=2;
		while(n<10){
			c=a+b;
			System.out.print(" "+c);
            a=b;
            b=c;
			++n;
		}
		
	}
}