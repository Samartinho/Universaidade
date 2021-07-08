import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private static int matricula;
	public String nome;
	private IAcademico nivel;
	private List<Matricula> Disciplinas;
	private Historico historico;
	
	
	
	public Aluno(String nome, IAcademico nivel, Historico historico) {
		this.setNome(nome);
		this.setNivel(nivel);
		this.Disciplinas = new ArrayList<Matricula>();
		this.setHistorico(historico);
	}

	public boolean aprovado(String nomeDisciplina)
	{
		boolean b = false;
		for(Matricula m : Disciplinas)
		{
			if(m.getDisciplina().getNome().equals(nomeDisciplina) && nivel.aprovados(m))
			{
				b = true;
			}
		}
		return b;
	}
	
	public String imprimirHistorico()
	{
		return this.historico.toString();
	}
	
	public boolean formado()
	{
		boolean b = false;
		int cred = 0;
		for(Matricula m : Disciplinas)
		{
			cred += this.nivel.creditos(m);
		}
		if(this.nivel instanceof Graduação)
		{
			if(cred >= 50)
			{
				b = true;
			}
		}
		else
		{
			if(cred >= 20)
			{
				b = true;
			}
		}
		return b;
	}
	
	public void addDisciplina(Matricula D)
	{
		this.Disciplinas.add(D);
	}

	public static int getMatricula() {
		return matricula;
	}

	public static void setMatricula(int matricula) {
		Aluno.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public IAcademico getNivel() {
		return nivel;
	}

	public void setNivel(IAcademico nivel) {
		this.nivel = nivel;
	}

	public List<Matricula> getDisciplinas() {
		return Disciplinas;
	}

	public void setDisciplinas(List<Matricula> disciplinas) {
		Disciplinas = disciplinas;
	}

	public Historico getHistorico() {
		return historico;
	}

	public void setHistorico(Historico historico) {
		this.historico = historico;
	}
	
	
}