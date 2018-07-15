/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author Servidor
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4};
        for(int c=0; c<=n.length-1; c++){ // length vai pegar o tamanho do vetor, no caso ele vai até o final do vetor
            //tirou 1 pq o vetor começa com 0
            System.out.println(" na posição " + c + " temos o valor " + n[c]);
        }
      
    }
    
}
