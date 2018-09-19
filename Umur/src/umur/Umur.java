/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package umur;

/**
 *
 * @author Kurniawan
 */
public class Umur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /**    int umur = 20;
        boolean cantik = false;
        
        if(umur > 23 && cantik){
            System.out.println("Saya mau Menikah!");
        }else if(umur > 23){
            System.out.println("Saya pikir pikir");
        }else{
            System.out.println("saya tidak mau menikah");
        }*/
        int n = 5;
         for(int i=1;i<=n;i++){
             for(int j=1;j<=n;j++){
             if(j==1 || j==n || i==1 || i==n){
                 System.out.print("#");
             }else{
                 System.out.print("*");
             }
           }
         System.out.println("");
             
         }
    }
}
