public class Coche {
    public int puertas = 0;

    public int agregarPuertas() {
        this.puertas++;
        return 0;
    }

    public int masPuertas(){
        return agregarPuertas();
    }

    Coche miCoche = new Coche() {
    };
}
