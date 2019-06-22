import java.util.ArrayList;

public class Calculator {
	
	//have to be in order
	public static Matrix multiply(Matrix m1, Matrix m2)
	{
		if(m1.checkIfCompatible(m2))
		{
			//return matrix
			Matrix result = new Matrix(m1.getColumn(), m2.getRow());
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
