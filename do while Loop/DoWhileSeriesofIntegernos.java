public class DoWhileSeriesofIntegernos {

	public static void main(String[] args) {
        int n=1;
        do{
            if(n%2==0){
                System.out.print("-"+n+ " ");
            }
            else{
                System.out.print(n+" ");
            }
            n++;
        }
        while(n<=10);
    }
	}