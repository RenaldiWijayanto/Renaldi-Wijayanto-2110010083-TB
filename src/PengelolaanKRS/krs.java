/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengelolaanKRS;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;


public class krs {
    Connection koneksi = new Koneksi().koneksiDB();
    public void insert (String nim, String nama, String kd_matkul, String nama_matkul, String sks, String semester, String dosen){
            try {
            String SQL = "insert into inputkrs values ('"+nim+"','"+nama+"','"+kd_matkul+"','"+nama_matkul+"','"+sks+"','"+semester+"','"+dosen+"')";
            
                PreparedStatement ps = koneksi.prepareStatement(SQL);
                ps. executeUpdate();
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
     }
    
    public void delete(String kd_matkul){
            try {
            
                String SQL = "delete from inputkrs where kd_matkul = '"+kd_matkul+"'";
            
                PreparedStatement ps = koneksi.prepareStatement(SQL);
                ps. executeUpdate();
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
     }
    
    public void select(String SQL,DefaultTableModel model){
        int a = 1;
        
        try {
            Statement statement = koneksi.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()){
                String nim = rs.getString(1);
                String nama = rs.getString(2);
                String kd_matkul = rs.getString(3);
                String nama_matkul = rs.getString(4);
                String sks = rs.getString(5);
                String semester = rs.getString(6);
                String dosen = rs.getString(7);
                
                String [] data = {nim, nama, kd_matkul, nama_matkul, sks, semester, dosen};
                
                model.addRow(data);
                a++;
                
            }
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    
    }
    
    public void update(String nim, String nama, String kd_matkul, String nama_matkul, String sks, String semester, String dosen){
        try {
            String SQL = "update inputkrs set nim='"+nim+"',nama='"+nama+"', nama_matkul='"+nama_matkul+"',sks='"+sks+"',semester='"+semester+"', dosen='"+dosen+"' where kd_matkul='"+kd_matkul+"'";
            
            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public  void combo (JComboBox kombo){
        kombo.removeAllItems();
        String SQL = "select kd_matkul from matkul";
        try {
            Statement statement = koneksi.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while(rs.next()){
                kombo.addItem(rs.getString("kd_matkul"));
            }
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
