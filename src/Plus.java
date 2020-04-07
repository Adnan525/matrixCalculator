import java.util.ArrayList;

public class Plus {
	public static boolean simpleAddition(Matrix1 m1, Matrix1 m2)
	{
		if(m1.getColumn() ==  m2.getColumn() && m1.getRow() == m2.getRow())
			return true;
		else
			return false;
	}
	public static Matrix1 addition(Matrix1 m1, Matrix1 m2)
	{
		ArrayList<Integer> m3 = new ArrayList();
		if(Plus.simpleAddition(m1, m2))
		{
			for(int i = 0; i<m1.matrix.size(); i++)
				m3.add(m1.matrix.get(i) + m2.matrix.get(i));
			return new Matrix1(m1.getRow(), m1.getColumn(), m3);
		}
		else
			throw new java.lang.Error("Two matrices may be added or subtracted only if they have the same dimensions");
		
		//NOT USEFUL  BUT WILL COME IN HANDY ON LATER STAGES
//		else
//		{
//			Matrix lessColumn = (m1.getColumn() < m2.getColumn()) ? m1 : m2;
//			Matrix highestColumn = (m1.getColumn() > m2.getColumn()) ? m1 : m2;
//			
//			int diff = Math.abs(m1.getColumn() - m2.getColumn());
//			int highOffset = lessColumn.getColumn(); //how far can I go in the large matrix
//			int highCounter = 0, reachCounter = 0; /* highCounter = reaching highOffset
//												   reachCounter = how many times highcounter reached
//												   highoffset
//												   formula = i + reachCounter*diff
//												   */
//			
//			for(int i = 0; i<lessColumn.matrix.size(); i++)
//			{
//				if((i + reachCounter * diff) > m1.matrix.size()-1 && (i + reachCounter * diff) > m2.matrix.size()-1)
//					break;
//				m3.add(m1.matrix.get(i) + m2.matrix.get(i + reachCounter * diff));
//				highCounter++;
//				if(highCounter == highOffset)
//				{
//					highCounter = 0;
//					reachCounter++;
//					//could be more efficient
//					for(int j = i; j<=diff+i; j++)
//						m3.add(highestColumn.matrix.get(j));
//				}
//			}
//			for(int i : m3)
//				System.out.println(i);
//			return new Matrix(highestColumn.getRow(), highestColumn.getColumn(), m3);
//		}
	
	}

}
