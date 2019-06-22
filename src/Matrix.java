import java.util.ArrayList;

public class Matrix {
	//row * column
	private int column;
	private int row;
	ArrayList<Integer> matrix = new ArrayList();
	
	public int getColumn()
	{
		return this.column;
	}
	public void setColumn(int c)
	{
		this.column = c;
	}
	public int getRow()
	{
		return this.row;
	}
	public void setRow(int r)
	{
		this.row = r;
	}
	
	public Matrix(int r, int c)
	{
		this.setColumn(c);
		this.setRow(r);
	}
	
	public Matrix(int r, int c, ArrayList<Integer> v)
	{
		this.setColumn(c);
		this.setRow(r);
		this.matrix = v;
		if(this.getColumn() * this.getRow() != this.matrix.size())
			throw new java.lang.Error("Number of values must be same as row*column");
	}
	
	// pre multiply this to the given matrix
	public boolean checkIfCompatible(Matrix m)
	{
		return (this.getColumn() == m.getRow()) ? true : false;
	}
	
	public String toString()
	{
		String mStr = "";
		for (int i = 0; i < this.getColumn()*this.getRow(); i++)
		{
			if(i % this.getColumn() == 0)
				mStr += "|\t";
			
			mStr += this.matrix.get(i)+ "\t";
			
			if(i%this.getColumn() == this.getColumn() - 1)
				mStr += "|\n";
		}
		return mStr;
	}
	
	//test
	
//	public static void main(String args[])
//	{
//		//matrix 1
//		ArrayList<Integer> al = new ArrayList();
//		
//		for(int i =1; i<7; i++)
//		{
//			al.add(i);
//		}
//		
//		Matrix m = new Matrix (3,2, al);
//		Matrix n = new Matrix (3,2, al);
//		System.out.println(m.toString());
//		System.out.println(n.toString());
//		System.out.println(n.checkIfCompatible(m));
//	}
}
