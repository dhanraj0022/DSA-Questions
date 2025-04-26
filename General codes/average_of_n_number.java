import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("How many numbers? : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total_sum = 0;
		for(int i=0; i<n; i++){
		    System.out.println("Enter a number: ");
		    total_sum += sc.nextInt();
		}
		float a = total_sum/n;
		System.out.println("Avg is: " + a);
	}
}
