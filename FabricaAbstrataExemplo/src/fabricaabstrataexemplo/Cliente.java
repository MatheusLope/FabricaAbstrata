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
public class Cliente {
    private ProdutoAbstratoA produtoA;
    private ProdutoAbstratoB produtoB;

    Cliente(FabricaAbstrata fabrica) {
        produtoA = fabrica.createProdutoA();
        produtoB = fabrica.createProdutoB();
    }

    void executar() {
        produtoB.interagir(produtoA);
    }
}
