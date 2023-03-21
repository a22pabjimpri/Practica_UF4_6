package practica6;

public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Partit1 p1 = new Partit1("Real Madrid", "FC Barcelona");

        p1.marcaEquipLocal();
        p1.marcador();
        p1.marcaEquipLocal();
        p1.marcador();
        p1.marcaEquipVisitant();
        p1.marcador();
        p1.marcaEquipVisitant();
        p1.marcador();
        p1.fi();

    }

}
