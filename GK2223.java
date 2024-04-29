

package com.mycompany.gk2223;
abstract class Tho {

    public Tho(String maTho, String tenTho, int loaiTho, int mucLuong, int ngayLamCuoiTuan, int ngayThuong, int ngayNghiCoPhep, int ngayNghiKhongPhep) {
        this.maTho = maTho;
        this.tenTho = tenTho;
        this.loaiTho = loaiTho;
        this.mucLuong = mucLuong;
        this.ngayLamCuoiTuan = ngayLamCuoiTuan;
        this.ngayThuong = ngayThuong;
        this.ngayNghiCoPhep = ngayNghiCoPhep;
        this.ngayNghiKhongPhep = ngayNghiKhongPhep;
    }

    public Tho() {
    }
   
    
    protected String maTho;
    protected String tenTho;
    protected int loaiTho;
    protected int mucLuong;
    protected int ngayLamCuoiTuan;
    protected int ngayThuong;
    protected int ngayNghiCoPhep;
    protected int ngayNghiKhongPhep;
}
    
     class ThoChinh extends Tho {

        public ThoChinh() {}

    public ThoChinh(int heSo, String maTho, String tenTho, int loaiTho, int mucLuong, int ngayLamCuoiTuan, int ngayThuong, int ngayNghiCoPhep, int ngayNghiKhongPhep) {
        super(maTho, tenTho, loaiTho, mucLuong, ngayLamCuoiTuan, ngayThuong, ngayNghiCoPhep, ngayNghiKhongPhep);
        this.heSo = heSo;
    }

    public ThoChinh(int heSo) {
        this.heSo = heSo;
    }
           private int heSo;
    }
    
     class ThoPhu extends Tho {
        
    }
    

public class GK2223 {

    
    public static void main(String[] args) {
        ThoChinh chinh = new ThoChinh(10);
        
        System.out.println("Hello World!");
    }
}
