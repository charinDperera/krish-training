import java.util.*;

public class VickysProblem2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		int timeTaken = 0;
		System.out.println("Enter Distance to travel");
		int distance = sc.nextInt();
		
		while(distance > 0){
			if (distance >= 5){
				distance -= 5;
				timeTaken += 3;
			}

			if (distance >= 3){
				distance -= 3;
				timeTaken += 2;
			}

			if (distance >= 1){
				distance -= 1;
				timeTaken += 3;
			}
		}
	
		System.out.println("The total time taken = " + timeTaken);
	}
}