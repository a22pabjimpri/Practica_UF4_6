package practica6;

public class Partit1 {

    private int golsEquipLocal, golsEquipVisitant;
    private String nomEquipLocal, nomEquipVisitant;
    
    

    Partit1(String equipLocal, String equipVisitant) {
        nomEquipLocal = equipLocal;
        nomEquipVisitant = equipVisitant;
        golsEquipLocal = 0;
        golsEquipVisitant = 0;
    }

    Partit1(String equipLocal, String equipVisitant, int golsLocal, int golsVisitant) {
        nomEquipLocal = equipLocal;
        nomEquipVisitant = equipVisitant;
        golsEquipLocal = golsLocal;
        golsEquipVisitant = golsVisitant;
    }

    public void marcaEquipLocal() {
        golsEquipLocal++;
    }
    public void marcaEquipVisitant() {
        golsEquipVisitant++;
    }
    
    public void marcador(){
        System.out.println("Local " + nomEquipLocal + " " + golsEquipLocal + " : " + 
        golsEquipVisitant + " " + nomEquipVisitant + " Visitant");
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
