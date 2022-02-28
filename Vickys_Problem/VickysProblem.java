import java.util.*;

public class VickysProblem{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		int timeTaken = 0;
		System.out.println("Enter Distance to travel");
		int distance = sc.nextInt();
		
		while(distance > 0){
			distance -= 5;
			timeTaken += 1;
			if (distance <=0)
				break;

			distance -= 3;
			timeTaken += 2;
			if (distance <=0)
				break;

			distance -= 1;
			timeTaken += 3;
			if (distance <=0)
				break;
		}
	
		System.out.println("The total time taken = " + timeTaken);
	}
}