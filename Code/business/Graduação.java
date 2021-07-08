
public class Graduação implements IAcademico{

	public Graduação() {
		
	}
	
	@Override
	public boolean aprovados(Matricula materia) {
		boolean b;
		if(materia.notaFinal() >= 60)
		{
			b = true;
		}
		else
		{
			b = false;
		}
		return b;
	}

	@Override
	public int creditos(Matricula materia) {
		return materia.getDisciplina().getCargaHoraria() / 60;
	}

}
