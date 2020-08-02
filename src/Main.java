import java.util.ArrayList;

public class Main {
	
	public static void main(String args[])
	{
		System.out.println("Provide matrix1 row-wise and matrix2 column wise");
		System.out.println();
		//matrix 1
		ArrayList<Integer> al = new ArrayList();
		
//		for(int i =5; i<14; i++)
//		{
//			al.add(i);
//		}
		al.add(4);
		al.add(7);
		al.add(2);
		al.add(6);
//		al.add(0);
//		al.add(-2);
//		al.add(0);
//		al.add(1);
//		al.add(1);
//		al.add(6);
//		al.add(1);
//		al.add(1);
//		al.add(4);
//		al.add(-2);
//		al.add(5);
//		al.add(2);
//		al.add(4);
//		al.add(-2);
//		al.add(5);
//		al.add(2);
//		al.add(4);
//		al.add(-2);
//		al.add(5);
//		al.add(2);
//		al.add(2);
		
		Matrix1 m = new Matrix1 (2,2, al);
//		Matrix1 n = new Matrix1 (2,3, al);
//		Matrix2 nCol = new Matrix2 (3,2, al);
//		System.out.println(m.toString());
//		System.out.println(n.toString());
//		System.out.println(nCol.toString());
//		System.out.println("Multiplication possible : "+ n.checkIfCompatible(m));
//		System.out.println("Addition/Subtraction possible : "+ Plus.simpleAddition(m, n));
//		System.out.println(Plus.addition(m, n).toString());
//		System.out.println(Subtraction.subtract(m, n).toString());
		//multiplication
		System.out.println(m);
//		System.out.println();
//		System.out.println(Inverse.getTranspose(m));
		
		//multiplication
//		System.out.println(Multiplication.multiply(m, n));
//		System.out.println(Inverse.getDeterminant(m));
//		System.out.println(Inverse.getSubMatrix(Inverse.getTranspose(m), 2));
		System.out.println();
		System.out.println("Inverse");
		System.out.println(Inverse.getInverse(m));
	}

}
