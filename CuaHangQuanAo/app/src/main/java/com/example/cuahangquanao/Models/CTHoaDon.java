package com.example.cuahangquanao.Models;

public class CTHoaDon {
    private int MaCTHD;
    private String TenSP;
    private String HinhAnh;
    private int GiaBan;
    private int SoLuong;
    private int ThanhTien;

    public int getMaCTHD() {
        return MaCTHD;
    }

    public void setMaCTHD(int maCTHD) {
        MaCTHD = maCTHD;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int giaBan) {
        GiaBan = giaBan;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int thanhTien) {
        ThanhTien = thanhTien;
    }

    public CTHoaDon(int maCTHD, String tenSP, String hinhAnh, int giaBan, int soLuong, int thanhTien) {
        MaCTHD = maCTHD;
        TenSP = tenSP;
        HinhAnh = hinhAnh;
        GiaBan = giaBan;
        SoLuong = soLuong;
        ThanhTien = thanhTien;
    }
}
