package main;

public class Contador {

    int cont;

    Contador() {
    	cont = 0;
    }

    Contador(int cont) {
         this.cont = cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {       
        this.cont = cont;
    }

    public void sumar() {
        cont++;
    }

    public void restar() {
        cont--;
    }

	@Override
	public String toString() {
		return "Contador [cont=" + cont + "]";
	}
    
    
    
}