package com.example.cuahangquanao.Models;

public class Hang {
    private int MaHang;
    private String TenHang;

    public Hang(int maHang, String tenHang) {
        MaHang = maHang;
        TenHang = tenHang;
    }

    public int getMaHang() {
        return MaHang;
    }

    public void setMaHang(int maHang) {
        MaHang = maHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }
}
