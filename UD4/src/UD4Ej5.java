
public class UD4Ej5 {
	public static void main(String[] args) {
		int a = 35, b = 14, c = 3, d = 64;
		System.out.println("A = "+ a);
		System.out.println("B = "+ b);
		System.out.println("C = "+ c);
		System.out.println("D = "+ d);
		System.out.println();
		int help=b;
		
		b = c;
		System.out.println("B toma el valor de C, ahora B= "+b);

		c = a;
		System.out.println("C toma el valor de A, ahora C= "+c);

		a = d;
		System.out.println("A toma el valor de D, ahora A= "+a);

		d = help;
		System.out.println("D toma el valor de B, ahora D= "+d);

	}
}
