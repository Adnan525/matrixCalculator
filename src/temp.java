import java.util.ArrayList;

public class temp{
	public static ArrayList<Integer> convert(String str)
	{
		String[] temp = str.split("."); //limit 0 will discard the last empty string
		System.out.println(temp.length);
	
		ArrayList<Integer> mVal = new ArrayList<>();

		for(int i=0; i<=temp.length-1; i++)
			{
			   System.out.println(temp[i]); 
				mVal.add(Integer.valueOf(temp[i]));
			}

		return mVal;
	}

//	public static void main(String args[])
//	{
//		//ArrayList<Integer> temp = convert("1.2.3.4.5.6.7.8");
//		//System.out.println(temp.get(0));
//		
//		String str = "1-2-3-4-5-6-7-8"; 
//        String[] arrOfStr = str.split("-", 0); 
//  
//        for (String a : arrOfStr) 
//            System.out.println(a);
//	}

}