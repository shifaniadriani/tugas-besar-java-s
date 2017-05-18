import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home
{
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

                JTextField txt1 = new JTextField();
                JTextField txt2 = new JTextField();
                JButton button = new JButton("Login");
                JButton button1 = new JButton("Sign Up");

                JLabel a = new JLabel("Username  :");
                a.setSize(100,30);
                a.setBounds(70,50, 500, 50);

                JLabel b = new JLabel("Password  :");
                b.setSize(100,30);
                b.setBounds(70,100, 500, 50);

                txt1.setEnabled(true);
                txt2.setEnabled(true);
                txt1.setBounds(160, 65, 150,25 );
                txt2.setBounds(160, 115, 150,25 );
                button.setBounds(70, 180, 100,25 );
                button1.setBounds(200, 180, 100,25 );

                butt.setVisible(true);
                butt.setSize(400, 400);
                butt.setLocationRelativeTo(null);
                butt.setLayout(null);
                butt.add(a);
                butt.add(b);
                butt.add(txt1);
                butt.add(txt2);
                butt.add(button);
                butt.add(button1);
                butt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        //  Memasukkan Button ke dalam Frame
        frame.add(button);

        //  Menentukan posisi Button di dalam Frame
        button.setBounds(255, 200, 100, 50);
    }
}