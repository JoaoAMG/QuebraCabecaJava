
package quebracabeca;


public class Tabuleiro {
    private int[][] tamanho = new int[9][9]; 


    public Tabuleiro(int[][] tamanho){
        this.tamanho = tamanho;
    }

    public int[][] getTamanho() {
        return tamanho;
    }

    public void setTamanho(int[][] tamanho) {
        this.tamanho = tamanho;
    }
    
    private int[][] adicionaraotabuleiro(Peca p){
            int[][] pedidoaux = p.getTamanhogeral();
            int i , j  , auxi = 0, auxj = 0;
            for( i=auxi; i<tamanho.length; i++){
                for( j=auxj; j<tamanho[0].length; j++){
                    if(tamanho[i][j] == 0)
                        tamanho[ i ][ j ] = pedidoaux[i][j];
                    else if(tamanho[3][1] == 1 || tamanho[3][2] == 1|| tamanho[3][4] == 1 || tamanho[3][5] == 1|| tamanho[3][7] == 1|| tamanho[3][8] == 1){
                        System.out.println("nao foi possivel encaixar a peça");
                        break;
                    }
                    else if(tamanho[6][1] == 1 || tamanho[6][2] == 1|| tamanho[6][4] == 1 || tamanho[6][5] == 1|| tamanho[6][7] == 1|| tamanho[6][8] == 1){
                    System.out.println("nao foi possivel encaixar a peça");
                    break;
                    }
                     else if(tamanho[1][3] == 1 || tamanho[2][3] == 1|| tamanho[4][3] == 1 || tamanho[5][3] == 1|| tamanho[7][3] == 1|| tamanho[8][3] == 1){
                        System.out.println("nao foi possivel encaixar a peça");
                        break;
                    }
                    else if(tamanho[1][6] == 1 || tamanho[2][6] == 1|| tamanho[4][6] == 1 || tamanho[5][6] == 1|| tamanho[7][6] == 1|| tamanho[8][6] == 1){
                    System.out.println("nao foi possivel encaixar a peça");
                    break;
                    }
                 }
            }
            auxj += 3;
            if(auxj ==6){
                auxj = 0;
                auxi += 3;       
                  
            }
            

            return tamanho;
    
    }
    
    
    
}
