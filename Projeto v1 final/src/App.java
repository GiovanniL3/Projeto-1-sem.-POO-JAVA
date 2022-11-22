import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Variaveis

        int opcaoSuper;
        char respostaSuper = 'S';

        int opcaoA;
        char respostaA = 'S';

        int opcaoB;
        char respostaB = 'S';

        int deleteA;
        int deleteB;

        int EindexA;
        int EopcaoA;
        
        int EindexB;
        int EopcaoB;

        // Arrays
        ArrayList<Pessoa> LISTA_A = new ArrayList<>();
        ArrayList<Pessoa> LISTA_I = new ArrayList<>();

        Scanner leia = new Scanner(System.in);

        // Adicionar: switch case para seleção de aluno ou instrutor//
        while (respostaSuper == 'S') {

            System.out.println("\t     ---AUTO ESCOLA---\n\n");
            System.out.println("\t  ---Escolha uma opção---");
            System.out.println("\t     ==================");
            System.out.println("\t     |  1 - Aluno     |");
            System.out.println("\t     |  2 - Instrutor |");
            System.out.println("\t     |  3 - Sair      |");
            System.out.println("\t     ==================");

            respostaA = 'S';
            respostaB = 'S';

            System.out.print("\n\nDigite a opção desejada:  ");
            opcaoSuper = leia.nextInt();

            // Objetos

            switch (opcaoSuper) {

                case 1: // caso aluno

                    while (respostaA == 'S') { // --Aluno-- //

                        Pessoa a1 = new Aluno(null, null, null, null,
                                null, null, 0, null, 0, 0);

                        // MENU
                        System.out.println("\n\n\t       ---ALUNO---\n\n");
                        System.out.print("\t=========================\n");
                        System.out.print("\t|  1 - Cadastrar        |\n");
                        System.out.print("\t|  2 - Editar           |\n");
                        System.out.print("\t|  3 - Consultar        |\n");
                        System.out.print("\t|  4 - Remover          |\n");
                        System.out.print("\t|  5 - Sair             |\n");
                        System.out.print("\t=========================\n");

                        System.out.print("\nDigite a opção desejada:  ");
                        opcaoA = leia.nextInt();

                        switch (opcaoA) { // --Aluno-- //
                            case 1: // CADASTRO
                                System.out.println("\t\t-----------Cadastro-----------");

                                a1.cadastro();

                                if (a1.getIdade() < 18) {
                                    System.out.print("\nVoce é menor de idade\n");
                                    respostaA = 'N'; // PARADA DE EXECUÇÂO
                                } else if (a1.getCnh() == null && a1.getIdade() < 21) {
                                    System.out.print("\nVoce é menor de 21 anos\n");
                                    respostaA = 'N'; // PARADA DE EXECUÇÂO

                                }

                                LISTA_A.add(a1);

                                break;

                            case 2: // EDIÇÂO//
                                System.out.println("\t\t-----------Editar-----------");

                                for (int i = 0; i < LISTA_A.size(); i++) {

                                    System.out.println("Cadastro => " + i);
                                    LISTA_A.get(i).imprimi();

                                }

                                System.out.println("Qual cadastro deseja editar");
                                EindexA = leia.nextInt();

                                System.out.print("\n\t====================\n");
                                System.out.print("\t|  1 - Nome         |\n");
                                System.out.print("\t|  2 - E-mail       |\n");
                                System.out.print("\t|  3 - Cpf          |\n");
                                System.out.print("\t|  4 - Endereço     |\n");
                                System.out.print("\t|  5 - Telefone     |\n");
                                System.out.print("\t|  6 - Idade        |\n");
                                System.out.print("\t|  7 - Obseravção   |\n");
                                System.out.print("\t|  8 - CNH          |\n");
                                System.out.print("\t=====================\n");

                                System.out.println("\nDigite a opção desejada:   ");
                                EopcaoA = leia.nextInt();

                                switch (EopcaoA) {

                                    case 1: //Nome
                                    System.out.print("Qual será o novo nome?");
                                    LISTA_A.get(EindexA).setNome(leia.next());;
                                        break;
                                    case 2: // email
                                    System.out.print("Qual será o novo e-mail?");
                                    LISTA_A.get(EindexA).setEmail(leia.next());
                                        break;
                                    case 3: // cpf
                                    System.out.print("Qual será o novo CPF?");
                                    LISTA_A.get(EindexA).setCpf(leia.next());
                                        break;
                                    case 4: // endereco
                                    System.out.print("Qual será o novo endereço?");
                                    LISTA_A.get(EindexA).setEndereco(leia.next());
                                        break;
                                    case 5: // telefone
                                    System.out.print("Qual será o novo telefone?");
                                    LISTA_A.get(EindexA).setTelefone(leia.next());
                                        break;
                                    case 6: // idade
                                    System.out.print("Qual será a nova idade?");
                                    LISTA_A.get(EindexA).setIdade(leia.nextInt());
                                        break;
                                    case 7: // obs
                                    System.out.print("Qual será a nova observação?");
                                    LISTA_A.get(EindexA).setObs(leia.next());
                                        break;
                                    case 8: // CNH
                                    System.out.print("Qual será a nova CNH?");
                                    LISTA_A.get(EindexA).setCnh(leia.next());
                                        break;
                                    default:

                                    break;

                                }

                                System.out.println("Cadastro => " + EindexA);
                                LISTA_A.get(EindexA).imprimi();

                                break;

                            case 3: // CONSULTAR//
                                System.out.println("\t\t----------Consultar----------");

                                for (int i = 0; i < LISTA_A.size(); i++) {

                                    System.out.println("Cadastro => " + i);
                                    LISTA_A.get(i).imprimi();

                                }

                                break;

                            case 4: // REMOÇÂO//

                                System.out.println("\t\t-----------Remover-----------");

                                for (int i = 0; i < LISTA_A.size(); i++) {

                                    System.out.println("Cadastro => " + i);
                                    LISTA_A.get(i).imprimi();

                                }

                                System.out.println("Qual numero do cadastro deseja excluir? ");
                                deleteA = leia.nextInt();

                                LISTA_A.remove(deleteA);

                                break;

                            case 5:
                                do { // DESEJA CONTINUAR e repete caso a resposta não seja sim ou não//
                                    System.out.println("\t\t\t---------Sair---------");
                                    System.out.println("\t\t------Deseja continuar (S/N)------");
                                    respostaA = leia.next().toUpperCase().charAt(0);
                                    System.out.println("\n");
                                } while (respostaA != 'S' && respostaA != 'N');

                                break;

                            default:

                                System.out.println("\t\t--------OPÇÂO INVALIDA!!---------");
                                System.out.println("\t\t----------TENTE NOVAMENTE----------");

                                break;
                        }
                    }

                    break; // Final case 1 - case aluno
                // -----------------------------------------------------------------------------------------------------------------------------------------------------------------//
                // -----------------------------------------------------------------------------------------------------------------------------------------------------------------//
                // -----------------------------------------------------------------------------------------------------------------------------------------------------------------//
                case 2: // caso instrutor

                    while (respostaB == 'S') { // --Instrutor-- //

                        Pessoa i1 = new Instrutor(null, null, null, null,
                                null, null, 0, null);

                        // MENU
                        System.out.println("\t\t  ---INSTRUTOR---\n");
                        System.out.println("\t\t --Qual operação deseja executar?--");
                        System.out.print("\t\t===================\n");
                        System.out.print("\t\t|  1 - Cadastrar  |\n");
                        System.out.print("\t\t|  2 - Editar     |\n");
                        System.out.print("\t\t|  3 - Consultar  |\n");
                        System.out.print("\t\t|  4 - Remover    |\n");
                        System.out.print("\t\t|  5 - Sair       |\n");
                        System.out.print("\t\t===================\n");
                        ;

                        System.out.println("\n\t------Digite a opção desejada------");
                        opcaoB = leia.nextInt();

                        switch (opcaoB) { // --Aluno-- //

                            case 1: // CADASTRO//;
                                System.out.println("\t\t----------Cadastro----------");

                                i1.cadastro();

                                if (i1.getIdade() < 18) {
                                    System.out.print("\nVoce é menor de idade\n");
                                    respostaB = 'N'; // PARADA DE EXECUÇÂO
                                } else if (i1.getCnh() == null && i1.getIdade() < 21) {
                                    System.out.print("\nVoce é menor de 21 anos\n");
                                    respostaB = 'N'; // PARADA DE EXECUÇÂO

                                }

                                LISTA_I.add(i1);

                                break;

                            case 2: // EDIÇÂO//
                                System.out.println("\t\t-----------Editar-----------");

                                for (int i = 0; i < LISTA_I.size(); i++) {

                                    System.out.println("Cadastro => " + i);
                                    LISTA_I.get(i).imprimi();
                                    System.out.print("\n");

                                }

                                System.out.println("Qual cadastro deseja editar");
                                EindexB = leia.nextInt();

                                System.out.print("\n\t====================\n");
                                System.out.print("\t|  1 - Nome         |\n");
                                System.out.print("\t|  2 - E-mail       |\n");
                                System.out.print("\t|  3 - Cpf          |\n");
                                System.out.print("\t|  4 - Endereço     |\n");
                                System.out.print("\t|  5 - Telefone     |\n");
                                System.out.print("\t|  6 - Idade        |\n");
                                System.out.print("\t|  7 - Obseravção   |\n");
                                System.out.print("\t|  8 - CNH          |\n");
                                System.out.print("\t=====================\n");

                                System.out.println("\nDigite a opção desejada:   ");
                                EopcaoB = leia.nextInt();

                                switch (EopcaoB) {

                                    case 1: //Nome
                                    System.out.print("Qual será o novo nome?");
                                    LISTA_I.get(EindexB).setNome(leia.next());;
                                        break;
                                    case 2: // email
                                    System.out.print("Qual será o novo e-mail?");
                                    LISTA_I.get(EindexB).setEmail(leia.next());
                                        break;
                                    case 3: // cpf
                                    System.out.print("Qual será o novo CPF?");
                                    LISTA_I.get(EindexB).setCpf(leia.next());
                                        break;
                                    case 4: // endereco
                                    System.out.print("Qual será o novo endereço?");
                                    LISTA_I.get(EindexB).setEndereco(leia.next());
                                        break;
                                    case 5: // telefone
                                    System.out.print("Qual será o novo telefone?");
                                    LISTA_I.get(EindexB).setTelefone(leia.next());
                                        break;
                                    case 6: // idade
                                    System.out.print("Qual será a nova idade?");
                                    LISTA_I.get(EindexB).setIdade(leia.nextInt());
                                        break;
                                    case 7: // obs
                                    System.out.print("Qual será a nova observação?");
                                    LISTA_I.get(EindexB).setObs(leia.next());
                                        break;
                                    case 8: // CNH
                                    System.out.print("Qual será a nova CNH?");
                                    LISTA_I.get(EindexB).setCnh(leia.next());
                                        break;
                                    default:

                                    break;

                                }
                                
                                System.out.println("Cadastro => " + EindexB);
                                LISTA_I.get(EindexB).imprimi();

                                break;

                            case 3: // CONSULTAR//
                                System.out.println("\t\t----------Consultar----------");

                                for (int i = 0; i < LISTA_I.size(); i++) {

                                    System.out.println("Cadastro => " + i);
                                    LISTA_I.get(i).imprimi();
                                    System.out.print("\n");

                                }

                                break;

                            case 4: // REMOÇÂO//
                                System.out.println("\t\t-----------Remover-----------");
                                
                                for (int i = 0; i < LISTA_I.size(); i++) {

                                    System.out.println("Cadastro => " + i);
                                    LISTA_I.get(i).imprimi();

                                }

                                System.out.println("Qual numero do cadastro deseja excluir? ");
                                deleteB = leia.nextInt();

                                LISTA_I.remove(deleteB);

                                break;

                            case 5:
                                do { // DESEJA continuar e repete caso a resposta não seja sim ou não//
                                    System.out.println("\t\t---------Sair---------");
                                    System.out.println("\t\t------Deseja continuar (S/N)------");
                                    respostaB = leia.next().toUpperCase().charAt(0);
                                    System.out.println(" ");
                                } while (respostaB != 'S' && respostaB != 'N');
                                break;

                            default:

                                System.out.println("\t\t--------OPÇÂO INVALIDA!!---------");
                                System.out.println("\t\t----------TENTE NOVAMENTE----------");

                                break;
                        }
                    }

                    break; // Final case 2 - case instrutor

                case 3: // saida Super

                    do { // DESEJA CONTINUAR e repete caso a resposta não seja sim ou não//
                        System.out.println("\t\t---------Sair---------");
                        System.out.println("\t\t------Deseja continuar (S/N)------");
                        respostaSuper = leia.next().toUpperCase().charAt(0);
                        System.out.println(" ");
                    } while (respostaSuper != 'S' && respostaSuper != 'N');
                    break;

                default:

                    System.out.println("\t\t--------OPÇÂO INVALIDA!!----------");
                    System.out.println("\t\t----------TENTE NOVAMENTE----------");

                    break;
            }
        } // **super** final
    }
}