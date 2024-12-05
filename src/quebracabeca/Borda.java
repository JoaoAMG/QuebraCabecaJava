
package quebracabeca;


public class Borda {
           private  int[][] tamanhoborda = new int[3][3]; 

    public Borda() {
    }

    public int[][] getTamanhoborda() {
        return tamanhoborda;
    }

    public void setTamanhoborda(int[][] tamanhoborda) {
        this.tamanhoborda = tamanhoborda;
    }
    
    public int[][] Bvefull(){
        tamanhoborda[1][0] = 1; 
        tamanhoborda[2][0] = 1; 
        return tamanhoborda;
    }
    public int[][] Bvecheiovazio(){
        tamanhoborda[1][0] = 1; 
        tamanhoborda[2][0] = 0; 
        return tamanhoborda;
    }
    public int[][] Bvevaziocheio(){
        tamanhoborda[1][3] = 0; 
        tamanhoborda[2][3] = 1; 
        return tamanhoborda;
    }
    
    public int[][] Bvdfull(){
        tamanhoborda[1][3] = 1; 
        tamanhoborda[2][3] = 1; 
        return tamanhoborda;
    }
    public int[][] Bvdcheiovazio(){
        tamanhoborda[1][3] = 1; 
        tamanhoborda[2][3] = 0; 
        return tamanhoborda;
    }
    public int[][] Bvdvaziocheio(){
        tamanhoborda[1][3] = 0; 
        tamanhoborda[2][3] = 1; 
        return tamanhoborda;
    }
    
    public int[][] Bhufull(){
        tamanhoborda[0][1] = 1; 
        tamanhoborda[0][2] = 1; 
        return tamanhoborda;
    }
    public int[][] Bhucheiovazio(){
        tamanhoborda[0][1] = 1; 
        tamanhoborda[0][2] = 0; 
        return tamanhoborda;
    }
    public int[][] Bhuvaziocheio(){
        tamanhoborda[0][1] = 0; 
        tamanhoborda[0][2] = 1; 
        return tamanhoborda;
    }
    
    public int[][] Bhbfull(){
        tamanhoborda[3][1] = 1; 
        tamanhoborda[3][2] = 1; 
        return tamanhoborda;
    }
    public int[][] Bhbcheiovazio(){
        tamanhoborda[3][1] = 1; 
        tamanhoborda[3][2] = 0; 
        return tamanhoborda;
    }
    public int[][] Bhbvaziocheio(){
        tamanhoborda[3][1] = 0; 
        tamanhoborda[3][2] = 1; 
        return tamanhoborda;
    }
    
    
    
            
            
}
