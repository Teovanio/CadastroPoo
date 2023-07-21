/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PessoaFisicaRepo {
    private final ArrayList<PessoaFisica> pessoaFi = new ArrayList<PessoaFisica>();
    
    public void inserir(PessoaFisica pf){
        pessoaFi.add(pf);
    }
    public void alterar(PessoaFisica pf){
        for (int i = 0; i < pessoaFi.size()-1; i++) {
            if (pf.getId()== pessoaFi.get(i).getId()) {
                pessoaFi.get(i).setNome(pf.getNome());
                pessoaFi.get(i).setIdade(pf.getIdade());
                pessoaFi.get(i).setCpf(pf.getCpf());
            }
        }
    }
    public void excluir(int id){
        pessoaFi.remove(id);
    }
    public PessoaFisica obter(int id) {
        return pessoaFi.get(id);
    }
    public ArrayList<PessoaFisica> obterTodos() {
        return pessoaFi;
    }
    
    public void recuperar(String arquivoModel) throws Exception{
        try{
        
        }
        catch(Exception e){
            throw new Exception("Exception message");
        }
    }
    public void persistir(String arquivoModel) throws Exception{
        try{
        
        }
        catch(Exception e){
            throw new Exception("Exception message");
        }
    }
}