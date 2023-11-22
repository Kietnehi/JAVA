package com.mycompany.JAVA.BanHang;

import com.mycompany.JAVA.BanHang.IXuat;
import com.mycompany.JAVA.BanHang.INhap;
import com.mycompany.JAVA.BanHang.SanPham;
import java.time.LocalDate;
import java.util.Scanner;

public class DoUong extends SanPham implements IXuat, INhap {

    public DoUong(String tenSanPham, String maSanPham, double giaSanPham, int soLuong, String maNgayCungCap, LocalDate ngaySanXuat, LocalDate hanSuDung) {
        super(tenSanPham, maSanPham, giaSanPham, soLuong, maNgayCungCap, ngaySanXuat, hanSuDung);
    }

    public DoUong() {
    }

    public void giamGia(double phanTram) {
        double giaMoi = getGiaSanPham() - phanTram * getGiaSanPham();
        setGiaSanPham(giaMoi);
    }

    @Override
    public void xuat() {
        System.out.println("Thông tin đồ uống:");
        super.xuat();
        System.out.println("VAT: " + tinhVAT(10)); // Giả sử VAT là 10%
        System.out.println("-----------------------------");
    }

    public double tinhVAT(double phanTramVAT) {
        return getGiaSanPham() * phanTramVAT / 100;
    }

    @Override
    public void nhap() {
       super.nhap();
    }
}
