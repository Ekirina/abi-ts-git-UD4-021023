
public class javabasics5 {

	public static void main(String[] args) {
		
		int a = 0; 
		int b = 1; 
		int c = 2; 
		int d = 3; 
		int vacio;
    
	System.out.println("Los valores iniciales de a, b, c y d son respectivamente: "+a+", "+b+", "+c+" y "+d+". \n");                                                                  
        
        vacio = b;
        b = c;
        c = a;
        a = d;
        d = vacio;
        
        System.out.println("b toma el valor de c: " + b);
        System.out.println("c toma el valor de a: " + c);
        System.out.println("a toma el valor de d: " + a);
        System.out.println("d toma el valor de b: " + d); 
	}

}
