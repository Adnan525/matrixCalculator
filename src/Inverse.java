import java.util.ArrayList;

public class Inverse {
	
	public static Matrix3 getInverse(Matrix1 m)
	{
		ArrayList<Float> inverse = new ArrayList<>();
		int determinant = Inverse.getDeterminant(m);
		if(determinant == 0)
			return null; //inverse does not exist
		Matrix1 temp = Inverse.getAdjugate(Inverse.getTranspose(m));
		for(Integer i:temp.matrix)
		{
			inverse.add((float)i/determinant);
		}
		return new Matrix3(m.getRow(), m.getColumn(), inverse);
	}
	
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
	
	public static Matrix1 getTranspose(Matrix1 m) //works for all
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
		final Matrix1 test = m;
		ArrayList<Integer> adjugateMatrix = new ArrayList();
		for(int i=0; i<m.matrix.size(); i++)
		{
			if(i%2==1) //fixing the signs
				adjugateMatrix.add(-1 * Inverse.getMinorDeterminant(Inverse.getSubMatrix(test, i)));
			else
				adjugateMatrix.add(Inverse.getMinorDeterminant(Inverse.getSubMatrix(test, i)));
		}
		return new Matrix1(m.getRow(),m.getColumn(), adjugateMatrix);
	}
	
	
	public static Matrix1 getSubMatrix(Matrix1 m, int n) //works for everything
	{
		int c = m.getColumn();
		
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i=0; i<m.matrix.size(); i++) //using this so the function won't change the main matrix that has been passed to it. 
		{
			temp.add(1); // add 1 to everything, if null required change to -1
		}
		
		//part 1
		//backward
		for(int i=n; i>=0; i-=c)
		{
			temp.set(i, -1);
		}
		//forward
		for(int i=n; i<=temp.size()-1; i+=c)
		{
			temp.set(i, -1);
		}
		
		//part 2
		if(n%c==0) //n is at the beginning of  the column
		{
			for(int i=n; i<=n+c-1; i++)
			{
				temp.set(i, -1);
			}
		}
		else if(n%c==c-1) //n is at the end
		{
			for(int i=n; i>=n-c+1; i--)
			{
				temp.set(i, -1);
			}
		}
		else //n is in the middle
		{
			for(int i=n-(n%c); i<=(n-(n%c))+c-1; i++) //refer to notes
			{
				temp.set(i, -1);
			}
		}
		
		//removing null
		ArrayList<Integer> result =  new ArrayList();
		for(int i=0; i<m.matrix.size(); i++)
		{
			if(temp.get(i) != -1)
			{
				result.add(m.matrix.get(i));
			}
		}
		int newCol = (int)Math.sqrt(result.size());
		return new Matrix1(newCol, newCol, result);
	}
	public static Integer getMinorDeterminant(Matrix1 m) //works for 2x2 matrix
	{
		if(m.matrix.size()!=4)
			return null;
		return m.matrix.get(0)*m.matrix.get(3)-m.matrix.get(1)*m.matrix.get(2);
	}
	

}
