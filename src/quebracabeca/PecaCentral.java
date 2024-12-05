
package quebracabeca;


public class PecaCentral {
    private int[][] corpo = new int[3][3]; 

    public PecaCentral() {
        corpo[1][1] = 1;
        corpo[1][2] = 1;
        corpo[2][1] = 1;
        corpo[2][2] = 1;
    }

    public int[][] getCorpo() {
        return corpo;
    }

    public void setCorpo(int[][] corpo) {
        this.corpo = corpo;
    }
    
    

    
    
    
}

