import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class dataobat {
    Connection conn = null;
    PreparedStatement statement = null;
    ResultSet res = null;

    public dataobat(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/apotek");
            statement = conn.prepareStatement("SELECT * from obat;");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void getnPrintAllData(){
        JPanel gui = new JPanel(); //My JPanel class
        String id_obat, nama, harga, jumlah;
        DefaultTableModel dtm = new DefaultTableModel();

        try{
            res = statement.executeQuery();
            testResultSet(res);
            ResultSetMetaData meta = res.getMetaData();
            int numberOfColumns = meta.getColumnCount();
            while (res.next())
            {
                Object [] rowData = new Object[numberOfColumns];
                for (int i = 0; i < rowData.length; ++i)
                {
                    rowData[i] = res.getObject(i+1);
                }
                dtm.addRow(rowData);
            }

            dtm.fireTableDataChanged();
            //////////////////////////

        }
        catch(Exception e){
            System.err.println(e);
            e.printStackTrace();
        }
        finally{
            try{
                res.close();
                statement.close();
                conn.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public void testResultSet(ResultSet res){
        try{
            while(res.next()){
                System.out.println("ID: "+ res.getInt("id_obat"));
                System.out.println("Nama Obat: "+ res.getString("nama"));
                System.out.println("Harga: "+ res.getString("harga"));
                System.out.println("Jumlah Stok: "+ res.getString("jumlah"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static class JTable {
    }
}