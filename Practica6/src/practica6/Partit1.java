package practica6;

public class Partit1 {

    private int golsEquipLocal, golsEquipVisitant;
    private String nomEquipLocal, nomEquipVisitant;
    
    

    Partit1(String equipLocal, String equipVisitant) {
        this.nomEquipLocal = equipLocal;
        this.nomEquipVisitant = equipVisitant;
        this.golsEquipLocal = 0;
        this.golsEquipVisitant = 0;
    }

    Partit1(String equipLocal, String equipVisitant, int golsLocal, int golsVisitant) {
        this.nomEquipLocal = equipLocal;
        this.nomEquipVisitant = equipVisitant;
        this.golsEquipLocal = golsLocal;
        this.golsEquipVisitant = golsVisitant;
    }

    public void marcaEquipLocal() {
        this.golsEquipLocal++;
    }
    public void marcaEquipVisitant() {
        this.golsEquipVisitant++;
    }
    
    public void marcador(){
        System.out.println("Local " + nomEquipLocal + " " + golsEquipLocal + " : " + 
        golsEquipVisitant + " " + nomEquipVisitant);
    }
    
    public void fi (){
        if(golsEquipLocal> golsEquipVisitant){
            System.out.println("Guanya l'equip local " + nomEquipLocal);
        }
        else if(golsEquipLocal< golsEquipVisitant){
            System.out.println("Guanya l'equip visitant " + nomEquipVisitant);
        }
        else{
            System.out.println("Empat entre els dos equips!");
        }
    }
    public String getNomEquipLocal() {
        return nomEquipLocal;
    }
    
    public void setNomEquipLocal(String nomEquipLocal) {
        this.nomEquipLocal = nomEquipLocal;
    }
    
    public String getNomEquipVisitant() {
        return nomEquipVisitant;
    }
    
    public void setNomEquipVisitant(String nomEquipVisitant) {
        this.nomEquipVisitant = nomEquipVisitant;
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
