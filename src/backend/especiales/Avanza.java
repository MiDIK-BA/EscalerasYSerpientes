package backend.especiales;

import java.awt.Color;

import backend.clases.Jugador;
import backend.clases.Tablero; 

public class Avanza extends Serpiente {
    private final String DESCRIPCION;
    private static final Color COLOR_CASILLA = new Color(138, 201, 38);

    public Avanza(int numCasillasMover, Tablero tablero){
        super(numCasillasMover, tablero);
        DESCRIPCION = "<html><body>Avanza<br> &nbsp; &nbsp; &nbsp;" + numCasillasMover +"<br>casillas</body></html>";
    }
    
    public void activar(Jugador jugador){
        super.mover(super.numCasillasMover, jugador, super.tablero.getPosiciones());        
    }

    @Override
    public String getDescripcion() {
        return DESCRIPCION;
    }

    @Override
    public Color getColorCasilla() {
        return COLOR_CASILLA;
    }
}
