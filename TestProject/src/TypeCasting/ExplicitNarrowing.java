package TypeCasting;

/*
When you are converting data from big sized data type to small sized data type,
i.e when you are converting data from right-placed data type to left-placed data type in the above order,
explicit narrowing will be used.
For example, when you are converting double to float or float to int, explicit narrowing will be used.*/

public class ExplicitNarrowing {
	
	 static short methodOne(long l)
	    {
	        int i = (int) l;     //long is explicitly narrowed to int
	        return (short)i;       //int is explicitly narrowed to short
	    }

	public static void main(String[] args) {
		
		 double d = 10.25;
	        float f = (float) d;      //double is explicitly narrowed to float
	        byte b = (byte) methodOne((long) f);    //float is explicitly narrowed to long and short to byte
	        System.out.println(b);
	}

}
