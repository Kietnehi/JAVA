/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.JAVA.BanHang;

import com.mycompany.JAVA.BanHang.IXuat;
import com.mycompany.JAVA.BanHang.INhap;
import com.mycompany.JAVA.BanHang.SanPham;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class GiaVi extends SanPham implements IXuat, INhap {

    public GiaVi(String tenSanPham, String maSanPham, double giaSanPham, int soLuong, String maNgayCungCap, LocalDate ngaySanXuat, LocalDate hanSuDung) {
        super(tenSanPham, maSanPham, giaSanPham, soLuong, maNgayCungCap, ngaySanXuat, hanSuDung);
    }

    public GiaVi() {
    }

    @Override
    public void giamGia(double phanTram) {
        double giaMoi = getGiaSanPham() * (1 - phanTram / 100);
        setGiaSanPham(giaMoi);
    }

    @Override

    public void nhap() {
        super.nhap();
    }

    public double tinhVAT(double phanTramVAT) {
        return getGiaSanPham() * phanTramVAT / 100;
    }

    public void xuat() {
        System.out.println("Thông tin gia vị:");
        super.xuat();
        System.out.println("VAT: " + tinhVAT(10)); // Giả sử VAT là 10%
        System.out.println("-----------------------------");
    }
}
