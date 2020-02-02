


public class Decrypter {
	// To decrypt user input
	public static void main(int code) {
	int[] Decrypted = new int[4];
	// Assign user input to array
	for(int i = 3; i>=0; i--) {
		Decrypted[i] = code%10;
		code = code/10;
	}
	int swap;
	for(int j = 3; j>=0; j--) {
		// Mathmatical Manipulation
		if(Decrypted[j] < 7) {
			Decrypted[j]= (Decrypted[j]+10)-7;
		}
		else {
			Decrypted[j]= Decrypted[j] -7;
		}
		//Swap Statements
		if(j==1) {
			swap = Decrypted[j];
			Decrypted[j]= Decrypted[3];
			Decrypted[3] = swap;
		}
		
		if(j==0) {
			swap = Decrypted[j];
			Decrypted[j] = Decrypted[2];
			Decrypted[2] = swap;
		}
	}
		System.out.printf("Your new code is ");
		for(int k = 0; k<=3; k++) {
			System.out.printf("%d",Decrypted[k]);
		}
			
		
	}
}

