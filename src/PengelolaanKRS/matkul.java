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
import javax.swing.table.DefaultTableModel;

public class matkul {
    Connection koneksi = new Koneksi().koneksiDB();
    
    public void insert(String kd_matkul, String nama_matkul, String sks, String semester, String dosen){
        try {
            String SQL = " insert into matkul values ( '"+kd_matkul+"' , '"+nama_matkul+"' , '"+sks+"' , '"+semester+"','"+dosen+"' )";
            
            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void select (String sql, DefaultTableModel model){
        int a = 1;
        try {
            Statement statement = koneksi.createStatement();
            ResultSet mkl = statement.executeQuery(sql);
            while (mkl.next()){
                String kd_matkul = mkl.getString(1);
                String matkul = mkl.getString(2);
                String sks = mkl.getString(3);
                String semester = mkl.getString(4);
                String dosen = mkl.getString(5);
                String [] data = {kd_matkul, matkul, sks, semester, dosen};
                model.addRow(data);
                a++;
            }
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void update(String kd_matkul, String nama_matkul, String sks, String semester, String dosen){
        try {
            String SQL = "UPDATE matkul set nama_matkul='"+nama_matkul+"',sks='"+sks+"',semester='"+semester+"', dosen= '"+dosen+"' where kd_matkul='"+kd_matkul+"'";
            
            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(String kd_matkul){
        try {
            String SQL = "delete from matkul where kd_matkul='"+kd_matkul+"'";
        
            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
