import java.util.ArrayList;

public class Inverse {
	
//	public static Matrix1 getInverse(Matrix1 m)
//	{
//		int determinant = Inverse.getDeterminant(m);
//		if(determinant == 0)
//			return null; //inverse does not exist
//		Matrix2 transpose = new Matrix2()
//	}
	
	//only square matrix can have an inverse matrix
	public static Integer getDeterminant(Matrix1 m) //get determinant of a 3x3 matrix only
	{
		Integer determinant = 0;
		if(m.matrix.size()!=9)
			return null;
		//confirmed a 3x3 matrix
		for(int i = 0; i<3; i++)
		{
			//System.out.println(detBase(m, i));
			if(i==1)
				determinant-=detBase(m, i);
			else
				determinant+=detBase(m, i);
			
			//System.out.println(determinant);
		}
		return determinant;
		
	}
	public static Integer detBase(Matrix1 m, int currIndex) //helper for getDeterminnat
	{
		Integer result = 0; //return
		
		int[] calIndex = new int[2];
		if(currIndex == 0)
			calIndex = new int[] {1,2};
		else if(currIndex == 1)
			calIndex = new int[] {0,2};
		else
			calIndex = new int[] {0,1};

		for(int i = 0; i<=calIndex.length -1; i++)
		{
			if(i==0)
				result += m.matrix.get(calIndex[i] + m.getColumn())* m.matrix.get(calIndex[i+1] + 2*m.getColumn());
			else
				result -= m.matrix.get(calIndex[i] + m.getColumn())* m.matrix.get(calIndex[i-1] + 2*m.getColumn());
		}
		
		return m.matrix.get(currIndex)*result;
	}
	
	public static Matrix1 getTranspose(Matrix1 m)
	{
		ArrayList<Integer> TransposeMatrix = new ArrayList();
		for(int i=0; i<=m.getRow()-1; i++)
		{
			for(int j= 0; j<=m.getColumn()-1; j++)
			{
				Integer value =  m.matrix.get(i+j*m.getColumn());
				TransposeMatrix.add(value);
			}
		}
		return new Matrix1(m.getRow(), m.getColumn(), TransposeMatrix);
	}
	public static Matrix1 getAdjugate(Matrix1 m)
	{
		ArrayList<Integer> AdjugateMatrix = new ArrayList();
		for(int i=0; i<m.matrix.size(); i++)
		{
			
		}
		return null;
	}
	

}
