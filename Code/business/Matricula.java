import java.util.ArrayList;
import java.util.List;

public class Matricula {
    private Disciplina Disciplina;
    private Situa��o Situacao;
    private List<Atividade> Atividades;
    
    public Matricula(Disciplina disciplina) {
		this.setDisciplina(disciplina);
		this.setSituacao(Situa��o.CURSANDO);
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
    
    private void lancarNota(int avaliacao, int nota) throws Exce��o
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
    		this.setSituacao(Situa��o.APROVADO);
    	}
    	else
    	{
    		this.setSituacao(Situa��o.REPROVADO);
    	}
    }

	public Disciplina getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		Disciplina = disciplina;
	}

	public Situa��o getSituacao() {
		return Situacao;
	}

	public void setSituacao(Situa��o situacao) {
		Situacao = situacao;
	}

	public List<Atividade> getAtividades() {
		return Atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		Atividades = atividades;
	}
    
    
}
