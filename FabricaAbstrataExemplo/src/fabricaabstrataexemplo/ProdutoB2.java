/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaabstrataexemplo;

/**
 *
 * @author aluno
 */
public class ProdutoB2 implements ProdutoAbstratoB{
    @Override
    public void interagir(ProdutoAbstratoA a) {
        System.out.println(this.getClass().getNome() + " interage com " + a.getClass().getNome());
    }
}
