package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {
    
    private ArrayList<Paralelo> paralelosClase;

    public Ayudante(ArrayList<Paralelo> paralelos){
        this.paralelosClase= paralelos;
    
}
    
    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
