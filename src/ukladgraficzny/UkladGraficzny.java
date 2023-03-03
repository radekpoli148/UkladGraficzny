package ukladgraficzny;

import javax.swing.*;
import java.awt.*;


public class UkladGraficzny extends JFrame 
{

    public UkladGraficzny()
    {
        super("Układ graficzny (Layout)");
        this.setBounds(300, 320, 300, 200);
        
        initComponents();
        //this.pack();
        this.setDefaultCloseOperation(3);
    }
    
    public void initComponents()
    {
        centrum = new JButton("Jestem w centrum");
        gora = new JButton("Jestem na gorze");
        dol = new JButton("Jestem na dole");
        prawa = new JButton("Jestem po prawej");
        lewa = new JButton("Jestem po lewej");
        
        Container kontener = this.getContentPane();
        
        //kontener.add(centrum, BorderLayout.CENTER);
        //kontener.add(gora, BorderLayout.PAGE_START);
        //kontener.add(dol, BorderLayout.PAGE_END);
        //kontener.add(prawa, BorderLayout.LINE_END);
        //kontener.add(lewa, BorderLayout.LINE_START);
        
        centrum.setLocation(100, 50);
        centrum.setSize(centrum.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(centrum);
    }
    
    JButton centrum;
    JButton gora;
    JButton dol;
    JButton prawa;
    JButton lewa;
    
    public static void main(String[] args) {
        new UkladGraficzny().setVisible(true);
    }
    
}
