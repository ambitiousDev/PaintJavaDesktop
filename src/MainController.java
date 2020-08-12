
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saber
 */
public class MainController {

    MainForm form = new MainForm();
    JPanel black, red, green, blue, cyan, magenta, yellow, clear, board;
    Graphics g;

    int prevX, prevY;

    public MainController() {
        form.setVisible(true);
        black = form.getBlackPanel();
        red = form.getRedPanel();
        green = form.getGreenPanel();
        blue = form.getBluePanel();
        cyan = form.getCyanPanel();
        magenta = form.getMagentaPanel();
        yellow = form.getYellowPanel();
        clear = form.getClearPanel();
        board = form.getjPanel1();
        g = board.getGraphics();
        g.setColor(Color.BLACK);
        JPanel[] panels = new JPanel[]{black, red, green, blue, cyan, magenta, yellow};

        black.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBorder(panels);
                setBorder(black);
                g.setColor(Color.BLACK);
            }
        });
        red.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBorder(panels);
                setBorder(red);
                g.setColor(Color.RED);
            }
        });
        green.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBorder(panels);
                setBorder(green);
                g.setColor(Color.GREEN);
            }
        });
        blue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBorder(panels);
                setBorder(blue);
                g.setColor(Color.BLUE);
            }
        });
        cyan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBorder(panels);
                setBorder(cyan);
                g.setColor(Color.CYAN);
            }
        });
        magenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBorder(panels);
                setBorder(magenta);
                g.setColor(Color.MAGENTA);
            }
        });
        yellow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBorder(panels);
                setBorder(yellow);
                g.setColor(Color.YELLOW);
            }
        });

        board.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                prevX = evt.getX();
                prevY = evt.getY();
            }

        });

        board.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                int x = evt.getX();
                int y = evt.getY();
                g.drawLine(prevX, prevY, x, y);
                prevX = x;
                prevY = y;
            }
        });

        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                board.repaint();
            }
        });
    }

    private void setBorder(JPanel panel) {
        panel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 6));
    }

    private void removeBorder(JPanel[] panels) {
        //run through every array element
        for (JPanel panel : panels) {
            panel.setBorder(BorderFactory.createEmptyBorder());
        }
    }

}
