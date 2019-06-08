package PojectFinal;
import java.util.ArrayList;
import java.util.Scanner;
public class JogosEletronicos {

	static Scanner inic;
	public static void main(String[] args) {
				
		System.out.println("\t\t\tE-SPORT - CYBERATLETA"); 
				
		menu();
	}
	
	public static void menu(){
        int opcao = 0;
		ArrayList<Atleta> cyber = new ArrayList<>();
		inic = new Scanner(System.in);
		
		try{
			do{
	
				System.out.println("\t\t---------------MENU PRINCIPAL---------------\n");
				System.out.println("1- INSERIR ATLETA");
				System.out.println("2- ALTERAR ATLETA");
				System.out.println("3- REMOVER ATLETA");
				System.out.println("4- BUSCAR ATLETA");
				System.out.println("5- IMPRIMIR DADOS");
				System.out.println("6- LISTAR DADOS");
				System.out.println("0- SAIR\n");
				System.out.println("Digite a opção desejada: ");
				opcao = inic.nextInt();
				inic.nextLine();
				switch(opcao){
					case 1:
						cadastrar(cyber);
						break;
					case 2:
						alterar(cyber);
						break;
					case 3:
						remover(cyber);
						break;
					case 4:
						buscar(cyber);
						break;
					case 5:
						imprimir(cyber);
						break;
					case 6:
						listar(cyber);
						break;
					case 0:
						System.out.println("Programa Finalizado.");
						break;
					default:
						System.out.println("Opção inválida! Insira um número válido!\n");
						break;
				}
					
			}while(opcao!=0);
		}catch(Exception erro){
			System.out.println("Opção inválida! Insira um número válido!\n");
			menu();
		}
	}
	public static void cadastrar(ArrayList<Atleta> cyber){
		int i;
		String nome, equipe, pais, jogo;
		double salario;
		int idade, tempo;
		
		System.out.println("CADASTRO DE ATLETAS\n");
		System.out.println("Digite a quantidade de Atletas que deseja cadastrar: ");
		int quant = inic.nextInt();
		inic.nextLine();
		
		for(i=0;i<quant;i++){
			Atleta p = new Atleta();
			
			System.out.println("Nome do Atleta:");
			nome = inic.nextLine();
			if(!matchesOnlyText(nome)){
				System.out.println("Não é aceito a inserção de números.");
				System.out.println("Nome do Atleta:");
				nome = inic.nextLine();
			}
			p.setNome(nome);
			
			System.out.println("Jogo do Atleta:");
			jogo = inic.nextLine();
			p.setJogo(jogo);
			
			System.out.println("Nome da equipe:");
			equipe = inic.nextLine();
			if(!matchesOnlyText(equipe)){
				System.out.println("Não é aceito a inserção de números.");
				System.out.println("Nome da Equipe:");
				equipe = inic.nextLine();
			}
			p.setEquipe(equipe);
			
			System.out.println("Pais do Atleta:");
			pais = inic.nextLine();
			if(!matchesOnlyText(pais)){
				System.out.println("Não é aceito a inserção de números.");
				System.out.println("Pais do Atleta:");
				pais = inic.nextLine();
			}
			p.setPais(pais);
                       
                        do{
                            System.out.println("Salario do Atleta:");
                            System.out.println("Obs: Salário a partir de 6000.\n");
                            salario = Double.parseDouble(inic.nextLine());
                        }while(salario<6000);
                        p.setSalario(salario);

			System.out.println("Idade do Atleta:");
			idade = Integer.parseInt(inic.nextLine());
			p.setIdade(idade);
			
			System.out.println("Tempo como profissional do Atleta:");
			tempo = Integer.parseInt(inic.nextLine());
			p.setTempo(tempo);
			
			cyber.add(p);
			System.out.println("\n");
		}
		
	}

	public static void alterar(ArrayList<Atleta> cyber){ 
		String nome;
		int op;
		System.out.println("Digite o nome do Atleta que deseja alterar: ");
		nome = inic.nextLine();
		if(!matchesOnlyText(nome)){
			System.out.println("Não é aceito a inserção de números.");
			System.out.println("Digite o nome do Atleta que deseja alterar: ");
			nome = inic.nextLine();
		}
                
                Atleta p = new Atleta();
		int indice = -1;
                for(int i=0;i<cyber.size();i++){
                   
                        
			
                        if(cyber.get(i).getNome().equals(nome)){
                            indice = i;
                               
			}else{
				System.out.println("Nome de Atleta inexistente ou nenhum Atleta cadastrado.");
			} 
		}
                
                if (indice != -1){
                            
				System.out.println("\nNome: " +cyber.get(indice).getNome());
				System.out.println("Jogo: " +cyber.get(indice).getJogo());
				System.out.println("Equipe: " +cyber.get(indice).getEquipe());
				System.out.println("País: " +cyber.get(indice).getPais());
				System.out.println("Salario: " +cyber.get(indice).getSalario());
				System.out.println("Idade: " +cyber.get(indice).getIdade());
				System.out.println("Tempo: " +cyber.get(indice).getTempo()+"\n");
				
				System.out.println("Deseja alterar este Atleta?");
				System.out.println("1- Sim");
				System.out.println("2- Não");
				op = inic.nextInt();
				inic.nextLine();
				
				if(op==1){
					System.out.println("Nome do Atleta:");
					String Nome = inic.nextLine();
					if(!matchesOnlyText(Nome)){
						System.out.println("Não é aceito a inserção de números.");
						System.out.println("Nome do Atleta:");
						nome = inic.nextLine();
                                                p.setNome(nome);
					}else p.setNome(Nome);
					
					System.out.println("Jogo do Atleta:");
					String jogo = inic.nextLine();
					p.setJogo(jogo);
					
					System.out.println("Nome da equipe do Atleta:");
					String equipe = inic.nextLine();
					if(!matchesOnlyText(equipe)){
						System.out.println("Não é aceito a inserção de números.");
						System.out.println("Nome da equipe:");
						equipe = inic.nextLine();
					}
					p.setEquipe(equipe);
					
					System.out.println("Pais do Atleta:");
					String pais = inic.nextLine();
					if(!matchesOnlyText(pais)){
						System.out.println("Não é aceito a inserção de números.");
						System.out.println("Pais do Atleta:");
						pais = inic.nextLine();
					}
					p.setPais(pais);
                                        
                                        double salario;
                                        do{
                                            
                                            System.out.println("Salario do Atleta:");
                                            System.out.println("Obs: Salário a partir de 6000.\n");
                                            salario = Double.parseDouble(inic.nextLine());
                                            
                                        }while(salario<6000);
                                        p.setSalario(salario);
					
					
					System.out.println("Idade do Atleta:");
					int idade = Integer.parseInt(inic.nextLine());
					p.setIdade(idade);
					
					System.out.println("Tempo como profissional do Atleta:");
					int tempo = Integer.parseInt(inic.nextLine());
					p.setTempo(tempo);
					System.out.println("\n");
				}else{
					System.out.println("\nAlteração cancelada.\n");
				}
                                cyber.remove(indice);
				cyber.add(indice, p);
                }else{
                    System.out.println("O Atleta não foi encontrado!");
                }
                
                
	}
	
	public static void remover(ArrayList<Atleta> cyber){
		Atleta a = new Atleta();
		
		
				System.out.println("Digite o nome do Atleta a ser removido: ");
				String nome = inic.nextLine();
                                inic.nextLine();
				
				for(int i=0;i<cyber.size();i++){
					if(cyber.get(i).getNome().equals(nome)){
						System.out.println("\nNome: " +cyber.get(i).getNome());
						System.out.println("Jogo: " +cyber.get(i).getJogo());
						System.out.println("Equipe: " +cyber.get(i).getEquipe());
						System.out.println("País: " +cyber.get(i).getPais());
						System.out.println("Salário: " +cyber.get(i).getSalario());
						System.out.println("Idade: " +cyber.get(i).getIdade());
						System.out.println("Tempo: " +cyber.get(i).getTempo());
						System.out.println("\n\n");
						
						System.out.println("Deseja remover este Atleta?");
						System.out.println("1- Sim");
						System.out.println("2- Não");
						int op1 = inic.nextInt();
						
						if(op1==1){
							cyber.remove(i);
							System.out.println("\nAtleta removido com sucesso.\n");
								
						}else{
							System.out.println("\nRemoção de Atleta cancelada.\n");
							
						}
					}
		
	}
     }
	
	public static void buscar(ArrayList<Atleta> cyber){
		System.out.println("BUSCA DE ATLETAS\n");
		System.out.println("1- Buscar por nome");
		System.out.println("2- Buscar por pais");
                System.out.println("3- Buscar por jogo");
		int op = inic.nextInt();
		inic.nextLine();
		
		switch(op){
			case 1:
				System.out.println("Digite o nome do Atleta:");
				String frase = inic.nextLine();
				
				for(int i=0;i<cyber.size();i++){
					if(cyber.get(i).getNome().equals(frase)){
						System.out.println("\nNome: " +cyber.get(i).getNome());
						System.out.println("Jogo: " +cyber.get(i).getJogo());
						System.out.println("Equipe: " +cyber.get(i).getEquipe());
						System.out.println("País: " +cyber.get(i).getPais());
						System.out.println("Salário: " +cyber.get(i).getSalario());
						System.out.println("Idade: " +cyber.get(i).getIdade());
						System.out.println("Tempo: " +cyber.get(i).getTempo());
						System.out.println("\n\n");
					}else{
						System.out.println("Nome do Atleta inexistente.\n");
						break;
					}
				}
				break;
			case 2:
				System.out.println("Digite Pais do Atleta: ");
				String Pais = inic.nextLine();
				
				for(int i=0;i<cyber.size();i++){
					if(cyber.get(i).getPais().equals(Pais)){
						System.out.println("\nNome: " +cyber.get(i).getNome());
						System.out.println("Jogo: " +cyber.get(i).getJogo());
						System.out.println("Equipe: " +cyber.get(i).getEquipe());
						System.out.println("País: " +cyber.get(i).getPais());
						System.out.println("Salário: " +cyber.get(i).getSalario());
						System.out.println("Idade: " +cyber.get(i).getIdade());
						System.out.println("Tempo: " +cyber.get(i).getTempo());
						System.out.println("\n\n");
					}else{
						System.out.println("Pais do Atleta inexistente.\n");
						break;
					}
				}
				break;
                            case 3:
				System.out.println("Digite o nome do jogo");
				String Jogo = inic.nextLine();
				
				for(int i=0;i<cyber.size();i++){
					if(cyber.get(i).getJogo().equals(Jogo)){
						System.out.println("\nNome: " +cyber.get(i).getNome());
						System.out.println("Jogo: " +cyber.get(i).getJogo());
						System.out.println("Equipe: " +cyber.get(i).getEquipe());
						System.out.println("País: " +cyber.get(i).getPais());
						System.out.println("Salário: " +cyber.get(i).getSalario());
						System.out.println("Idade: " +cyber.get(i).getIdade());
						System.out.println("Tempo: " +cyber.get(i).getTempo());
						System.out.println("\n\n");
					}else{
						System.out.println("Jogo do Atleta inexistente.\n");
						break;
					}
				}
				break;
		}
	}
	
	public static void imprimir(ArrayList<Atleta> cyber){
		double maior = 0, m1=0, m2=0;
		double valorT=0;
		
		System.out.println("1- Imprimir total de salario por equipe");
		System.out.println("2- Imprimir os três Atletas com maior tempo como profissional");
		System.out.println("Digite a opção desejada: ");
		int opi = inic.nextInt();
		inic.nextLine();
		
		switch(opi){
			case 1:
                            Imprimir_Salario(cyber);
				break;
			case 2: 
				Imprimir_Tempo(cyber);
				break;
		}
		
	}
	
	public static void listar(ArrayList<Atleta> cyber){
            if(cyber.size()>0){
		for(int i=0;i<cyber.size();i++){
			System.out.println("\nNome: " +cyber.get(i).getNome());
			System.out.println("Jogo: " +cyber.get(i).getJogo());
			System.out.println("Equipe: " +cyber.get(i).getEquipe());
			System.out.println("Pais: " +cyber.get(i).getPais());
			System.out.println("Salario: " +cyber.get(i).getSalario());
			System.out.println("Idade: " +cyber.get(i).getIdade());
			System.out.println("Tempo: " +cyber.get(i).getTempo()+"\n");
		}
		System.out.println("\n");
            }
            else{
                System.out.println("Opção inválida ou Lista vazia!\n");
            }
                
	}
	
	private static boolean matchesOnlyText(String text) {
		return text.matches("[^\\d]+");
	}
        public static void Imprimir_Salario(ArrayList<Atleta> cyber){
            System.out.println("Digite o nome da Equipe:");
            String equipe = inic.nextLine();
            double soma=0;
				
		for(int i=0;i<cyber.size();i++){
                    if(cyber.get(i).getEquipe().equals(equipe)){
                        
                        soma = soma + cyber.get(i).getSalario();
                        }
                    else{
                        System.out.println("Opção inválida ou equipe inexistente!\n");
                    }
		}
                System.out.println("Salario total da equipe: " +soma);
        }
        public static void Imprimir_Tempo(ArrayList<Atleta> cyber){
            int m1, m2, m3;
	    m1=cyber.get(0).getTempo();
            m2=cyber.get(0).getTempo();
            m3=cyber.get(0).getTempo();
            String n1 = cyber.get(0).getNome(), n2 = cyber.get(0).getNome(), n3 = cyber.get(0).getNome();
		for(int i=0;i<cyber.size();i++){
                    if(cyber.get(i).getTempo() > m1){
                        n2 = n1;
                        n1 = cyber.get(i).getNome();
                        m1 = cyber.get(i).getTempo();
                    
                    }else if((cyber.get(i).getTempo() < m1) && (cyber.get(i).getTempo() > m2)){
                            n3 = n2;
                            n2 = cyber.get(i).getNome();
                            m2 = cyber.get(i).getTempo();
                     
                    
                    }else if ((cyber.get(i).getTempo() < m1) && (cyber.get(i).getTempo() < m2) && (cyber.get(i).getTempo() > m3)){
                                n3 = cyber.get(i).getNome();
                                m3 = cyber.get(i).getTempo();
                     
                     }
                
                    }
                System.out.println("\n1º maior tempo: " +n1);
                System.out.println("\n2º maior tempo: " +n2);
                System.out.println("\n3º maior tempo: " +n3);
        }
            
}

