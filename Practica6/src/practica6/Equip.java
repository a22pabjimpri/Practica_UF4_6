package practica6;

public class Equip {

    private String nomEquip;
    private int puntsLliga;

    public Equip(String nomEquip) {
        this.nomEquip = nomEquip;
        this.puntsLliga = 0;
    }

    public void incrementaPunts(int punts) {
        this.puntsLliga += punts;
    }

    public void mostrarPunts() {
        System.out.println("L'equip " + nomEquip + " té " + puntsLliga);
    }

    public String getNomEquip() {
        return nomEquip;
    }

    public void setNomEquip(String nomEquip) {
        this.nomEquip = nomEquip;
    }

    public int getPuntsLliga() {
        return puntsLliga;
    }

    public void setPuntsLliga(int puntsLliga) {
        this.puntsLliga = puntsLliga;
    }

}
