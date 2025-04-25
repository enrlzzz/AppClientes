package main;

import java.util.ArrayList;
import java.util.Scanner;


public class AppDoces { 
    
    
    //PUBLIC significa que o método pode ser acessado de qualquer lugar
    //CLASS significa que estamos definindo uma classe


    public static void main(String[] args) { 


    //STATICignifica que o método pertence a classe e não a uma instância específica da classe
    //VOID significa que o métoo não retorna nenhum valor
    //STRING[] args é um parâmetro que permite passar argumentos de linha de comando para o programa

        ArrayList<String> clientes = new ArrayList<>();


    //Lista dinamica para armazenar os nomes dos clientes
    //A array list é uma estruturar de dados que permite armazenar elementos de forma dinaica, ou seja
    //sem precisar definir um tamanho fixo


        int opcao = 0; 
        
        
    //variavel que armazena a opção escolhida pelo usuário do menu
    // mensagem de boas-vindas ao usuário


        try (Scanner scanner = new Scanner(System.in)) {


    //cria um objeto Scanner para capturar entradas de usuário.
        


        System.out.println("Bem vindo ao sistema de cadastro de clientes!");
        System.out.println("Você pode cadastrar e consultar clientes. \n");


    //laço FOR para controlar o menu de opções


        for (;opcao != 3;) { 


    //uso do ; significa que não há inicialização ou incremento, apenas a condição de continuação de laço
    //a SINTAXE do laço FOR é: (inicialização; condição; incremento) { bloco do código }
    //a condição do laço é que a variavel opcao seja deiferente de 3, que significa que o 
    //usuário ainda não escolheu sair.


            System.out.println("Menu:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Consultar Clientes");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();
            
            
    //Lê a opção escolhida


            scanner.nextLine(); 
    //Consome a quebra da linha deixada pelo nextLine().


                switch (opcao) {

                case 1:

                System.out.println("Digite o nome do Cliente: ");
                String nome = scanner.nextLine();
                clientes.add(nome);
                System.out.println("Cliente cadastrado com sucesso! \n");
                break;

                case 2: 
                if (clientes.isEmpty()) {
                    System.out.println("Nenhum cliente cadastrado. \n");
                    } else {
                        System.out.println("\nLista de Clientes: ");
                        for (int i = 0; i < clientes.size(); i++) {
                            System.out.println((i + 1) + ". " + clientes.get(i));                
                        }
                        
                        System.out.println("Saindo...");

                    }
                    break;
                case 3:
                    System.out.println("Saindo....");
                    return;

                    default:
                        System.out.println("Opção inválida");

            }
        }

    }
    
}

}