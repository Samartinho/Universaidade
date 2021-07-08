public class Atividade {
    private static final int MAX_VALOR = 30;
    private int valor;
    private double nota;
    
    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor) throws Exceção {
        if(valor>=1 && valor<=MAX_VALOR)
        {
            this.valor = valor;
        }
        else
        {
        	throw new Exceção("Valor inserido não está dentro de 1 a 30");
        }
    }

    public Atividade(int valor) throws Exceção {
		this.setValor(valor);
    }

	public double getNota() {
        return nota;
    }
    
    public void lancarNota(double nota) throws Exceção {
        if(nota>=0 && nota<=this.valor)
        {
        	this.nota = nota;
        }
        else
        {
        	throw new Exceção("Nota inserida não está entre 1 e " + this.valor);
        }
    }
      
    
}
