/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastropoo;

import model.PessoaFisica;
import model.PessoaFisicaRepo;
import model.PessoaJuridica;
import model.PessoaJuridicaRepo;

/**
 *
 * @author Usuario
 */
public class CadastroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PessoaFisicaRepo repo1 = new PessoaFisicaRepo();
        repo1.inserir(new PessoaFisica("00111122200", 35, 001, "Maria Luiza da Silva"));
        repo1.inserir(new PessoaFisica("00122233301", 40, 002, "José da Silva Gonçalves"));

        //repo1.obterTodos().forEach(action);
        for (int i = 0; i < repo1.obterTodos().size(); i++) {
            System.out.println("id:" + repo1.obterTodos().get(i).getId());
            System.out.println("Nome:" + repo1.obterTodos().get(i).getNome());
            System.out.println("CPF:" + repo1.obterTodos().get(i).getCpf());

        }
        PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();
        repo3.inserir(new PessoaJuridica("00111222/0001-99", 003,"Jose enterprise"));
        repo3.inserir(new PessoaJuridica("00222333/0001-88", 004,"Maria enterprise"));
        
        for (int i = 0; i < repo3.obterTodos().size(); i++) {
            System.out.println("id:" + repo3.obterTodos().get(i).getId());
            System.out.println("Nome:" + repo3.obterTodos().get(i).getNome());
            System.out.println("CNPJ:" + repo3.obterTodos().get(i).getCnpj());

        }

    }

}
