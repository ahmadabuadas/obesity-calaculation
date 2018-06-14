import java.util.Scanner;

public class Obesity_Calcation {

	public static void main(String[] args) {
      // create Scanner obj to call input from user
		Scanner data = new Scanner(System.in);
		//input the weight in pound
		System.out.println("Enter your weight in pound : ");
		double weight = data.nextDouble();
		//input the hight in inches : 
		System.out.println("Enter your hight in inches : ");
		double hight = data.nextDouble();
		// convert weight to kg
		double weightInKg = weight * 0.45;
		//convert the high to meter
		double highInMeter =  hight* 0.025;
		// calculation Obesity
		double obesity = weightInKg /( highInMeter * highInMeter);
		// convert to int 
		int intObesity = (int) Math.round(obesity);
		System.out.println("your Obesity Number is : " + intObesity);
		 // use if statement to test results
		
		if (intObesity <= 18) {
	        System.out.println("under weight");
		}
		else if (intObesity >18 && intObesity <=25) {
	        System.out.println("Normal weight");
		}
		else if (intObesity >25 && intObesity <=30) {
			System.out.println("Overweight");		
		}
		else if (intObesity >30 && intObesity <=35) {
	        System.out.println("Obese1");
		}
		else if (intObesity > 35 && intObesity <=40) {
	        System.out.println("Obese2");
		}
		else {
	        System.out.println("values not on the Range");

		}
	}

}
