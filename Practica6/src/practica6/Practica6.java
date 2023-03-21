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
        
        Equip e1 = new Equip("Real Madrid");
        Equip e2 = new Equip("FC Negreira");
        
        Partit2 p2 = new Partit2(e1, e2);
        
        p2.marcador();
        p2.iniciarPartit();
        p2.marcador();
        p2.marcaEquipLocal();
        p2.marcador();
        p2.marcaEquipLocal();
        p2.marcador();
        p2.marcaEquipVisitant();
        p2.marcador();
        p2.marcaEquipVisitant();
        p2.marcador();
        p2.fi();
        p2.actualitzaPuntsLliga();
        e1.mostrarPunts();
        e2.mostrarPunts();
        
        

    }

}
