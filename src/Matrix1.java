import java.util.ArrayList;

public class Matrix1 {
	//constructor with r and c or,
	//constructor with r,c and arrayList
	
	//row * column
	private int column;
	private int row;
	ArrayList<Integer> matrix = new ArrayList(); // row wise
	
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
	
	public Matrix1(int r, int c)
	{
		this.setColumn(c);
		this.setRow(r);
	}
	
	public Matrix1(int r, int c, ArrayList<Integer> v)
	{
		this.setColumn(c);
		this.setRow(r);
		this.matrix = v;
		if(this.getColumn() * this.getRow() != this.matrix.size())
			throw new java.lang.Error("Number of values must be same as row*column");
	}
	
	// pre multiply this to the given matrix
	public boolean checkIfCompatible(Matrix1 m)
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
}
