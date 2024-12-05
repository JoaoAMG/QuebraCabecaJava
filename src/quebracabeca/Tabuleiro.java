
package quebracabeca;


public class Tabuleiro {
    private int[][] tamanho = new int[9][9]; 

    public Tabuleiro(int[][] tamanhoborda){
        this.tamanho = tamanhoborda;
    }

    public int[][] getTamanhoborda() {
        return tamanho;
    }

    public void setTamanhoborda(int[][] tamanhoborda) {
        this.tamanho = tamanhoborda;
    }
    
    
    
}
