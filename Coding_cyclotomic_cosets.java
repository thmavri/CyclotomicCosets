/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coding_cyclotomic_cosets;
/**
 *
 * @author Themis Mavridis
 */
public class Coding_cyclotomic_cosets {

    /**
     * @param args the command line arguments
     */
    //The following code calculates the cyclotomic cosets that are need for the calculation of idempotents modulo 1+x^n of some degree
    //e.g problem: Find the two idempotents modulo 1 +x^15 of degree 12 in which the constant term and the coefficient of x^5 are non-zero
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        double coset=0;
        double power=0;
        int r=1;
        boolean rfound=false;
        while(!rfound){
            if(Math.pow(2,r)%n==1){
                rfound=true;
            }
            r++;
        }
        for(double i=0;i<n;i++){
            System.out.print("\n\n---------------------- C ="+i+"-----------------");
            for(double j=0;j<r-1;j++){
                power=Math.pow((double)2,j);
                coset=(power*(i))%n;
                System.out.print("\nC"+i+"="+coset);
            }
        }
        
    }
}
