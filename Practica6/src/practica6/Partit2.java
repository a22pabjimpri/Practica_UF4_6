package practica6;

public class Partit2 {

    private int golsEquipLocal, golsEquipVisitant;
    private Equip equipLocal, equipVisitant;
    private int estatPartit;

    

    public Partit2(Equip equipLocal, Equip equipVisitant) {
        this.equipLocal = equipLocal;
        this.equipVisitant = equipVisitant;
        golsEquipLocal = 0;
        golsEquipVisitant = 0;
        estatPartit = 0;
    }

    public Partit2(Equip equipLocal, Equip equipVisitant, int golsLocal, int golsVisitant) {
        this.equipLocal = equipLocal;
        this.equipVisitant = equipVisitant;
        golsEquipLocal = golsLocal;
        golsEquipVisitant = golsVisitant;
        estatPartit = 2;
        actualitzaPuntsLliga();
    }
    
   
    public void iniciarPartit() {
        estatPartit = 1;
    }

    public void marcaEquipLocal() {
        golsEquipLocal++;
    }

    public void marcaEquipVisitant() {
        golsEquipVisitant++;
    }

    public void actualitzaPuntsLliga() {
        if (golsEquipLocal > golsEquipVisitant) {
            equipLocal.incrementaPunts(3);
        } else if (golsEquipLocal < golsEquipVisitant) {
            equipVisitant.incrementaPunts(3);
        } else {
            equipLocal.incrementaPunts(1);
            equipVisitant.incrementaPunts(1);
        }
    }

    public void marcador() {
        if (estatPartit == 0) {
            System.out.println("El partit no ha començat encara.");
        } else if (estatPartit == 1) {
            System.out.println("Local " + equipLocal.getNomEquip() + " " + golsEquipLocal + " : "
                    + golsEquipVisitant + " " + equipVisitant.getNomEquip());
        } else {
            System.out.println("Final del partit. Marcador: Local " + equipLocal.getNomEquip() + " "
                    + golsEquipLocal + " : " + golsEquipVisitant + " " + equipVisitant.getNomEquip());
        }
    }

    public void fi() {
        if (estatPartit == 0) {
            System.out.println("El partit no ha començat encara.");
        } else {
            estatPartit = 2;
            actualitzaPuntsLliga();
            if (golsEquipLocal > golsEquipVisitant) {
                System.out.println("Guanya l'equip local " + equipLocal.getNomEquip());
            } else if (golsEquipLocal < golsEquipVisitant) {
                System.out.println("Guanya l'equip visitant " + equipVisitant.getNomEquip());
            } else {
                System.out.println("Empat entre els dos equips!");
            }
        }
    }
    
    public int getEstatPartit() {
        return estatPartit;
    }

    public void setEstatPartit(int estatPartit) {
        this.estatPartit = estatPartit;
    }

    public int getGolsEquipLocal() {
        return golsEquipLocal;
    }

    public void setGolsEquipLocal(int golsEquipLocal) {
        this.golsEquipLocal = golsEquipLocal;
    }

    public int getGolsEquipVisitant() {
        return golsEquipVisitant;
    }

    public void setGolsEquipVisitant(int golsEquipVisitant) {
        this.golsEquipVisitant = golsEquipVisitant;
    }

}

