package Graphic;

import objects.*;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    int speed = 5;
    KeyControl keyControl = new KeyControl();
    Thread thread;
    CreateBoard createBoard = new CreateBoard();
    Pacman pacman = new Pacman(12 * 25, 21 * 25);
    GeneralElement[][] startBoard = createBoard.newArray(createBoard.board, pacman);


    public GamePanel() {
        this.addKeyListener(keyControl);
        this.setFocusable(true);
        thread = new Thread(this);
        thread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < startBoard.length; i++) {
            for (int j = 0; j < startBoard[i].length; j++) {
                g.drawImage(startBoard[i][j].getImage(), startBoard[i][j].getPoint().x, startBoard[i][j].getPoint().y, 25, 25, this);
            }
        }
    }

    public void movePacman(Pacman pacman) {
        int posX = pacman.getPoint().x;
        int posY = pacman.getPoint().y;
        startBoard[posY / 25][posX / 25] = new Empty(posX, posY);
        if (keyControl.up) {
            if (posX % 25 == 0) {
                pacman.setImagePacman(new ImageIcon("src/pictures/PacmanUp.jpg"));
                if (!(startBoard[(posY - speed) / 25][posX / 25] instanceof Block)) {
                    //startBoard[(posY - speed) / 25][posX / 25] = new Empty(startBoard[(posY - speed) / 25][posX / 25].getPoint().x, startBoard[(posY - speed) / 25][posX / 25].getPoint().y);
                    pacman.getPoint().y = posY - speed;
                }
            }
        }
        if (keyControl.down) {
            if (posX % 25 == 0) {
                pacman.setImagePacman(new ImageIcon("src/pictures/PacmanDown.jpg"));
                if (!(startBoard[(posY + speed + 25) / 25][posX / 25] instanceof Block)) {
                    //startBoard[(posY + speed + 25) / 25][posX / 25] = new Empty(startBoard[(posY + speed + 25) / 25][posX / 25].getPoint().x, startBoard[(posY + speed + 25) / 25][posX / 25].getPoint().y);
                    pacman.getPoint().y = posY + speed;
                }

            }
        }
        if (keyControl.left) {
            if (posY % 25 == 0) {
                pacman.setImagePacman(new ImageIcon("src/pictures/PacmanLeft.jpg"));
                if (!(startBoard[posY / 25][(posX - speed) / 25] instanceof Block)) {
                    //startBoard[posY / 25][(posX - speed) / 25] = new Empty(startBoard[posY / 25][(posX - speed) / 25].getPoint().x, startBoard[posY / 25][(posX - speed) / 25].getPoint().y);
                    pacman.getPoint().x = posX - speed;
                }

            }
        }
        if (keyControl.right) {
            if (posY % 25 == 0) {
                pacman.setImagePacman(new ImageIcon("src/pictures/PacmanRight.jpg"));
                if (!(startBoard[posY / 25][(posX + speed + 25) / 25] instanceof Block)) {
                    //startBoard[posY / 25][(posX + speed + 25) / 25] = new Empty(posX + speed, posY);
                    pacman.getPoint().x += speed;
                }
            }


        }
        startBoard[pacman.getPoint().y / 25][pacman.getPoint().x / 25] = pacman;
    }

    private void update() {
        movePacman(pacman);
    }


    @Override
    public void run() {
        while (true) {
            update();
            repaint();
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
