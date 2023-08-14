public class DoWhileFibonacciSeries {

	public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.print(a+" "+b);
		int n=2;
        do{
			c=a+b;
			System.out.print(" "+c);
            a=b;
            b=c;
			++n;
		}
		while(n<10);
		
	}
}