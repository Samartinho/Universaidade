public class Atividade {
    private static final int MAX_VALOR = 30;
    private int valor;
    private double nota;
    
    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor) throws Exce��o {
        if(valor>=1 && valor<=MAX_VALOR)
        {
            this.valor = valor;
        }
        else
        {
        	throw new Exce��o("Valor inserido n�o est� dentro de 1 a 30");
        }
    }

    public Atividade(int valor) throws Exce��o {
		this.setValor(valor);
    }

	public double getNota() {
        return nota;
    }
    
    public void lancarNota(double nota) throws Exce��o {
        if(nota>=0 && nota<=this.valor)
        {
        	this.nota = nota;
        }
        else
        {
        	throw new Exce��o("Nota inserida n�o est� entre 1 e " + this.valor);
        }
    }
      
    
}
