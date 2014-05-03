/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.awt.Graphics2D;
import javax.swing.ImageIcon;

/**
 *
 * @author Aleix
 */
class Enemy {

    Game game;
    int x;
    int y;
    int speedX;
    int speedY;
    
    int speedy;
    int ampladaEnemy;
    int alturaEnemy;
    
    public Enemy(Game game, int y, int x) {
        this.game = game;
        this.y = y;
        speedX = -1;
        speedy = 0;
        this.x = x;
        ampladaEnemy = 40;
        alturaEnemy = 250;
        randomizehlol();
    }

    void paint(Graphics2D g2d) {
        ImageIcon welcome = new ImageIcon(getClass().getResource("Bandera_Argentina.png"));
        g2d.drawImage(welcome.getImage(), x, y, ampladaEnemy, alturaEnemy, null);
        g2d.drawImage(welcome.getImage(), x, alturaEnemy+105
                , ampladaEnemy, 900, null);
//        g2d.fillRect(x, y, ampladaEnemy, alturaEnemy);
//        g2d.fillRect(x, alturaEnemy+120, ampladaEnemy, 900); //akest 900 surt per sota de la pantalla pero es igual
        //el 150 es la dificultat
        
//                enemy = new Enemy(this, 0, 400); //en akest 0 haura d'anar el random heigth
//        enemy2 = new Enemy(this, 360, 400);
//        enemy3 = new Enemy(this, 360, 600);
//        enemy4 = new Enemy(this, 0, 600);
//        enemy5 = new Enemy(this, 0, 800);
//        enemy6 = new Enemy(this, 360, 800);
    }
    
    void move() { 
        if (x == -40) { //aixo depen de l'amplada del enemy
            x = 600;
            randomizehlol();
        }
        x=x+speedX;
    }
    
    int getX() {
        return x;
    }
    
    int getY() {
        return y;
    }

    void setSpeed(int i) {
        speedX = i;
    }
    void randomizehlol() {
       int yx = (int) (Math.random()*5); //pot donar 5 casos
        switch (yx) {
            case 1:
                alturaEnemy = 100;
                break;
            case 2: 
                alturaEnemy = 200;
                break;
            case 3: alturaEnemy = 300;
                break;
            case 4: alturaEnemy = 50;
                break;
            case 5: alturaEnemy = 340;
                break;
            default:
                alturaEnemy=250;
        }
    }
    
    int getCostatEsquerraDAdalt() {
        return alturaEnemy;
    }
    int getCostatInferior() {
        return ampladaEnemy;
    }
    int getCostatSuperior() {
        return ampladaEnemy;
    }
    int getCostatEsquerraDAbaix() {
    return alturaEnemy+120;
}
}
