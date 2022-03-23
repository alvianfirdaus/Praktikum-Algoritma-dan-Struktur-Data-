/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author Alvian
 */
public class faktorial {
    public int nilai;
    
    public int faktorialIBF(int n){
        int fakto = 1;
        int i=1;
        while(i <= n){
            fakto = fakto*i;
            i++;
        }
        return fakto;
    }
    public int faktorialDC(int n){
        if (n==1){
            return 1;
        }else{
            int fakto = n*faktorialDC(n-1);
            return fakto;
        }
    }
}
