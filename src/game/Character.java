/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Aleix
 */
class Character {

    //hola
    Game game;
    int x;
    int y;
    int speedX;
    int speedY;
    boolean salto;
    int limitJump;
    int again;
    int speedy;

    public Character(Game game) {
        this.game = game;
        x = 100;
        y = 20;
        salto = false;
        limitJump=0;
        again= 0;
        speedY = +2;
    }

    /**
     * Modificado
     * @param g2d 
     */
    public void paint(Graphics2D g2d) {
        g2d.fillOval(x, y, 25, 25);
//        Image welcome = new ImageIcon(getClass().getResource("")).getImage();
//        g2d.drawImage(welcome, x, y, 25, 25, null);
    }

    public void keyReleased(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode()== KeyEvent.VK_RIGHT) {
//            speedX = 0;
//        }
//        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
//            speedY = 0;
//        }
//        speedX = 0;
//        speedY = 0;
    }

    public void keyPressed(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//            speedX = -1;
//            speedY = 0;
//        }
//        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//            speedX = 1;
//            speedY = 0;
//        }
//        if (e.getKeyCode() == KeyEvent.VK_UP) {
//            speedY = -1;
//            speedX = 0;
//        }
//        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//            speedY = 1;
//            speedX = 0;
//        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (y-70 > 0) {
            limitJump = y - 70;
            }
            else {
                limitJump = 0;
            }
            speedY = -3;
            again = limitJump;
        

        }
    }

    public void move() {

            
        y = y + speedY;
        if (y > 420) { //depen dels pixels de la finestra (ara 500)
            speedY=0;
        }        


        if (again >= y) {
            speedY = +2;
        }
        
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
//    void jump() {
//        speedY = 1;
//        
//    }


}
