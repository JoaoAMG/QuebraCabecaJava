package quebracabeca;

public class Peca {
    
   private int[][] tamanhogeral = new int[3][3]; 
    PecaCentral pecacentral = new PecaCentral();
    Borda borda = new Borda();  

    public Peca() {
        
    }

    public int[][] getTamanhogeral() {
        return tamanhogeral;
    }

    public void setTamanhogeral(int[][] tamanhogeral) {
        this.tamanhogeral = tamanhogeral;
    }

    public PecaCentral getPecacentral() {
        return pecacentral;
    }

    public void setPecacentral(PecaCentral pecacentral) {
        this.pecacentral = pecacentral;
    }

    public Borda getBorda() {
        return borda;
    }

    public void setBorda(Borda borda) {
        this.borda = borda;
    }
    
    
    public int[][] comporPeca(){
        
        int[][] centralaux = pecacentral.getCorpo();
        for(int i=0; i<tamanhogeral.length; i++){
        for(int j=0; j<tamanhogeral[0].length; j++){
          if(tamanhogeral[i][j] == 0)
                tamanhogeral[i][j] = centralaux[i][j];
        }
        }
        int[][] bordaaux = borda.getTamanhoborda();
        for(int i=0; i<tamanhogeral.length; i++){
        for(int j=0; j<tamanhogeral[0].length; j++){
          if(tamanhogeral[i][j] == 0)
                tamanhogeral[i][j] = bordaaux[i][j];
        }
        }
        
    return tamanhogeral;
    }
    
    
    
}

