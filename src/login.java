import javax.swing.*;

/**
 * Created by Rhama on 5/18/2017.
 */
public class login extends JFrame {

    public login(){
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

        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        add(a);
        add(b);
        add(txt1);
        add(txt2);
        add(button);
        add(button1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
