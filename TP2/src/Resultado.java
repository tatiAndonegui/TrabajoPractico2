public class Resultado {

    private int golesLocales;
    private int golesVisitante;


    public int getGolesLocales() {
        return golesLocales;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public boolean ganoLocal() {
        if (golesLocales > golesVisitante) {
            return true;
        } else {
            return false;
        }
    }

    public boolean empate() {
        if (golesLocales == golesVisitante) {
            return true;
        }
        return false;
    }
}