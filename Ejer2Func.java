import java.util.Scanner;

public class Ejer2Func {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// dado un numero se mostrara el numero de la secuenccia 
		//fibonnacci que corresponda comenzando desde 0
		int N;
		int resu;
		Scanner sc=new Scanner (System.in);
		System.out.println("Ingrese la posicion de la secuencia Fibonnacci que busca");
		N=sc.nextInt();
		resu=Fibo(N);           //invoco la funcion
		System.out.println("El numero correspondiente a la posicion: "+N+" en la secuencia Fibonnacci es: "+resu);

	}
	static int Fibo(int z){  //funcion destinada a calcular la secuencia
		int a=0;
		int b=1;
		int c=0;
		int cont=2;
		//si es 1
		if(z==1){
			c=0;
		}
		else{
			//si es 2
			if(z==2){
				c=b;
			}
			else{
				//si es mayor a 2
				while(cont<=z){
					c=a+b;
					b=a;
					a=c;
					cont=cont+1;
				}
			}
	}return c;

 }
}