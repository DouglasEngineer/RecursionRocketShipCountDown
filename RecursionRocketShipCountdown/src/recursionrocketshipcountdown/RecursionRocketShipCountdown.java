/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionrocketshipcountdown;

/**
 *
 * @author DouglasD
 */
public class RecursionRocketShipCountdown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The countdown has begun!!");
        countDown(10);
        System.out.println("BlastOff!!");
    }

    private static void countDown(int count) {
        if(count == 0){//base case
            return;
        }
        System.out.println(count+"...");
        countDown(count-1);
    }
    
}
