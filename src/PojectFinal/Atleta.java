package PojectFinal;

public class Atleta {

    static void set(String nome, Atleta p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	private String nome, equipe, pais, jogo;
	private double salario;
	private int idade, tempo;
	
        public Atleta(String nome,String equipe, String pais, String jogo,int idade,int tempo, double salario){
        
        this.idade = idade;
        this.nome = nome;
        this.tempo = tempo;
        this.salario = salario;
        this.pais = pais;
        this.jogo = jogo;
        this.equipe = equipe;
    }
        
	public Atleta() {

	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEquipe() {
		return equipe;
	}
	
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String getJogo() {
		return jogo;
	}
	
	public void setJogo(String jogo) {
		this.jogo = jogo;
	}
	
}
