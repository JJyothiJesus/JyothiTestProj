package com.javaSample.Programs;

//allows us to have more than one methods with same name in a class that differs in signature(parameter)

class MethodOverloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
public class ExampleMethodOverloading  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading();
	       obj.disp('a');
	       obj.disp('a',10);

	}

}
