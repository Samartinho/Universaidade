import java.util.ArrayList;
import java.util.List;

public class Matricula {
    private Disciplina Disciplina;
    private Situação Situacao;
    private List<Atividade> Atividades;
    
    public Matricula(Disciplina disciplina) {
		this.setDisciplina(disciplina);
		this.setSituacao(Situação.CURSANDO);
		this.Atividades = new ArrayList<Atividade>();
	}

	public double notaFinal() 
    {
		double j = 0;
		for(int i = 0; i <= this.getAtividades().size()-1; i++)
		{
			j += this.getAtividades().get(i).getNota();
		}
		return j;
    }
    
    private void lancarNota(int avaliacao, int nota) throws Exceção
    {
    	this.getAtividades().get(avaliacao).lancarNota(nota);
    }
    
    public void addAtividade(Atividade nova)
    {
    	if(this.getAtividades().stream().mapToInt((m) -> m.getValor()).sum() + nova.getValor() <= 100)
    		this.Atividades.add(nova);
    }
    
    public void fecharSemestre(IAcademico nivel) 
    {
    	if(nivel.aprovados(this))
    	{
    		this.setSituacao(Situação.APROVADO);
    	}
    	else
    	{
    		this.setSituacao(Situação.REPROVADO);
    	}
    }

	public Disciplina getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		Disciplina = disciplina;
	}

	public Situação getSituacao() {
		return Situacao;
	}

	public void setSituacao(Situação situacao) {
		Situacao = situacao;
	}

	public List<Atividade> getAtividades() {
		return Atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		Atividades = atividades;
	}
    
    
}
