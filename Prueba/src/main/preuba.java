package main;

import java.util.Scanner;

public class preuba {

	public preuba() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tc = new Scanner(System.in);
        
        Scanner scan = new Scanner(System.in);
		int[]v1;
		int[]v2;
		int[]v3;
		int[]v4;
		int n,m,num,suma=0,sum2=0;
		double z,pr = 1,productomod=0;
		System.out.println("Ingrese la cantidad del primer arreglo");
		n=scan.nextInt();
		do {
		System.out.println("Ingrese la cantidad del segundo arreglo");
		m=scan.nextInt();}
		while(m>n || m<n);
		v1= new int[n];
		v2= new int[n];
		v3= new int[n];
		v4= new int[n];
		for (int i = 0;i<v1.length;i++ ) 
		{
			System.out.println("Ingrese el numero "+(i+1)+" del arreglo A:");
			num = scan.nextInt();
			v1[i]=num;
		}
		
		for (int i = 0;i<v2.length;i++ ) 
		{
			System.out.println("Ingrese el numero "+(i+1)+" del arreglo B:");
			num = scan.nextInt();
			v2[i]=num;
		}
		for (int i = 0;i<v3.length;i++ ) 
		{
			v3[i]+= (v3[i]*v2[i]);
			System.out.println(v3[i]);
			suma+=v3[i];
			pr*=v4[i];
			sum2+=Math.pow(v3[i], 2);
			productomod= (int) Math.sqrt(sum2);
			
		}
		z=pr/productomod;
		System.out.println("Producto de los arreglos: "+pr);
		System.out.println("Producto punto es: "+suma);
		System.out.println("El producto modulo es:"+productomod);
		System.out.println("El valor de z="+z);
	}

}


