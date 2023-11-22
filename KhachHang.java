/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JAVA.BanHang;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    private int maKH;
    private String tenKH;
    private String diaChiKH;
    private int sdt;
    private String gioiTinh;
    private int soTuoi;
    private ArrayList<ChiTietHoaDon> gioHang;

    public KhachHang(int maKH, String tenKH, String diaChiKH, int sdt, String gioiTinh, int soTuoi, ArrayList<ChiTietHoaDon> gioHang) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChiKH = diaChiKH;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.soTuoi = soTuoi;
        this.gioHang = gioHang;
    }

   

    public KhachHang() {
        gioHang=new ArrayList<>();
    }
    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChiKH() {
        return diaChiKH;
    }

    public void setDiaChiKH(String diaChiKH) {
        this.diaChiKH = diaChiKH;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoTuoi() {
        return soTuoi;
    }

    public void setSoTuoi(int soTuoi) {
        this.soTuoi = soTuoi;
    }
    public void xuatThongTinKhachHang() {
        System.out.println("Ma khach hang : "+this.maKH);
        System.out.println("Ten khach hang : "+this.tenKH);
        System.out.println("Dia chi khach hang : "+this.diaChiKH);
        System.out.println("So dien thoai khach hang : "+this.sdt);
        System.out.println("Gioi tinh cua khach hang : "+this.gioiTinh);
        System.out.println("So tuoi cua khach hang: "+this.soTuoi);
    }
    public void themSanPhamVaoGioHang(SanPham sanPham, int soLuong) {
        ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon(sanPham, soLuong);
        gioHang.add(chiTietHoaDon);
        System.out.println("Sản phẩm đã được thêm vào giỏ hàng.");
    }
    public void xemGioHang() {
        System.out.println("Danh sách sản phẩm trong giỏ hàng của " + this.tenKH + ":");
        for (ChiTietHoaDon chiTietHoaDon : gioHang) {
            System.out.println(chiTietHoaDon.tinhThanhTien() + " - " +
                               chiTietHoaDon.getSoLuong() + " " +
                               chiTietHoaDon.getSanPham().getTenSanPham());
        }
    }
    public void xoaSanPhamTrongGioHang(SanPham sp,int soLuong) {
        ChiTietHoaDon chiTietHoaDon=new ChiTietHoaDon(sp,soLuong);
        gioHang.remove(chiTietHoaDon);
        System.out.println("San pham da duoc xoa khoi gio hang ");
    }
}
