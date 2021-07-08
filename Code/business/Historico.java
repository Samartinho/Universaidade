import java.util.HashSet;
import java.util.Set;

public class Historico {

	private Set<Matricula> disciplinas;
    
    public Historico(){
        this.disciplinas = new HashSet<Matricula>();
    }

    public boolean addMateria(Matricula aprovada) throws Exce��o{
    	boolean b = false;
    	if(aprovada.getSituacao() == Situa��o.APROVADO)
    	{
    		this.disciplinas.add(aprovada);
    		b = true;
    	}
    	else
    	{
        	throw new Exce��o("O aluno n�o foi aprovado nesta materia, por isso n�o pode ser adicionada");
    	}
		return b;
    }

    @Override
	public String toString() {
		return "Historico [disciplinas=" + disciplinas + "]";
	}

}
