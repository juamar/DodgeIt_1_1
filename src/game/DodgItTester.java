/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;


import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Aleix
 */
public class DodgItTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
		// inicializo ventana
		JFrame finestra = new JFrame("Dodge It!");
		// instancio Game
        Game di = new Game();
        Container cont = finestra.getContentPane();   //que es esto?
        int puntuation = 0;
		// me busco los puntos en Game
        puntuation = di.getPunts();
        JLabel puntuacio = new JLabel("Puntuació: "+ puntuation);  //un JLabel aquí?
        cont.add(di, BorderLayout.CENTER);
        cont.add(puntuacio, BorderLayout.SOUTH);
        finestra.add(di);
        finestra.setSize(400,500);
        finestra.setVisible(true) ;
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
 
        int milesimas = 0;
        while (di.getEndGame()==false) {
                puntuation = di.getPunts();
                        puntuacio.setText("Puntuació: "+puntuation);
                        di.move();
			di.repaint();
			Thread.sleep(10);
			// que quieres hacer aquí? Imagino que deberas usar la Clase Timer. Hay 2 en java. Luego te enseño una que el pep creo que no os explico que yo use para el JocVidaX3.
                        // if estic apretant space 
                        // fes di.jump();
                        //Thread.sleep(20);
                        milesimas =milesimas+10;
//                        if (milesimas == 5000) {
//                            di.setTime(-2);
//                        }
//                        if (milesimas == 20000) {
//                            di.setTime(-3);
//                        }
//                        if (milesimas == 33000) {
//                            di.setTime(-10);
//                        }
        }
    }
}
