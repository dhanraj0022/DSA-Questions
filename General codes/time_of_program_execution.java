import java.util.*;
public class Main
{
    public void display(){
        System.out.println("This method will display how much time it takes to execute the program");
    }
	public static void main(String[] args) {
	    Main obj = new Main();
	    long start = System.nanoTime();
	    obj.display();
	    long end = System.nanoTime();
	    long execution = end - start;
	    System.out.println("The execution time is: " + execution);
	}
}
