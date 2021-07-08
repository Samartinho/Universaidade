
public class PosGraduação implements IAcademico{
	
	public PosGraduação() {
		
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
