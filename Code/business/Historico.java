import java.util.HashSet;
import java.util.Set;

public class Historico {

	private Set<Matricula> disciplinas;
    
    public Historico(){
        this.disciplinas = new HashSet<Matricula>();
    }

    public boolean addMateria(Matricula aprovada) throws Exceção{
    	boolean b = false;
    	if(aprovada.getSituacao() == Situação.APROVADO)
    	{
    		this.disciplinas.add(aprovada);
    		b = true;
    	}
    	else
    	{
        	throw new Exceção("O aluno não foi aprovado nesta materia, por isso não pode ser adicionada");
    	}
		return b;
    }

    @Override
	public String toString() {
		return "Historico [disciplinas=" + disciplinas + "]";
	}

}
