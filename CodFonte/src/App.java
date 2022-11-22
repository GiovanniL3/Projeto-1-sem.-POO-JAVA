import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception { 

        int opcaoSuper;
        char respostaSuper = 'S';

        int opcaoA;
        char respostaA = 'S'; 

        int opcaoB;
        char respostaB = 'S';

        Scanner leia = new Scanner(System.in);

        //Adicionar: switch casepara seleção de  aluno ou instrutor//
        while(respostaSuper == 'S'){

            System.out.println("\t\t  ---AUTO ESCOLA---\n");
            System.out.println("\t\t  ---Escolha uma opção---");
            System.out.println("\t\t===================");
                System.out.print    ("\t\t|  1 - * Aluno *      |\n" +
                                     "\t\t|  2 - * Instrutor *  |\n" +
                                     "\t\t|  3 - ** Sair ** |\n");
              System.out.println("\t\t ===================");
                                    
            System.out.println("\n\t------Digite a opção desejada------");
            opcaoSuper = leia.nextInt();

            switch(opcaoSuper){

                case 1: // caso aluno
            
                    while (respostaA == 'S') { // --Aluno-- //
                        //MENU
                        System.out.println("\t\t  ---ALUNO---\n");
                        System.out.println("\t\t --Qual operação deseja executar?--");
                        System.out.print    ("\t\t|  1 - Cadastrar  |\n" +
                                        "\t\t|  2 - Editar     |\n" + 
                                        "\t\t|  3 - Consultar  |\n" + 
                                        "\t\t|  4 - Remover    |\n" +
                                        "\t\t|  5 - Sair       |\n");
                        System.out.println("\t\t===================");
                                        
                                        //--------------------------------------------//
                                        System.out.println("\n\t------Digite a opção desejada------");
                                        opcaoA = leia.nextInt();
                                        
                        switch (opcaoA){ // --Aluno-- //
                            case 1: //CADASTRO//;
                                            
                                                        
                                            
                            break;
                                            
                            case 2: //EDIÇÂO//
                            System.out.println("\t\t-----------Editar-----------");
                                            
                                        

                            break;
                                            
                            case 3: //CONSULTAR//
                                System.out.println("\t\t----------Consultar----------");
                                            
                                            
                                            
                            break;
                        
                            case 4: //REMOÇÂO//
                                System.out.println("\t\t-----------Remover-----------");

                            break;
                        
                            case 5:
                            do{ // DESEJA CONTINUAR e repete caso a resposta não seja sim ou não// 
                                System.out.println("\t\t---------Sair---------");
                                System.out.println("\t\t------Deseja continuar (S/N)------");
                                respostaA = leia.next().toUpperCase().charAt(0); //para ler ele ira converter tudo pra MAIUSCULO e leio a primeira letra
                                System.out.println(" ");
                            }while(respostaA != 'S' && respostaA != 'N'); // faz uma vez e pergunta, repetir ate der certo
                            break;
                            
                            default:

                                System.out.println("\t\t--------OPÇÂO INVALIDA!!---------");
                                System.out.println("\t\t----------TENTE NOVAMENTE----------");
                            
                            break;
                        }
                        
                    }

                break; //Final case 1 - case aluno  
//--------------------------------------------------------------------------------------------------------------------------------------------------//
                case 2: // caso instrutor

                    while (respostaB == 'S') { // --Instrutor-- //
                        //MENU
                        System.out.println("\t\t  ---INSTRUTOR---\n");
                        System.out.println("\t\t --Qual operação deseja executar?--");
                        System.out.print    ("\t\t|  1 - Cadastrar  |\n" +
                                        "\t\t|  2 - Editar     |\n" + 
                                        "\t\t|  3 - Consultar  |\n" + 
                                        "\t\t|  4 - Remover    |\n" +
                                        "\t\t|  5 - Sair       |\n");
                        System.out.println("\t\t===================");
                                        
                                        //--------------------------------------------//
                                        System.out.println("\n\t------Digite a opção desejada------");
                                        opcaoB = leia.nextInt();
                                        
                        switch (opcaoB){ // --Aluno-- //
                            case 1: //CADASTRO//;
                                            
                                                        
                                            
                            break;
                                            
                            case 2: //EDIÇÂO//
                            System.out.println("\t\t-----------Editar-----------");
                                            
                                        

                            break;
                                            
                            case 3: //CONSULTAR//
                                System.out.println("\t\t----------Consultar----------");
                                            
                                            
                                            
                            break;
                        
                            case 4: //REMOÇÂO//
                                System.out.println("\t\t-----------Remover-----------");

                            break;
                        
                            case 5:
                            do{ // DESEJA CONTINUAR e repete caso a resposta não seja sim ou não// 
                                System.out.println("\t\t---------Sair---------");
                                System.out.println("\t\t------Deseja continuar (S/N)------");
                                respostaB = leia.next().toUpperCase().charAt(0); //para ler ele ira converter tudo pra MAIUSCULO e leio a primeira letra
                                System.out.println(" ");
                            }while(respostaB != 'S' && respostaB != 'N'); // faz uma vez e pergunta, repetir ate der certo
                            break;
                            
                            default:

                                System.out.println("\t\t--------OPÇÂO INVALIDA!!---------");
                                System.out.println("\t\t----------TENTE NOVAMENTE----------");
                            
                            break;
                        }
                    }

                break; // Final case 2 - case instrutor

                case 3: //saida Super

                    do{ // DESEJA CONTINUAR e repete caso a resposta não seja sim ou não// 
                        System.out.println("\t\t---------Sair---------");
                        System.out.println("\t\t------Deseja continuar (S/N)------");
                        respostaSuper = leia.next().toUpperCase().charAt(0); //para ler ele ira converter tudo pra MAIUSCULO e leio a primeira letra
                        System.out.println(" ");
                    }while(respostaSuper != 'S' && respostaSuper != 'N'); // faz uma vez e pergunta, repetir ate der certo
                break;
                
                default:

                    System.out.println("\t\t--------OPÇÂO INVALIDA!!----------");
                    System.out.println("\t\t----------TENTE NOVAMENTE----------");
                
                break;
            }    
        }//  **super** final
    }
}