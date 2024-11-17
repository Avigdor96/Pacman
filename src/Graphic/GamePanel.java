package Graphic;

import objects.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class GamePanel extends JPanel implements Runnable{
    int x, y;
    final int width_height = 25;
    int speed = 4;
    KeyControl keyControl = new KeyControl();
    Thread thread;
    Pacman pacman = new Pacman(x, y);
    Point posPac = pacman.getPoint();

    public GamePanel() {
        this.addKeyListener(keyControl);
        this.setFocusable(true);
        thread = new Thread(this);
        thread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[][] board = numOfElement();
        for (int i = 0; i < board.length; i++) {
            y = i * width_height;
            for (int j = 0; j < board[i].length; j++) {
                x  = j * width_height;
                if (board[i][j] == 1) {
                    g.setColor(Color.cyan);
                    g.fillRect(x,y,25,25);
                    Block block = new Block(x, y);
                }
                else if (board[i][j] == 2) {
                    g.setColor(Color.orange);
                    g.fillOval(x + 7,y + 7,13,13);
                    Coins coin = new Coins(x, y);
                }
                else if (board[i][j] == 3) {
                    g.setColor(Color.red);
                    //g.fillOval(x + 5, y + 3,20,20);
                    BigCoins bigCoins = new BigCoins(x, y);
                } else if (board[i][j] == 4) {
                    g.drawImage(pacman.getImage(), x += 12, y, width_height, width_height, this);
                } else if (board[i][j] == 5) {
                    Ghost pinkGhost = new Ghost(new ImageIcon("src/pictures/GhostPink.jpg"));
                    g.drawImage(pinkGhost.getImage(), x, y, width_height, width_height, this);
                } else if (board[i][j] == 6) {
                    Ghost yellowGhost = new Ghost(new ImageIcon("src/pictures/GhostYelow.jpg"));
                    g.drawImage(yellowGhost.getImage(), x , y, width_height, width_height, this);
                }else if (board[i][j] == 7) {
                    Ghost greenGhost = new Ghost(new ImageIcon("src/pictures/GhostGreen.jpg"));
                    g.drawImage(greenGhost.getImage(), x , y, width_height, width_height, this);
                }else if (board[i][j] == 8) {
                    Ghost blueGhost = new Ghost(new ImageIcon("src/pictures/GhostBlue.jpg"));
                    g.drawImage(blueGhost.getImage(), x , y, width_height, width_height, this);
                }

            }
        }

    }

    public static int[][] numOfElement(){ //Empty = 0, Block = 1, Coins = 2,BigCoins = 3;
        int[][] board = {
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,2,2,2,2,2,2,2,2,2,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,2,1},
                {1,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},
                {1,3,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,3,1},
                {1,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},
                {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
                {1,2,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,2,1,1,2,1,1,1,1,2,1},
                {1,2,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,2,1,1,2,1,1,1,1,2,1},
                {1,2,2,2,2,2,2,1,1,2,2,2,2,1,1,2,2,2,2,1,1,2,2,2,2,2,2,1},
                {1,1,1,1,1,1,2,1,1,1,1,1,0,1,1,0,1,1,1,1,1,2,1,1,1,1,1,1},
                {0,0,0,0,0,1,2,1,1,1,1,1,0,1,1,0,1,1,1,1,1,2,1,0,0,0,0,0},
                {0,0,0,0,0,1,2,1,1,0,0,0,0,0,0,0,0,0,0,1,1,2,1,0,0,0,0,0},
                {0,0,0,0,0,1,2,1,1,0,0,0,0,0,0,0,0,0,0,1,1,2,1,0,0,0,0,0},
                {1,1,1,1,1,1,2,1,1,0,0,1,1,0,0,1,1,0,0,1,1,2,1,1,1,1,1,1},
                {0,0,0,0,0,0,2,0,0,0,0,1,5,6,7,8,1,0,0,0,0,2,0,0,0,0,0,0},
                {1,1,1,1,1,1,2,1,1,0,0,1,1,1,1,1,1,0,0,1,1,2,1,1,1,1,1,1},
                {0,0,0,0,0,1,2,1,1,0,0,0,0,0,0,0,0,0,0,1,1,2,1,0,0,0,0,0},
                {0,0,0,0,0,1,2,1,1,0,0,0,0,0,0,0,0,0,0,1,1,2,1,0,0,0,0,0},
                {0,0,0,0,0,1,2,1,1,0,0,1,1,1,1,1,1,0,0,1,1,2,1,0,0,0,0,0},
                {1,1,1,1,1,1,2,1,1,0,0,1,1,1,1,1,1,0,0,1,1,2,1,1,1,1,1,1},
                {1,2,2,2,2,2,2,2,2,2,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,2,1},
                {1,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},
                {1,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},
                {1,3,2,2,1,1,2,2,2,2,2,2,2,4,0,2,2,2,2,2,2,2,1,1,2,2,3,1},
                {1,1,1,2,1,1,2,1,1,2,1,1,1,1,1,1,1,1,2,1,1,2,1,1,2,1,1,1},
                {1,1,1,2,1,1,2,1,1,2,1,1,1,1,1,1,1,1,2,1,1,2,1,1,2,1,1,1},
                {1,2,2,2,2,2,2,1,1,2,2,2,2,1,1,2,2,2,2,1,1,2,2,2,2,2,2,1},
                {1,2,1,1,1,1,1,1,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,1,1,2,1},
                {1,2,1,1,1,1,1,1,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,1,1,2,1},
                {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        };

        return board;
    }
    private void update() {
        if (keyControl.up){
            pacman.setImagePacman(new ImageIcon("src/pictures/PacmanUp.jpg"));
            y -= speed;
        } else if (keyControl.down){
            pacman.setImagePacman(new ImageIcon("src/pictures/PacmanDown.jpg"));
            y += speed;
        } else if (keyControl.right) {
            pacman.setImagePacman(new ImageIcon("src/pictures/PacmanRight.jpg"));
            x += speed;
        } else if (keyControl.left) {
            pacman.setImagePacman(new ImageIcon("src/pictures/pacmanToLeft.jpg"));
            x -= speed;
        }
        pacman.setPoint(x, y);


    }


    @Override
    public void run() {
        while (true) {
            update();
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
