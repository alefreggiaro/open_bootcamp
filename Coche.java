public class Coche {
    public int puertas = 0;

    public int agregarPuertas() {
        this.puertas++;
        return 0;
    }
    Coche miCoche = new Coche() {
        miCoche.agregarPuertas();
        System.out.println(miCoche.puertas)
    }
}
