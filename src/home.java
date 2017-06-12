import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home
{
    public home(){}
    public static void main(String[] args)
    {
        //  Membuat objek JFrame
        JFrame frame = new JFrame();

        //  Menentukan title bar di Frame
        frame.setTitle("Tugas Besar");

        //  Menentukan ukuran Frame
        frame.setSize(600, 500);

        //  Membuat letak Frame berada di tengat ketika program dijalankan
        frame.setLocationRelativeTo(null);

        //  Mengaktifkan event agar ketika frame di close maka, program akan berhenti
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  [Optional] Untuk menonaktifkan button maximize di Frame
        frame.setResizable(false);

        //  Aktifkan Visible Frame
        frame.setVisible(true);

        //  Membuat Objek JLabel
        JLabel label = new JLabel("WELCOME TO APOTEK TERSERAH");

        label.setFont(new Font("Century Gothic",Font.BOLD,25));

        //  Menentukan layout Frame
        frame.setLayout(null);

        //  Memasukkan Label ke dalam Frame
        frame.add(label);

        //  Menentukan posisi label di dalam Frame. Menentukan Width dan Height
        label.setBounds(115,50, 500, 100);   //  20 = posisi X; 20 = posisi Y; 100 = Width; 30; Height = 30

        //  Membuat Objek Button
        JButton button = new JButton("Login");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login butt = new login();
                frame.dispose();
            }
        });

        //  Memasukkan Button ke dalam Frame
        frame.add(button);

        //  Menentukan posisi Button di dalam Frame
        button.setBounds(255, 200, 100, 50);
    }
}