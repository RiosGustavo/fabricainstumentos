
package com.mycompany.fabricainstrumentos;

import java.util.ArrayList;


public class Fabrica {
    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        
         this.sucursales = new ArrayList();
    }

//    public Fabrica(ArrayList<Sucursal> sucursales) {
//        this.sucursales = sucursales;
//    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void listarInstrumentos(){
        for (Sucursal sucursal : sucursales) {
            System.out.println("Nombre de la sucursal: "+sucursal.getNombre());
            sucursal.listarInstrumentos();
        }
        
    }
    
public void agregarSucursal(Sucursal suc){
    
    this.sucursales.add(suc);
}   

 public ArrayList<Instrumento> instrumentosPorTipo(TiposIntrumentos tipo){
        
        //// CREAMOS UN ARRAYLIST NUEVO PARA QUE TOME SOLO LOS INSTRUMENTOS
        /// DE UNA DETERMINADA SUCURSAL Y NO LOS DE OTROS
        ArrayList<Instrumento> instrumentosEncontrados = new ArrayList();
        
        for (Sucursal sucursal : sucursales) {
            /// con addall es una  caracteristica de ArrayList para 
            //// pones los elemntos de un array en otro
            instrumentosEncontrados.addAll(sucursal.instrumentosPorTipo(tipo));
        }
        
        
        return instrumentosEncontrados;
        
    }
 
 public Instrumento borrarInstrumento(String ID){
     Instrumento borrado = null;
     int i=0;
     //// se realiza una busqueda
     while(i < sucursales.size() && borrado == null){
         borrado = sucursales.get(i).borrarInstrumento(ID);
         i++;
     }
     
        return borrado;
     
 }
 
 public double[]  porcentajeInstrumentosPortipo(String nombsuc){
     double [] porcentajes = null;
     Sucursal  sucursalEncontrada = buscarSucursal(nombsuc);
     if(sucursalEncontrada != null){
         porcentajes =sucursalEncontrada.porcentajeInstrumentosPortipo();
     }
        return porcentajes;
     
 }
 
 public  Sucursal buscarSucursal(String nombsuc){
         int i=0;
         Sucursal sucursalEncontrado = null;
         
         while(i< sucursales.size() && this.sucursales.get(i).getNombre().equalsIgnoreCase(nombsuc)){
         i++;
         
     }
        if(i<sucursales.size()){
            sucursalEncontrado = this.sucursales.get(i);
        } 
         
        return sucursalEncontrado;
         
     }
    
    
    @Override
    public String toString() {
        return "Fabrica{" + "sucursales=" + sucursales + '}';
    }
    
}
