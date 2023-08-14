public class Palindrome {

	public static void main(String[] args) {
        int k,sum=0,temp;
		int n=1220;
		temp=n;
		while(n>0){
			k=n%10;
			sum= (sum*10)+k;
			n/=10;}
		if(temp == sum){
			System.out.print("Palindrome number ");
		}
		else{
			System.out.print("Not a Palindrome number ");
		}
			}
}