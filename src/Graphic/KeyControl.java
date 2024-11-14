package Graphic;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControl implements KeyListener {
    boolean up, down, right, left;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP){
            up = true;
            down = false;
            left = false;
            right = false;
        } else if (code == KeyEvent.VK_DOWN) {
            down = true;
            up = false;
            left = false;
            right = false;
        }
        else if (code == KeyEvent.VK_LEFT) {
            down = false;
            up = false;
            left = true;
            right = false;
        }
        else if (code == KeyEvent.VK_RIGHT){
            down = false;
            up = false;
            left = false;
            right = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_UP){
            up = false;
        }
        else if (code == KeyEvent.VK_DOWN){
            down = false;
        }
        else if (code == KeyEvent.VK_LEFT){
            left = false;
        }
        else if (code == KeyEvent.VK_RIGHT){
            right = false;
        }

    }
}
