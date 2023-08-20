public class Sample {
    public static void main(String[] args) {
        long n = 38; 
        long eggs = 1; // Initial number of eggs
        System.out.println("The 1st person holds " + eggs + " eggs.");
        for (long i = 2; i <= n; i++) {
        	
        	eggs= (long)Math.pow(eggs,i)+eggs;

            System.out.println("The " + i + "th person holds " + eggs + " eggs."); 
            
        }
        
        //System.out.println("The " + n + "th person holds " + eggs + " eggs.");
    }
}
