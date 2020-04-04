import java.util.ArrayList;

public class Subtraction {

	
	public static Matrix subtract(Matrix m1, Matrix m2)
	{
		ArrayList<Integer> m3 = new ArrayList();
		if(Plus.simpleAddition(m1, m2))
		{
			for(int i = 0; i<m1.matrix.size(); i++)
				m3.add(m1.matrix.get(i) - m2.matrix.get(i));
			return new Matrix(m1.getRow(), m1.getColumn(), m3);
		}
		else
			throw new java.lang.Error("Two matrices may be added or subtracted only if they have the same dimensions");
		
	}
}
