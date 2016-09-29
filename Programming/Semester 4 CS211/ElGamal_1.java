public class ElGamal_1
{
	public static void main(String args[])
	{
		long y=0;
		long g = 2744;
		long p = 24852977;
		long c1 = 15268076;
		long c2 = 743675; //94156
		long x=0;

		while(y!=8414508)
		{
			x++;
			y = modPow(g,x,p);			
		}
		
		
		//Alice public key is now [P,G,Y] and sends g, p and Y to Bob
		 
		System.out.println("Public Key: "+"(" +p + ","+g + ","+ y + ")");
		System.out.println("Private Key is: " + x);
		
		long M1 = c2 % p;						
		long M2 = modPow(c1,(p)-(1)-(x) ,p);
		long M = M1 * M2;
		
		if(M > p)
		{
			if(M > p)
			{
				M = modPow(M,1,p);
				System.out.print('\n');
				System.out.println("Message M: "+ M);
			}
		}
		
		else
		{
			System.out.print('\n');
			System.out.println("Message M: "+ M);
		}
		
		 
		
		
		
		
	}
	
	public static long modPow(long number, long power, long modulus)
	{
		 if(power==0)
		 return 1;
		 
		 else if (power%2==0) 
		 {
			 long halfpower=modPow(number, power/2, modulus);
			 return modMult(halfpower,halfpower,modulus);
		 }
		 
		 else
		 {
			 long halfpower=modPow(number, power/2, modulus);
			 long firstbit = modMult(halfpower,halfpower,modulus);
			 return modMult(firstbit,number,modulus);
		 }
	}
		 
	public static long modMult(long first, long second, long modulus)
	{
		 if(second==0)
		 return 0;
		 
		 else if (second%2==0) 
		 {
			 long half=modMult(first, second/2, modulus);
			 return (half+half)%modulus;
		 }
		 
		 else
		 {
			 long half=modMult(first, second/2, modulus);
			 return (half+half+first)%modulus;
		 }
	}

}
