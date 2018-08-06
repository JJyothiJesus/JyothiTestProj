package TypeCasting;


/*Explicit down Casting is used to change the type of object from super class type to sub class type.
i.e you have to explicitly convert an object of super class type to an object of sub class type. For example,*/

class A1
{
    int i = 10;
}
 
class B1 extends A1
{
    int j = 20;
}
 
class C1 extends B1
{
    int k = 30;
}
 
class D1 extends C1
{
    int m = 40;
}
public class ExplicitDownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
        B1 b = (B1) a;   //A type is explicitly downcasted to B type
        C1 c = (C1) a;   //A type is explicitly downcasted to C type
        D1 d = (D1) a;   //A type is explicitly downcasted to D type
        B1 b1 = new B1();
        D1 d1 = (D1) b1;  //B type is explicitly downcasted to D type
        d1 = (D1) new C1();  //C type is explicitly downcasted to D type
	}

}
