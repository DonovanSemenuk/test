import java.util.Scanner;
public class Project5 {

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	int sum = 0;
	int count = 0;
	final int SENTINEL = -1;
	int initialValue = 3;
	int tempValue;
	int count1 = 0;
	int count2 = 0;
	int count3 = 0;
	int count4 = 0;
	int count5 = 0;
	int positiveCount = 0;
	int negativeCount = 0;
	int noChangeCount = 0;
	
	
	System.out.println("Response Dial Simulator");
	System.out.println("-----------------------");
	System.out.println("Initial setting: " + initialValue);
	System.out.println("Enter the next setting (1-5) or -1 to stop.");
	int data = keyboard.nextInt();
	
		while (data != SENTINEL) {
		sum = sum + data;
		count = count +1;
		tempValue = initialValue;
		
		if (data == 1)
				count1 = count1 + 1;
		else if (data == 2)
			count2 = count2 + 1;
			else if (data == 3)
				count3 = count3 + 1;
			else if (data == 4)
				count4 = count4 + 1;
			else if (data ==5)
				count5 = count5 + 1;
		
		if (data > tempValue) {
			System.out.println("Positive change: " + initialValue + " to " + data);
			positiveCount = positiveCount + 1;
		}
		else if (data < tempValue) {
			System.out.println("Negative change: " + initialValue + " to " + data);
			negativeCount = negativeCount + 1;
		}
		else {
			System.out.println("No change: " + initialValue + " to " + data);
			noChangeCount = noChangeCount + 1;
		}
		System.out.println("Current setting: " + data);
		initialValue = data;
		
			
		System.out.println("Enter the next setting (1-5) or -1 to stop.");
		data = keyboard.nextInt();
	}
		keyboard.close();
		
		System.out.println("");
		System.out.println("Response Summary");
		System.out.println("----------------");
		System.out.println("1 was chosen " + count1 + " time(s).");
		System.out.println("2 was chosen " + count2 + " time(s).");
		System.out.println("3 was chosen " + count3 + " time(s).");
		System.out.println("4 was chosen " + count4 + " time(s).");
		System.out.println("5 was chosen " + count5 + " time(s).");
		System.out.println("");
		System.out.println("Positive changes: " + positiveCount);
		System.out.println("Negative changes: " + negativeCount);
		System.out.println("No changes: " + noChangeCount);
	}
}

