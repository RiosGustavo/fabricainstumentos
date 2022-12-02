package com.mycompany.fabricainstrumentos;

import java.util.ArrayList;

public class Sucursal {

    private ArrayList<Instrumento> instrumentos;
    private String Nombre;

    public Sucursal() {
    }

    public Sucursal(String Nombre) {
        this.instrumentos = new ArrayList();
        this.Nombre = Nombre;
    }

    public void agregarInstrumento(Instrumento inst) {
        this.instrumentos.add(inst);

    }

    public String getNombre() {
        return Nombre;
    }

    /// aca hacemos este metodo porqeu en esta calse tenemos la variable instrumentos
    public void listarInstrumentos() {

        // tener cudiado por que se llaman parecido pero se refieren a cosas diferentes
        // Instrumento es la CLASE
        // instrumento segunda variable es aleatoria puede tener el nombre que queramos
        // instrumento tercero es la variable(COLECCION) private que estamos rrecorriendo
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);

        }

    }
    
    public ArrayList<Instrumento> instrumentosPorTipo(TiposIntrumentos tipo){
        
        //// CREAMOS UN ARRAYLIST NUEVO PARA QUE TOME SOLO LOS INSTRUMENTOS
        /// DE UNA DETERMINADA SUCURSAL Y NO LOS DE OTROS
        ArrayList<Instrumento> instrumentosEncontrados = new ArrayList();
        
        for (Instrumento instrumento : instrumentos) {
            if(instrumento.getTipo() == tipo){
                instrumentosEncontrados.add(instrumento);
            }
        }
        
        
        return instrumentosEncontrados;
        
    }
    
     public Instrumento borrarInstrumento(String ID){
    Instrumento instBorrar = buscarInstrumento(ID);
     this.instrumentos.remove(instBorrar);
     
        return instBorrar;
     
 }
     
     public  Instrumento buscarInstrumento(String ID){
         int i=0;
         Instrumento instrumentoEncontrado = null;
         
         while(i< instrumentos.size() && this.instrumentos.get(i).getID().equalsIgnoreCase(ID)){
         i++;
         
     }
        if(i<instrumentos.size()){
            instrumentoEncontrado = this.instrumentos.get(i);
        } 
         
        return instrumentoEncontrado;
         
     }
     
     public double[] porcentajeInstrumentosPortipo(){
         final int CANT_INTRUMENTOS= TiposIntrumentos.values().length;
         
         ////CREAMOS EL ARRAY
         double[] porcentajes = new double[CANT_INTRUMENTOS];
         
         for (Instrumento instrumentos : instrumentos) {
             
             /// con el comando ordinal nos dice la paisicon en la que esta 
            porcentajes[instrumentos.getTipo().ordinal()] ++; 
         }
          absolutosPorcentaje( porcentajes);
        return porcentajes;
         
     }
     public void absolutosPorcentaje(double[] porcentajes){
         for (int i = 0; i < porcentajes.length; i++) {
             porcentajes[i] = (porcentajes[i] *100)/ instrumentos.size();
         }
         
         
     }

}
