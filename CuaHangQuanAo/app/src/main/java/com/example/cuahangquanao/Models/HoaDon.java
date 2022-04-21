package com.example.cuahangquanao.Models;

public class HoaDon {
    private int MaHD;
    private String DiaChi;
    private String NgayBan;
    private String SDT;
    private String TenTK;
    private String HoTen;
    private int TongTien;
    private int TrangThai;

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int maHD) {
        MaHD = maHD;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(String ngayBan) {
        NgayBan = ngayBan;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String tenTK) {
        TenTK = tenTK;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }

    public HoaDon(int maHD, String diaChi, String ngayBan, String SDT, String tenTK, String hoTen, int tongTien, int trangThai) {
        MaHD = maHD;
        DiaChi = diaChi;
        NgayBan = ngayBan;
        this.SDT = SDT;
        TenTK = tenTK;
        HoTen = hoTen;
        TongTien = tongTien;
        TrangThai = trangThai;
    }
}
