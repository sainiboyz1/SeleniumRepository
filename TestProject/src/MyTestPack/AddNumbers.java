package MyTestPack;

public class AddNumbers {
	//Creating a method
	public int addNumbers(int x, int y){
	int addition = x + y;
	return addition;
	}
	public static void main(String  arghs[]){
	int i=10;
	int j=25;
	AddNumbers obj = new AddNumbers();
	int result = obj.addNumbers(i,j);
	
	System.out.println("Sum of x+y = " + result);	
	}

}
