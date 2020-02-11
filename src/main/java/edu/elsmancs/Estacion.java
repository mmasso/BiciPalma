package edu.elsmancs;

class Estacion{
    private int id = 0;
    private String direccion = "";
    private int numeroAnclajes = 0;
    private int[] anclajes = null;

    Estacion(int id, String direccion, int numeroAnclajes){
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
    }

}