package mdlrc;

import javax.sound.sampled.SourceDataLine;
import javax.swing.event.SwingPropertyChangeSupport;

public class TableroException extends Exception{
    public TableroException(){
        super();
    }
    public TableroException(String message){
        super(message);
    }
    
}
