public class App {
    public static void main(String[] args) throws Exception {
    	Disciplina Port = new Disciplina("Portugues", 120);
    	Matricula Portugues = new Matricula(Port);
    	Aluno A1 = new Aluno("Joao", new Graduação(), new Historico());
    	Aluno A2 = new Aluno("Felipe", new PosGraduação(), new Historico());
    	A1.addDisciplina(Portugues);
    	A2.addDisciplina(Portugues);
    	Portugues.addAtividade(new Atividade(24));
    	Portugues.addAtividade(new Atividade(15));
    	Portugues.addAtividade(new Atividade(30));
    	Portugues.addAtividade(new Atividade(11));
    	A1.getDisciplinas().get(0).getAtividades().get(0).lancarNota(14);
    	A1.getDisciplinas().get(0).getAtividades().get(1).lancarNota(12);
    	A1.getDisciplinas().get(0).getAtividades().get(2).lancarNota(29);
    	A1.getDisciplinas().get(0).getAtividades().get(3).lancarNota(10);
    	A2.getDisciplinas().get(0).getAtividades().get(0).lancarNota(14);
    	A2.getDisciplinas().get(0).getAtividades().get(1).lancarNota(12);
    	A2.getDisciplinas().get(0).getAtividades().get(2).lancarNota(4);
    	A2.getDisciplinas().get(0).getAtividades().get(3).lancarNota(8);
    	System.out.println(A1.aprovado("Portugues"));
    	System.out.println(A2.aprovado("Portugues"));
    	System.out.println(A1.formado());
    	System.out.println(A2.formado());





    }
}
