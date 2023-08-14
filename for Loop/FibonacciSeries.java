public class FibonacciSeries {

	public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.print(a+" "+b);
		for(int n=2; n<10; ++n){
            c=a+b;
			System.out.print(" "+c);
            a=b;
            b=c;
			}
					}

	}