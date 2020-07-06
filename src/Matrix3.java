import java.util.ArrayList;

public class Matrix3 extends Matrix1 {
	
	ArrayList<Float> floatMatrix = new ArrayList<>();
	public Matrix3(int r, int c, ArrayList<Float> v) {
		super(r, c);
		this.matrix = null;
		this.floatMatrix = v;
		if(this.getColumn() * this.getRow() != this.floatMatrix.size())
			throw new java.lang.Error("Number of values must be same as row*column");
	}
	@Override
	public String toString()
	{
		String mStr = "";
		for (int i = 0; i < this.getColumn()*this.getRow(); i++)
		{
			if(i % this.getColumn() == 0)
				mStr += "|\t";
			
			mStr += this.floatMatrix.get(i)+ "\t";
			
			if(i%this.getColumn() == this.getColumn() - 1)
				mStr += "|\n";
		}
		return mStr;
	}

}
