// Create a BMI calculator that reads the user’s weight and height

// providing an option for the user to select which formula to use

// then calculates and displays the user’s body mass index.

// display the BMI categories and their values from the 
// National Heart Lung and Blood Institute
// Import library
import java.util.Scanner;


public class BMICalculator {
int uniType;
int bmicat;
private float weight;
private float height;
private float bmi;

public Scanner userinput = new Scanner(System.in);
//main Function
	public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
	
	//reads user input
	public void readUserData() {
		 int uniType = readUnitType();
		 readMeasurementData(uniType);		
	}
	//prompts user for input
	
	private int readUnitType(){
		while(uniType < 1 || uniType > 2) {
		System.out.println("Which formula will you use Metric(1) or Imperial(2)?");
		uniType = userinput.nextInt();
		}
		return uniType;
	}
	//Decides which system to use
	private void readMeasurementData(int uniType) {
		if(uniType == 1) 
	readMetricData();
		else if (uniType == 2)
	readImperialData();
		
	}
	// assigns user data to each variable
	private void readMetricData() {
		System.out.println("You have chosen Metric Data!\n");
		System.out.println("Please input your weight in kilograms below:");
		float weight = userinput.nextFloat();
		setWeight(weight);
		System.out.println("Please input your height in meters below:");
		float height = userinput.nextFloat();
		setHeight(height);
		uniType= 1;
	}
	//assigns user data to each variable for the appropiate system
	private void readImperialData() {
		System.out.println("You have chosen Imperial Data!\n");
		System.out.println("Please input your weight in pounds below:");
		float weight = userinput.nextFloat();
		setWeight(weight);
		System.out.println("Please input your height in inches below:");
		float height = userinput.nextFloat();
		setHeight(height);
		uniType=2;
	}
	//Calculates the bmi
	public void calculateBmi() {
		 float weight = getWeight();
		 float height = getHeight();
		if(uniType== 2) {
			 bmi = ((weight * 703)/(height * height));
			
		}
		if(uniType== 1) {
			 bmi = ((weight)/(height * height));
			
		}
		calculateBmiCategory(bmi);
	}
	// BMICalculator contains a private instance method determines the user's BMI category
	private int calculateBmiCategory(float bmi) {
		if(bmi<18.5)
			bmicat=1;
		else if(bmi>18.5 && bmi<24.9)
			bmicat=2;
		else if(bmi>25 && bmi<29.9)
			bmicat=3;
		else if(bmi>30)
			bmicat=4;
		return bmicat;
		
	}
	// BMICalculator contains a public instance method called displayBmi that prints the BMI value and category to standard output
	public void displayBmi() {
		System.out.printf("Your BMI is %.2f\n", bmi);
		
		getBmiCategory(bmicat);
		
	}
	
	//MICalculator contains a private instance method called setWeight
	private void setWeight(float weight) {
		if(weight < 0)
			System.exit(0);
		this.weight = weight;
		
	}
	
	public float getWeight() {
		return weight;
	}
	//BMICalculator contains a public instance method called getHeight
	public float getHeight() {
		return height;
	}
	//BMICalculator contains a private instance method called setHeight
	private void setHeight(float height) {
		if(height < 0) {
			System.exit(0);
		}
		this.height= height;
		
	}
	//BMICalculator contains a public instance method called getBmi
	public float getBmi() {
		return bmi;
	}
//BMICalculator contains a public instance method called getBmiCategory
	public void getBmiCategory(int bmicat) {
		System.out.println("Underweight = <18.5\nNormal weight = 18.5–24.9\nOverweight = 25–29.9\nObesity = BMI of 30 or greater\n");
		System.out.printf("Your BMI VALUE is ");
		if(bmicat==1)
        System.out.println("Underweight: Under 18.5");
		if(bmicat==2)
        System.out.println("Normal: 18.5-24.9 ");
		if(bmicat==3)
        System.out.println("Overweight: 25-29.9");
		if(bmicat==4)
        System.out.println("Obese: 30 or over");
	}
}





