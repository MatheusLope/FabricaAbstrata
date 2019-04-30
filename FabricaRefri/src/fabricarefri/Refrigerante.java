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
public class Refrigerante {
    
    	private String nome;

	public String getName(){
		return nome;
	}

	public void setName(String nome){
		this.nome = nome;
	}
	
	public void abrir(){
		System.out.println("Você abriu uma lata de "+getName());
	}
}
