/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricarefri;

/**
 *
 * @author aluno
 */
public class RefrigeranteFactory {
    public Refrigerante fazerRefrigerante(String tipo){		
		Refrigerante refri = null;	

		if(tipo.equals("K")){
			return new RefrigeranteCola();
		}else if(tipo.equals("P")){
			return new RefrigeranteLaranja();
		}else return null;
	}
}
