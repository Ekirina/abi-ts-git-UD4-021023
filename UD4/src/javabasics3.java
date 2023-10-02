
public class javabasics3 {

	public static void main(String[] args) {

		int x = 80;
		int y = 20;
		double n = 2.5;
		double m = 5.5;
	
	System.out.print("El valor de las variables x, y, n y m son "+x+ ", "+y+ ", "+n+" y "+m+" respectivamente. \n");	
		
		int sumaEnteros= x+y;
		int restaEnteros= x-y;
		int porEnteros= x*y;
		int divEnteros= x/y;
		int restoEnteros= x%y;
	
	System.out.print("El resultado de la suma, la resta, la multiplicación, la división y el resto entre las variables x e y son: "
	+sumaEnteros+", "+restaEnteros+", "+porEnteros+", "+divEnteros+" y "+restoEnteros+"\n");
		
		double sumaDoubles= n+m;
		double restaDoubles= n-m;
		double porDoubles= n*m;
		double divDoubles= n/m;
		double restoDoubles= n%m;
		
	System.out.print("El resultado de la suma, la resta, la multiplicación, la división y el resto entre las variables n y m son: "
				+sumaDoubles+", "+restaDoubles+", "+porDoubles+", "+divDoubles+" y "+restoDoubles+"\n");
	
		double sumaEyD= x+n;
		double divEyD= y/m;
		double restoEyD= y%m;
		
	System.out.print("El resultado de la suma entre las variables x y n es: "
				+sumaEyD+". El de la división entre y y m es: "+divEyD+". Y el resto entre y y m es: "+restoEyD+". \n");
	
	System.out.println("El doble de la variable x es "+2*x);
	System.out.println("El doble de la variable y es "+2*y);
	System.out.println("El doble de la variable n es "+2*n);
	System.out.println("El doble de la variable m es "+2*m);
	
	System.out.println("La suma de todas las variables es "+x+y+n+m);
	System.out.println("El producto de todas las variables es "+x*y*n*m);




	}

}
