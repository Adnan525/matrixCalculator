import java.util.ArrayList;

public class Calculator {
	
	//have to be in order
	public static Matrix multiply(Matrix m1, Matrix m2)
	{
		if(m1.checkIfCompatible(m2)) // check if multiplying is possible
		{
			ArrayList<Object[]> mat1Row = new ArrayList();
			ArrayList<Integer> row = new ArrayList();
			for(int i =0; i <= m1.matrix.size()-1; i++)
			{
				if(i%m1.getColumn() == m1.getColumn()-1)
				{
					row.add(m1.matrix.get(i));//has to be the last entry, i%m1.getColumn() 
					Object[] temp = row.toArray();
					mat1Row.add(temp);
					row.clear();
				}
				else
				{
					row.add(m1.matrix.get(i));
				}
			} //have first matrix sorted according to rows
			
			ArrayList<ArrayList<Integer>> mat2Col = new ArrayList(); //column wise
			for(int i = 0; i <= m2.getRow(); i+=m2.getRow())
			{
				int counter = 0; //keep track of columns
				ArrayList<Integer> column = new ArrayList();
				if(i+m2.getRow() > m2.matrix.size()-1)
				{
					counter++;
					column.add(m2.matrix.get(i)); //has to be the last entry, i%m1.getColumn() 
					mat2Col.add(column);
					column.clear();
					if(i == m2.matrix.size()-1)
						break;
					else
						i = counter; //resetting
				}
				else
				{
					column.add(m2.matrix.get(i));
				}
			}
			for(Object[] i : mat1Row)
			{
				System.out.println(i.toString());
			}
			for(ArrayList<Integer> i : mat2Col)
			{
				System.out.println(i);
			}
		}
		return null;
	}
	
	public ArrayList<Integer> genRow(ArrayList<Integer> r, ArrayList<ArrayList<Integer>> c)
	{
		ArrayList<Integer> temp = new ArrayList();
		int returnNumber = r.size();
		for(int i=0; i<returnNumber; i++)
		{
			
		}
	}

//	public static void main(String[] args) {
//		
//		ArrayList<Integer> al = new ArrayList();
//		
//		for(int i =1; i<7; i++)
//		{
//			al.add(i);
//		}
//		
//		Matrix m = new Matrix (3,2, al);
//		Matrix n = new Matrix (2,3, al);
//		Calculator.multiply(m, n);
//
//	}

}
