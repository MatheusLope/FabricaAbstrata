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
public class FabricaConcreta2 implements FabricaAbstrata{
    @Override
    public ProdutoAbstratoA createProdutoA() {
        return new ProdutoA2();
    }
    @Override
    public ProdutoAbstratoB createProdutoB() {
        return new ProdutoB2();
    }
}
