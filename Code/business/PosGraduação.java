
public class PosGradua��o implements IAcademico{
	
	public PosGradua��o() {
		
	}

	@Override
	public boolean aprovados(Matricula materia) {
		boolean b;
		if(materia.notaFinal() >= 70)
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
		return materia.getDisciplina().getCargaHoraria() / 120;
	}

}
