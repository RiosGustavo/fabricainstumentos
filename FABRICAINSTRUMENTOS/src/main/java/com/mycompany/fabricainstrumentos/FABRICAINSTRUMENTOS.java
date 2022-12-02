/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fabricainstrumentos;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class FABRICAINSTRUMENTOS {

    public static void main(String[] args) {
        
       
        
        Fabrica F = new Fabrica();
        cargarFabrica(F);
        
        F.listarInstrumentos();
        
      F.instrumentosPorTipo(TiposIntrumentos.VIENTO);
        
        ArrayList<Instrumento> lista =  F.instrumentosPorTipo(TiposIntrumentos.VIENTO);
        
        for (Instrumento instrumento : lista) {
            System.out.println(instrumento);
        }
       
       Instrumento borrado= F.borrarInstrumento("id123");
        System.out.println("instrumento borrado "+borrado);
        F.listarInstrumentos();
        
        double porcen[]= F.porcentajeInstrumentosPortipo("sucursal centro");
        
        for (int i = 0; i < porcen.length; i++) {
            System.out.println(porcen[i]);
            
        }
        
    }
    
    public static void cargarFabrica(Fabrica F){
 Sucursal s1 = new Sucursal("sucursal centro");
        
        Sucursal s2 = new Sucursal("sucursal barrio");
        Sucursal s3 = new Sucursal("sucursal Principal");
         s1.agregarInstrumento(new Instrumento("id1763",13000,TiposIntrumentos.PERCUSION));
        s1.agregarInstrumento(new Instrumento("id123",123000,TiposIntrumentos.PERCUSION));
         s2.agregarInstrumento(new Instrumento("id143",513000,TiposIntrumentos.CUERDA));
          s3.agregarInstrumento(new Instrumento("id188",729000,TiposIntrumentos.VIENTO));        
           s3.agregarInstrumento(new Instrumento("ihd188",7290800,TiposIntrumentos.VIENTO));  
             s1.agregarInstrumento(new Instrumento("id123",123000,TiposIntrumentos.PERCUSION));
         s1.agregarInstrumento(new Instrumento("id143",513000,TiposIntrumentos.CUERDA));
           s1.agregarInstrumento(new Instrumento("id188",729000,TiposIntrumentos.VIENTO));
        F.agregarSucursal(s1);
        F.agregarSucursal(s2);
        F.agregarSucursal(s3);
    }
}
