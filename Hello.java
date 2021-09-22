/*
 * Prime program
 */
public class PrimeCheck {

	public static void main(String[] args) {
		int number = 9;
		int i,flag=0; //prime
		
		for(i=2;i<number;i++) {
			if(number%i==0) {
				flag = 1; // not a prime 				
				break; // it breaks the loop (come out of the loop and execute next stetement after the loop)
			}			
		}//end of the loop
		//System.out.println("i="+i);
		System.out.println("Flag :"+flag);
		if(flag==1)
			System.out.println("Not a Prime");
		else
			System.out.println("Prime number");
	}

}
