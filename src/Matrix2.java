import java.util.ArrayList;

public class Matrix2 extends Matrix1 {
	
	ArrayList<Integer> mat2Row = new ArrayList();
	public Matrix2(int r, int c, ArrayList<Integer> v) {
		super(r, c, v);
	}
	
	@Override
	public String toString()
	{
		String mStr = "";
		int counter = 0; //row jump
		int temp = 0; 
		for (int i = 0; i < this.getColumn()*this.getRow(); i+=this.getRow())
		{

			if(temp>=this.getRow())
			{
				break;
			}
			if(counter % this.getColumn() == 0)
				mStr += "|\t";

				mStr += this.matrix.get(i)+ "\t";
				mat2Row.add(this.matrix.get(i));
				counter+=1;
				
				if(counter==this.getColumn())
				{
					counter = 0;
					temp+=1;
					i = temp-this.getRow();
					mStr += "|\n";	
				}
		}
		for(int i : mat2Row)
		{
			System.out.println(i);
		}
		return mStr;
		
	}

}
