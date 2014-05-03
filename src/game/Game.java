/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Aleix
 */
class Game extends JPanel {

    Character character;
    Enemy enemy;
    Enemy enemy2;
    Enemy enemy3;
//    Enemy enemy4;
    private boolean endgame;
//    private final Enemy enemy6;
//    private final Enemy enemy5;
    private int punts;

    public Game() {
        character = new Character(this);
        enemy = new Enemy(this, 0, 400); //en akest 0 haura d'anar el random heigth
        enemy2 = new Enemy(this, 0, 800);
        enemy3 = new Enemy(this, 0, 600);
//        enemy4 = new Enemy(this, 0, 600);
//        enemy5 = new Enemy(this, 0, 800);
//        enemy6 = new Enemy(this, 360, 800);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                character.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                character.keyPressed(e);
            }
        });
        setFocusable(true);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
         ImageIcon welcome = new ImageIcon(getClass().getResource("avion-fondo-pantalla.jpg"));
        g2d.drawImage(welcome.getImage(), 0, 0, getWidth(), getHeight(), null);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
//                g.fillOval(getWidth()/2-25, getHeight()/2-25, 25, 25);

        character.paint(g2d);
        enemy.paint(g2d);
        enemy2.paint(g2d);
        enemy3.paint(g2d);
//        enemy4.paint(g2d);
//        enemy5.paint(g2d);
//        enemy6.paint(g2d);
    }

    public void moveChar() {

    }

    public void dibuixar() {
        repaint();
    }

    void move() {

        if (haTocat() == true) {
            endgame = true;
        } else {
            character.move();
            enemy.move();
            enemy2.move();
            enemy3.move();
        }

    }

    boolean getEndGame() {
        return endgame;
    }

    void setTime(int i) {
        enemy.setSpeed(i);
        enemy2.setSpeed(i);
        enemy3.setSpeed(i);
    }

    int getPunts() {
        if (character.getX() == enemy.getX() || character.getX() == enemy2.getX() || character.getX() == enemy3.getX()) {
            ++punts;
        }
        return punts;
    }

    boolean haTocat() {
        boolean haTocat = false;
//         if (character.getY() == enemy.getY() && character.getX() == enemy.getX()) {
//            haTocat = true;
//        }
//        if (character.getY() == enemy2.getY() && character.getX() == enemy.getX()) {
//            haTocat = true;
//        }
//        if (character.getY() == enemy3.getY() && character.getX() == enemy.getX()) {
//            haTocat = true;
//        }
        if (character.getX() - enemy.getX() > -27 && character.getX() - enemy.getX() < 27) {
            if (character.getY() > enemy.getCostatEsquerraDAbaix()) {
                haTocat = true;
            }
            if (character.getY() < enemy.getCostatEsquerraDAdalt()) {
                haTocat = true;
            }
        }

        if (character.getX() - enemy2.getX() > -27 && character.getX() - enemy2.getX() < 27) {
            if (character.getY() > enemy2.getCostatEsquerraDAbaix()) {
                haTocat = true;
            }
            if (character.getY() < enemy2.getCostatEsquerraDAdalt()) {
                haTocat = true;
            }
        }

        if (character.getX() - enemy3.getX() > -27 && character.getX() - enemy3.getX() < 27) {
            if (character.getY() > enemy3.getCostatEsquerraDAbaix()) {
                haTocat = true;
            }
            if (character.getY() < enemy3.getCostatEsquerraDAdalt()) {
                haTocat = true;
            }
        }

        return haTocat;
    }
}
