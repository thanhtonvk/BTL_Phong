package com.example.cuahangquanao.Utils;

import com.example.cuahangquanao.Models.GioHang;
import com.example.cuahangquanao.Models.SanPham;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Common {
    public static String baseUrl = "http://192.168.1.107:1658/";
    public static List<SanPham> sanPhamList;
    public static SanPham sanPham;
    public static List<GioHang> gioHangList;
    public static String tenTK;
    public static String formatMoney(int money) {
        Locale locale = new Locale("vn", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(money);
    }
}
