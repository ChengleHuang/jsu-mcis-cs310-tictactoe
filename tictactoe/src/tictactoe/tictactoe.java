package tictactoe;
import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class tictactoe extends Applet implements MouseListener, ActionListener, WindowListener{
	private static final long serialVersionUID = 1L;
	JFrame f;
    int flag = 2;
    int n;
    int m;
    int i = 0;
    static int bug = 0;
    char[] click = new char[9];
    JButton clear;
    JButton exit;
    String s1 = "";
    
    public tictactoe(){
        this.f = new JFrame("TicTacToe");
        this.clear = new JButton("CLEAR");
        this.exit = new JButton("EXIT");
        this.f.add(this.clear);
        this.f.add(this.exit);
        this.f.addWindowListener(this);
        this.f.setLayout(null);
        this.f.setVisible(true);
        this.f.setSize(800, 600);
        this.clear.setBounds(650, 50, 90, 60);
        this.exit.setBounds(650, 250, 90, 60);
        
        this.f.addMouseListener(this);
        for (this.i = 0; this.i < 9; this.i += 1)
        this.click[this.i] = 'B';
        this.clear.addActionListener(this);
        this.exit.addActionListener(this);
        
        String message = "Please click on the frame \n    \nto start the game \n";
        
        JOptionPane pane = new JOptionPane(message);
        JDialog dialog = pane.createDialog(new JFrame(), "Dilaog");
        dialog.show();
        Graphics g = this.f.getGraphics();
        g.drawLine(200, 0, 200, 600);
        g.drawLine(400, 0, 400, 600);
        g.drawLine(0, 200, 600, 200);
        g.drawLine(0, 400, 600, 400);
        g.drawLine(600, 0, 600, 600);
    }
    
    public void keyPressed(KeyEvent k)
    {
        System.out.print("");
    }
    
    public void keyTyped(KeyEvent k) {
        this.s1 += k.getKeyChar();
    }
    
    public void keyReleased(KeyEvent k) {
        System.out.print("");
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == this.clear)
        {
            this.f.setVisible(false);
            bug = 0;
            new tictactoe();
        }
        if (ae.getSource() == this.exit)
        {
            System.exit(0);
        }
    }
    
    public void windowClosing(WindowEvent de)
    {
    System.exit(0); }
    
    public void windowOpened(WindowEvent de) { }
    
    public void windowClosed(WindowEvent de) { }
    
    public void windowActivated(WindowEvent de) { }
    
    public void windowDeactivated(WindowEvent de) { }
    
    public void windowIconified(WindowEvent de) { }
    
    public void windowDeiconified(WindowEvent de) {  }
    
    public void mouseClicked(MouseEvent e) { Graphics2D g2;
        Graphics g = this.f.getGraphics();
        g.drawLine(200, 0, 200, 600);
        g.drawLine(400, 0, 400, 600);
        g.drawLine(0, 200, 600, 200);
        g.drawLine(0, 400, 600, 400);
        g.drawLine(600, 0, 600, 600);
        this.flag -= 1;
        int x = e.getX();
        int y = e.getY();
        if (this.flag == 1)
        {
            if ((x < 200) && (y < 200)) { this.m = 0; this.n = 0; this.click[0] = 'R'; }
            if ((x > 200) && (x < 400) && (y < 200)) { this.m = 200; this.n = 0; this.click[1] = 'R'; }
            if ((x > 400) && (x < 600) && (y < 200)) { this.m = 400; this.n = 0; this.click[2] = 'R'; }
            if ((x < 200) && (y > 200) && (y < 400)) { this.m = 0; this.n = 200; this.click[3] = 'R'; }
            if ((x > 200) && (x < 400) && (y > 200) && (y < 400)) { this.m = 200; this.n = 200; this.click[4] = 'R'; }
            if ((x > 400) && (x < 600) && (y > 200) && (y < 400)) { this.m = 400; this.n = 200; this.click[5] = 'R'; }
            if ((x < 200) && (y > 400) && (y < 600)) { this.m = 0; this.n = 400; this.click[6] = 'R'; }
            if ((x > 200) && (x < 400) && (y > 400) && (y < 600)) { this.m = 200; this.n = 400; this.click[7] = 'R'; }
            if ((x > 400) && (x < 600) && (y > 400) && (y < 600)) { this.m = 400; this.n = 400; this.click[8] = 'R'; }
            g.setColor(Color.blue);
            g2 = (Graphics2D)g;
            g2.setStroke(new BasicStroke(10.0F));
            g.drawOval(this.m + 10, this.n + 10, 159, 159);
        }
        
        if (this.flag == 0)
        {
            if ((x < 200) && (y < 200)) { this.m = 0; this.n = 20; this.click[0] = 'P'; }
            if ((x > 200) && (x < 400) && (y < 200)) { this.m = 200; this.n = 20; this.click[1] = 'P'; }
            if ((x > 400) && (x < 600) && (y < 200)) { this.m = 400; this.n = 20; this.click[2] = 'P'; }
            if ((x < 200) && (y > 200) && (y < 400)) { this.m = 0; this.n = 200; this.click[3] = 'P'; }
            if ((x > 200) && (x < 400) && (y > 200) && (y < 400)) { this.m = 200; this.n = 200; this.click[4] = 'P'; }
            if ((x > 400) && (x < 600) && (y > 200) && (y < 400)) { this.m = 400; this.n = 200; this.click[5] = 'P'; }
            if ((x < 200) && (y > 400) && (y < 600)) { this.m = 0; this.n = 400; this.click[6] = 'P'; }
            if ((x > 200) && (x < 400) && (y > 400) && (y < 600)) { this.m = 200; this.n = 400; this.click[7] = 'P'; }
            if ((x > 400) && (x < 600) && (y > 400) && (y < 600)) { this.m = 400; this.n = 400; this.click[8] = 'P'; }
            g2 = (Graphics2D)g;
            g2.setStroke(new BasicStroke(10.0F));
            g.setColor(Color.red);
            g.drawLine(this.m + 10, this.n + 13, this.m + 169, this.n + 164);
            g.drawLine(this.m + 169, this.n + 10, this.m + 10, this.n + 169);
            this.flag += 2;
        }
        
        for (this.i = 0; this.i < 3; this.i += 1)
        {
            if ((this.click[this.i] != 'B') &&
            (this.click[(this.i + 3)] == this.click[this.i]) && (this.click[(this.i + 6)] == this.click[this.i]))
            {
                new Board().win();
                bug = 1;
            }
        }
        
        for (this.i = 0; this.i < 7; this.i += 1)
        {
            if (this.click[this.i] != 'B')
            {
                if ((this.click[this.i] == this.click[(this.i + 1)]) && (this.click[this.i] == this.click[(this.i + 2)]))
                {
                    new Board().win();
                    bug = 1;
                }
                this.i += 2;
            }
            else {
                this.i += 2;
            }
        }
        if ((this.click[4] != 'B') && ((((this.click[0] == this.click[4]) && (this.click[4] == this.click[8])) || ((this.click[2] == this.click[4]) && (this.click[4] == this.click[6])))))
        {
            new Board().win();
            bug = 1;
        }
        
        for (this.i = 0; (this.i < 9) &&(this.click[this.i] != 'B'); this.i += 1){
            if (this.i == 8){
                if (bug == 0)
                new Board().draw();
                bug = 0;
            }
        }
    }
    
    public void mouseReleased(MouseEvent e){
        System.out.print("");
    }
    
    public void mouseEntered(MouseEvent e){
        System.out.print("");
    }
    
    public void mouseExited(MouseEvent e){
        System.out.print("");
    }
    
    public void mousePressed(MouseEvent e) {
        System.out.print("");
    }
    public static void main(String[] args){
        new tictactoe();
    }
}
