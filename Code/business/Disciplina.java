public class Disciplina{
    private static final int MIN_CARGA=20;
    private static final int MAX_CARGA=120;
    protected String nome;
    protected int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria){
        this.nome = nome; 
        this.setCargaHoraria(cargaHoraria);
    }

    public String getNome() {
        return nome;
    }
   
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if(cargaHoraria<MIN_CARGA)
            this.cargaHoraria = MIN_CARGA;    
        else if(cargaHoraria>MAX_CARGA)
            this.cargaHoraria = MAX_CARGA;
        else this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return this.nome + " - Carga horária: "+this.cargaHoraria+" h.";
    }

    @Override
    public boolean equals(Object obj){
        try{
            Disciplina disc = (Disciplina)obj;
            return (this.nome.equals(disc.nome) && (this.cargaHoraria==disc.cargaHoraria));
        }catch(ClassCastException ex){
            System.err.println("Cast/comparação inválida");
            return false;
        }
    }
}