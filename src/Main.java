import java.util.ArrayList;

public class Main {
	
	public static void main(String args[])
	{
		System.out.println("Provide matrix1 row-wise and matrix2 column wise");
		//matrix 1
		ArrayList<Integer> al = new ArrayList();
		
		for(int i =1; i<7; i++)
		{
			al.add(i);
		}
		
		Matrix1 m = new Matrix1 (3,2, al);
		Matrix1 n = new Matrix1 (3,2, al);
		Matrix2 nCol = new Matrix2 (3,2, al);
		System.out.println(m.toString());
		System.out.println(n.toString());
		System.out.println(nCol.toString());
		System.out.println("Multiplication possible : "+ n.checkIfCompatible(m));
		System.out.println("Addition/Subtraction possible : "+ Plus.simpleAddition(m, n));
		System.out.println(Plus.addition(m, n).toString());
		System.out.println(Subtraction.subtract(m, n).toString());
		//multiplication
		//genrow
		ArrayList<Integer> row = new ArrayList();
		
		for(int i=1; i<4; i++)
		{
			row.add(i);
		}
		ArrayList<ArrayList<Integer>> col = new ArrayList();
		
		for(int i=0; i<3; i++)
		{
			col.add(row);
		}
	}

}
