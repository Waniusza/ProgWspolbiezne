/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.waniusza.lesson1;

/**
 *
 * @author student
 */
public class ABCThread extends Thread{
    
    public void run() {
         for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i);
            System.out.flush();
            
//            Logger.getLogger(ABCThread.class.getName()).log(Level.INFO, null, i);
            BeLazy.doNothingForOneSecond();
        }
    }
}
