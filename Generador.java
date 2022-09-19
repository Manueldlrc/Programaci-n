package mdlrc;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Generador{
    int n;
    List<Character> tab = new ArrayList<Character>();
    List<List<Character>> tablero= new ArrayList<List<Character>>();

    public Generador(int n) throws Exception{
        
        if (n>0) {
            this.n= n;
        }
        else {
            throw new Exception("n es menor o igual a 0");
        }
        for(int i=0; i<n; i++){
            this.tablero.add(new ArrayList<Character>());
            for(int j=0; j<n; j++){
                this.tablero.get(i).add('*');
            }
        }
    }
    public String toString(){
        String letras="";
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                letras+= this.tablero.get(i).get(j);
            }
            letras+= "\n";
        }
      return letras;
    }
    public void colocarPalabraHorizontal(String palabra, Coordenada coordenada) throws TableroException{
        if (palabra == null || palabra.isEmpty()){
            throw new TableroException ("Palabra nula o vacía");
        }
        else if (palabra.length() > this.n){
            throw new TableroException ("Tamaño");
        }
        else if (coordenada.getFila() > this.n){
            throw new TableroException ("Se sale");
        }
        else if (coordenada)
    }

    public static void main(String[] args) throws Exception{
        Generador sopa= new Generador(3);
        System.out.println(sopa.toString());

    }

}
