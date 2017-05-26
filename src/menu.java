import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu {
    public menu()
    {
        JFrame menu = new JFrame();
        menu.setTitle("Menu");
        menu.setSize(600, 500);
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setResizable(false);
        menu.setLayout(null);
        JLabel label = new JLabel("MENU");
        label.setFont(new Font("Century Gothic",Font.BOLD,25));
        label.setBounds(270,50, 500, 100);
        menu.add(label);


        JButton data = new JButton("Data Obat");
        data.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataobat button1 = new dataobat();
                menu.dispose();

            }
        });

        JButton transaksi = new JButton("Transaksi");
        transaksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transaksi button2 = new transaksi();
                menu.dispose();
            }
        });

        menu.add(data);
        data.setBounds(170, 200, 100, 50);
        menu.add(transaksi);
        transaksi.setBounds(340, 200, 100, 50);


        menu.setVisible(true);
    }


}