import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.file.FileAlreadyExistsException;

public class Paint extends JPanel {
    private JFrame jFrame;
    private Cell[][] cells;

    public Paint (String name){
        jFrame = new JFrame(name);
        jFrame.add(this);
        jFrame.setVisible(true);
        jFrame.setBounds(0,0,1920,1080);

        cells = new Cell[192][108];
        for (int i = 0; i < 192; i++) {
            for (int j = 0; j < 108; j++) {
                cells[i][j] = new Cell(i*10, j*10, false);
            }
        }

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {

                int x, y;
                x = Math.round(me.getX() / 10);
                y = Math.round(me.getY() / 10);
//                gfrgf
                if (cells[x][y].isBlack()){
                    cells[x][y].setBlack(false);
                }else{
                    cells[x][y].setBlack(true);
                }
// rgjioergerg90iioefiguer90gui8uugiuehiuwrier
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.drawImage(mCharacter.getImage(), mCharacter.getX(), mCharacter.getY(), null);
        for (int i = 0; i < 192; i++) {
            g.drawLine(i*10, 0, i*10, 1080);
        }
        for (int i = 0; i < 108; i++) {
            g.drawLine(0, i*10, 1920, i*10);
        }

        for (int i = 0; i < 192; i++) {
            for (int j = 0; j < 108; j++) {
                if (cells[i][j].isBlack()){
                    g.fillRect(i*10, j*10, 10, 10);
                }
            }
        }
    }
}
