/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricarefri;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Cliente {
    	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		
		RefrigeranteFactory rf = new RefrigeranteFactory();
		Refrigerante refrigerante = null;

		System.out.println("Qual refrigerante você quer? (K / P)");
		if(ler.hasNextLine()){
			String tipo = ler.nextLine();
			refrigerante = rf.fazerRefrigerante(tipo);
		}

		if(refrigerante != null){
			executar(refrigerante);
		} else System.out.println("Digite K ou P...");
	}

	public static void executar(Refrigerante refri){
		refri.abrir();
	}	    
}
