package utils;

import models.Empresa;
import models.Pessoa;


public class PrintUtils {

    public static String ImprimePessoa(Pessoa pessoa) {

        String pessoaImprime = new String();

        pessoaImprime = "\n";
        pessoaImprime += "------ Dados Pessoais ------" +"\n";
        pessoaImprime += "Nome:       " + pessoa.getNome() + "\n";
        pessoaImprime += "CPF:        " + pessoa.getCpf() + "\n";
        pessoaImprime += "Celular:    " + pessoa.getCelular() + "\n";
        pessoaImprime += "Rua:        " + pessoa.getEndereco().getRua() + "\n";
        pessoaImprime += "Numero:     " + pessoa.getEndereco().getNumero() + "\n";
        pessoaImprime += "Bairro:     " + pessoa.getEndereco().getBairro() + "\n";
        pessoaImprime += "Cidade:     " + pessoa.getEndereco().getCidade() + "\n";
        pessoaImprime += "Estado:     " + pessoa.getEndereco().getEstado() + "\n";
        pessoaImprime += "Referência: " + pessoa.getEndereco().getReferencia() + "\n";
        pessoaImprime += "CEP:        " + pessoa.getEndereco().getCep() + "\n";
        
               
        return pessoaImprime;
    }

    public static String ImprimeEmpresa(Empresa empresa) {

        String empresaImprime = new String();

        empresaImprime = "\n";
        empresaImprime += "------ Dados Da Empresa ------" + "\n";
        empresaImprime += "Nome:          " + empresa.getRazaoSocial() + "\n";
        empresaImprime += "CPF:           " + empresa.getCnpj() + "\n";
        empresaImprime += "Telefone 1:    " + empresa.getContato1() + 
                          " - Telefone 2: " + empresa.getContato2() + "\n";
        empresaImprime += "Rua:           " + empresa.getEndereco().getRua() + 
                          " - Numero:     " + empresa.getEndereco().getNumero() + "\n";
        empresaImprime += " - Bairro:     " + empresa.getEndereco().getBairro() + 
                          " - Cidade:     " + empresa.getEndereco().getCidade() + 
                          " - Estado:     " + empresa.getEndereco().getEstado() + "\n";
        empresaImprime += "Referência:    " + empresa.getEndereco().getReferencia() + "\n";
        empresaImprime += "CEP:           " + empresa.getEndereco().getCep() + "\n";
       
        return empresaImprime;
    }

}
