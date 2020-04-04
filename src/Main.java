import java.util.ArrayList;

public class Main {
	
	public static void main(String args[])
	{
		//matrix 1
		ArrayList<Integer> al = new ArrayList();
		
		for(int i =1; i<7; i++)
		{
			al.add(i);
		}
		
		Matrix m = new Matrix (3,2, al);
		Matrix n = new Matrix (3,2, al);
		System.out.println(m.toString());
		System.out.println(n.toString());
		System.out.println("Multiplication possible : "+ n.checkIfCompatible(m));
		System.out.println("Addition/Subtraction possible : "+ Plus.simpleAddition(m, n));
		System.out.println(Plus.addition(m, n).toString());
		System.out.println(Subtraction.subtract(m, n).toString());
	}

}
