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
public class DanhSachNhanVien {
    private ArrayList<NhanVien>dsnv;

    public ArrayList<NhanVien> getDsnv() {
        return dsnv;
    }

    public void setDsnv(ArrayList<NhanVien> dsnv) {
        this.dsnv = dsnv;
    }

    public DanhSachNhanVien(ArrayList<NhanVien> dsnv) {
        this.dsnv = dsnv;
    }

    public DanhSachNhanVien() {
        dsnv=new ArrayList<>();
    }
    public void xemThongTinNhanVien(NhanVien nv) {
        for(NhanVien nv1:dsnv) {
            if(nv1.getMaNV()==nv.getMaNV()) {
                nv1.xuat();
            }
        }
    }
    public void themNhanVien(NhanVien nv) {
        dsnv.add(nv);
    }
    public void xoaNhanVien(NhanVien nv) {
        if(dsnv.contains(nv)) {
            dsnv.remove(nv);
        }
        else System.out.println("Khong co nhan vien nay trong tiem");
    }
    public void xuatDanhSachNhanVien() {
        for(NhanVien nv1:dsnv) {
            nv1.xuat();
        }
    }
    public NhanVien timNhanVien(NhanVien nv) {
        if(dsnv.contains(nv)) {
            return nv;
        }
        System.out.println("Khong tim thay nhan vien ");
        return null;
    }
    public NhanVien nhanVienTiepTheo(NhanVien nv) {
        int index=dsnv.indexOf(nv);
        return dsnv.get(index+1);
    }
}
