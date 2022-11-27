import java.util.ArrayList;
import java.util.Date;

public class Equipo {

    private String nombre;
    private ArrayList<Partido> partidosJugados;

    public Equipo (String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
