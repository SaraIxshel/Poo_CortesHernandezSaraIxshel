/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarai
 */
import java.util.loggin.Level;
import java.util.loggin.Logger;
import static java.lang.Thread.sleep;

public class Tortuga extends Thread{

    public void run(){
        for(in i = 0; i < 100; i++){
            System.out.println("avanza la tortuga"+i);
            
            try{
                sleep(300);
            }catch(InterruptedException ex) {
                logger.getLogger(Liebre.class.getName()).log(Level.SERVERE,null,ex);
            }
        }
        System.out.println("Termino tortuga");
    }   
}

    

