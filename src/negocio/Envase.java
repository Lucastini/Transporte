/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;


/**
 * Clase genérica que representa un envase que luego
 * podrá ser de diferentes formas geométricas al momento
 * de heredarla
 * @author Nico
 * @version 1.0
 */
public abstract class Envase {
    /*
    Esta clase debe ser abstracta ya que tiene
    al menos un método abstracto
    */
    private int codigo;
    private float pesoVacio;
    private Sustancia sustancia;
    
    public Envase(int c,float pV)
    {
        codigo=c;
        pesoVacio=pV;
        sustancia=null;//se crea el envase vacío, sin sustancia
    }
    
    //constructor copia
    public Envase(Envase en)
    {
        codigo=en.codigo;
        pesoVacio=en.pesoVacio;
        sustancia=en.sustancia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPesoVacio() {
        return pesoVacio;
    }

    public void setPesoVacio(float pesoVacio) {
        this.pesoVacio = pesoVacio;
    }

    public Sustancia getSustancia() {
        return sustancia;
    }

    /**
     * Permite llenar un envase con cierta sustancia
     * @param sustancia, es con lo que se va a llenar el envase 
     */
    public void setSustancia(Sustancia sustancia) {
        this.sustancia = sustancia;
    }
    
    //redefinición
    public String toString()
    {
        return "\nCódigo: "+codigo
                +"\nPeso vacío: "+pesoVacio+" g"
                +"\nSustancia: "+sustancia;
    }
    
    public abstract float volumen();
    
    public float pesoLleno()
    {
        return pesoVacio + sustancia.getDensidad()*volumen();
    }
    
    
}
