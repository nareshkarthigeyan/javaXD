import javax.swing.*;
import java.awt.event.*;

class prgm10 extends JFrame {
    prgm10(){
        setTitle("Swing app with button and inheriance!");
        setLayout(null);
        JButton button = new JButton("Click Me!");
        button.setBounds(100, 100, 120, 40);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Buton Clicked!");
            }
        });
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new prgm10();
            }
        });
    }
}
