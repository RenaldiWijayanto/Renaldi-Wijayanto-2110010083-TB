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
/**
 *
 * @author ASUS
 */
public class mahasiswa {
    Connection koneksi = new Koneksi().koneksiDB();
    
    public void insert(String nim, String nama, String alamat, String jk, String jurusan, String studi){
        try {
            String SQL = " insert into mhs values ('"+nim+"','"+nama+"','"+alamat+"','"+jk+"','"+jurusan+"','"+studi+"')";
            
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
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                String nim = rs.getString(1);
                String nama = rs.getString(2);
                String alamat = rs.getString(3);
                String jk = rs.getString(4);
                String jurusan = rs.getString(5);
                String studi = rs.getString(6);
                
                String [] data = {nim, nama, alamat, jk, jurusan, studi};
                model.addRow(data);
                a++;
            }
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void update(String nim, String nama, String alamat, String jk, String jurusan, String studi){
        try {
            String SQL = "update mhs set nama='"+nama+"', alamat='"+alamat+"',jk='"+jk+"',jurusan='"+jurusan+"',studi='"+studi+"' where nim='"+nim+"'";
            
            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(String nim){
        try {
            String SQL = "delete from mhs where nim='"+nim+"'";
        
            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
