package Strings;

public class ConcatenateString {

	public static void main(String[] args) {
		//Concatenating five string literals using "+" operator
		 
        String s = "Java"+"Concept"+"Of"+"The"+"Day";
 
        System.out.println(s);       //Output : JavaConceptOfTheDay
 
        //Creating five string objects
 
        String s1 = new String("Java");
 
        String s2 = new String("Concept");
 
        String s3 = new String("Of");
 
        String s4 = new String("The");
 
        String s5 = new String("Day");
 
        //Concatenating five string objects using "+" operator
 
        System.out.println(s1+s2+s3+s4+s5);      //Output : JavaConceptOfTheDay

	}

}
