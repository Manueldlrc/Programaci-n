package mdlrc;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Coordenada {
    private int fila;
    private int columna;
    private int sentido;

    public Coordenada(int fil, int colum, int sent){
        this.fila= fil;
        this.columna= colum;
        this.sentido= sent;
    }

    protected int getFila(){
        return this.fila;
    }
    protected int getColumna(){
        return this.columna;
    }
    protected int getSentido(){
        return this.sentido;
    }
}
