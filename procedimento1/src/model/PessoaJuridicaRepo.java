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
public class PessoaJuridicaRepo {
    private final ArrayList<PessoaJuridica> pessoaJu = new ArrayList<PessoaJuridica>();
    
    public void inserir(PessoaJuridica pj) {
        pessoaJu.add(pj);
    }
    public void alterar(PessoaJuridica pj) {
        for(int i = 0; i < pessoaJu.size()-1; i++){
            if(pj.getId()== pessoaJu.get(i).getId()) {
                pessoaJu.get(i).setNome(pj.getNome());
                pessoaJu.get(i).setCnpj(pj.getCnpj());
                pessoaJu.get(i).setId(pj.getId());
            }
        }
    }
    public void excluir(int id) {
        pessoaJu.remove(id);
    }
    public PessoaJuridica obter(int id) {
        return pessoaJu.get(id);
    }
    public ArrayList<PessoaJuridica> obterTodos() {
        return pessoaJu;
    }
    public void persistir(String arquivoModel){
        try{
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void recuperar(String arquivoModel){
        try{
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
}
