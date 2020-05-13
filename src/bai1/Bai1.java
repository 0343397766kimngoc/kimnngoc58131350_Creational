/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ngoc
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        String date = "1998/01/11";
        Date ngayBan = new SimpleDateFormat("yyy/mm/dd").parse(date);
        HoaDon hd_header = new HoaDon.HoaDonHeader()
                .addMaHoaDon("1")
                .addNgayBan(ngayBan)
                .addTenKhachHang("Nguyen Thi Kim Ngoc")
                .build();
        System.out.println(hd_header.toString());
        HoaDon.CTHD CTHD1 = new HoaDon.CTHD()
                .addSanPham("vay body")
                .addSoLuong(10)
                .addDonGia(100)
                .addChietKhau(10)
                .getCTHD(); 
        HoaDon.CTHD CTHD2 = new HoaDon.CTHD()
                .addSanPham("ao so mi")
                .addSoLuong(12)
                .addDonGia(100)
                .addChietKhau(10)
                .getCTHD(); 
        hd_header.addCTHD(CTHD1);
        hd_header.addCTHD(CTHD2);
        for (int i = 0; i < hd_header.CTHD.size(); i++) {
            System.out.println(hd_header.getCTHD(hd_header.CTHD.get(i)));
        }
    }
    
}
