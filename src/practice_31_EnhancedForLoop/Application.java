package practice_31_EnhancedForLoop;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {3, 6, 2, 4, 1};
		
		int total = 0;
		
		// kind of day _ variable to store _ name of the obj
		for(int x: array){
			total+= x;
			System.out.print(total + " ");
		}
		
		System.out.println("The total is : " +total);
		
	}

}
