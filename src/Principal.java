/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String [] args){
        
        Documental docu1 = new Documental();
         
        //Superclase Cine
        
                docu1.tipo = "Divulgativo";
                docu1.duracion = 91;
        
        //Clase padre Pelicula
        
                docu1.titulo = "Cowspiracy: The Sustainability Secret";
        
        //Subclase
        
                docu1.subgenero = "Informativo";
                docu1.nivelDivulgacion = "Gran público";
                
                
                System.out.println(("Tipo de documental: ") +docu1.tipo + '\n' + ("Duración: ") + docu1.duracion + '\n' +("Título: ") +
                        docu1.titulo + '\n' + ("Subgénero: ") + docu1.subgenero + '\n' + ("Nivel de divulgación: ") + docu1.nivelDivulgacion);
    }
    
}
