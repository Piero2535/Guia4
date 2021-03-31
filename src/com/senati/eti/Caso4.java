package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		//Caso 4: Lea cinco números enteros, asígnelos en un array, luego muestre: 
				//▪ Cantidad de números pares. 
				//▪ Cantidad de números pares. 
				//▪ El promedio de todos los números.
				//variables
				 // Crear la instancia sc para crear el objeto Scanner
		        Scanner sc = new Scanner(System.in);
		        // Crear la instancia df para crear el objeto DecimalFormat
		       DecimalFormat df = new DecimalFormat("#0.00");
		        //Creamos el arrays vacio 
		        Integer [] numeros = new Integer[5];
		        int suma= 0, pares = 0, inpares = 0;
		        float promedio = 0;
		        
		        for (int i = 1; i <= 5; i++ ) {
		            
		            System.out.print("Ingrese número "+ i +" : ");
		            numeros[i-1] = sc.nextInt();
		            suma = suma + numeros[i-1] ;
		            if ( numeros[i-1] % 2 == 0) pares ++;
		            else inpares ++;
		        }
		        
		        promedio = suma/5f;
		        
		        System.out.println("\n--------------------");
		        System.out.println("Resultados");
		        System.out.println("\n--------------------");
		        System.out.println("Cantidad de números pares   : "+ pares);
		        System.out.println("Cantidad de números inpares : "+ inpares);
		        System.out.println("Promedio de los números     : "+ df.format(promedio));
		    }

		 

		}


