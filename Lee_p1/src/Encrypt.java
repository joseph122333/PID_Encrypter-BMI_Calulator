
public class Encrypt {
// Encryption method below
	public static void main(int code) {
		// TODO Auto-generated method stub
		System.out.printf("\nYour code is %d\n", code);
		int[] Encrypted = new int[4];
		
		// Loop in user input to array
		for(int i = 3; i>=0; i--) {
			Encrypted[i] = code%10;
			code = code/10;
		}
		int swap;
		for(int j = 3; j>=0; j--) 
		{
			
			
			// Mathematical manipulation
			Encrypted[j]= Encrypted[j]+7;
			Encrypted[j]= Encrypted[j]%10;
			
			
			// Switch variables
			if(j==1) 
			{
				swap = Encrypted[j];
				Encrypted[j]= Encrypted[3];
				Encrypted[3] = swap;
			}
			
			if(j==0) 
			{
				swap = Encrypted[j];
				Encrypted[j] = Encrypted[2];
				Encrypted[2] = swap;
			}
		}
		// Give user new Encrypted Input
		System.out.printf("\nYour new code is ");
		for(int k = 0; k<=3; k++) {
			System.out.printf("%d",Encrypted[k]);
			}
				
			
		}
	}


