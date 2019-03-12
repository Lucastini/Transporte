/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.ArrayList;
/**
 *
 * @author AlumnoLocal
 */
public class Camion {
    private String marca;
    private ArrayList<Caja> cajas;
    
    public Camion(String mar)
    {
        marca=mar;
        cajas=new ArrayList(5);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(ArrayList<Caja> cajas) {
        this.cajas = cajas;
    }
    
    public boolean addCaja(Caja ca)
    {
        boolean res=false;
        if(cajas.size()<5)
            res=cajas.add(ca);
        return res;
    }
    
    private Caja buscarCaja(int co)
    {
        Caja ca=null;
        for(Caja ref:cajas)
            if(ref.getCodigo()==co)
            {
                ca=ref;
                break;
            }
        return ca;
    }
    public Caja removeCaja(int co)
    {
        Caja ca=buscarCaja(co);
        if(ca!=null)
        {
            cajas.remove(ca);
        }
        return ca;
    }
    
    
}
