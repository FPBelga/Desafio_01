import models.Cliente;
import models.Empresa;
import models.Endereco;
import models.Vendedor;
import utils.PrintUtils;

public class App {

    public static void main(String[] args) {

        // Inserindo o vendedor
        Vendedor vendedor1 = new Vendedor();
                
        vendedor1.setNome("Felipe Belga Dias");  
        vendedor1.setCpf("075.129.517-52"); 
        vendedor1.setCelular("(21)99567-0844"); 
        vendedor1.setRegiao("Baixada Fluminense"); 

        Endereco vendedorEnd = new Endereco();
     
        vendedorEnd.setRua("Rua Albano Santos Lima");    
        vendedorEnd.setBairro("Boaçu");
        vendedorEnd.setCidade("São Gonçalo");
        vendedorEnd.setEstado("RJ");
        vendedorEnd.setCep("24.465-000");
        vendedorEnd.setReferencia("Perto da garagem de ônibus mauá");
       
        vendedor1.setEndereco(vendedorEnd);
        // Inserindo a empresa 
        Empresa empresa1 = new Empresa();

        empresa1.setRazaoSocial("GOOGLE BRASIL INTERNET LTDA.");  
        empresa1.setCnpj("06.990.590/0001-23"); 
        empresa1.setContato1("(11)2395-8400"); 
        empresa1.setContato2("(11)3797-1128");
       
        Endereco empresaEnd = new Endereco();  

        empresaEnd.setRua("AVENIDA BRIG FARIA LIMA");    
        empresaEnd.setNumero(3477);
        empresaEnd.setBairro(" ITAIM BIBI");
        empresaEnd.setCidade("SAO PAULO");
        empresaEnd.setEstado("SP");
        empresaEnd.setCep("04.538-133");
        empresaEnd.setReferencia("ANDAR 17A20 TSUL217A20");

        empresa1.setEndereco(empresaEnd);
        
        // Inserindo o cliente 
        Cliente cliente1 = new Cliente();

        cliente1.setNome("Angela Maria Aparecida Alves Belga Dias");
        cliente1.setCpf("485.447.912-00");
        cliente1.setCelular("(24)99312-3412");
        cliente1.setConvenio("Carnê Ouro");

        Endereco clienteEnd = new Endereco();  

        clienteEnd.setRua("Rua Geraldo MAximiliano Alves");
        clienteEnd.setNumero(136);
        clienteEnd.setBairro("Cotiara");
        clienteEnd.setCidade("Barra Mansa");
        clienteEnd.setEstado("RJ");
        clienteEnd.setCep("27.492-000");
        clienteEnd.setReferencia("Perto da rua da cancela");
       
        cliente1.setEndereco(clienteEnd);
        
        // Imprimindo o vendedor
        System.out.println(PrintUtils.ImprimePessoa(vendedor1));
        System.out.println(vendedor1.getRegiao());

        // Imprimindo a empresa
        System.out.println(PrintUtils.ImprimeEmpresa(empresa1));
        
        // Imprimindo o cliente
        System.out.println(PrintUtils.ImprimePessoa(cliente1));
        System.out.println(cliente1.getConvenio());
    }

}