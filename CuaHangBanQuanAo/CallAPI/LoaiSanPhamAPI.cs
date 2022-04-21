using System;
using System.Collections.Generic;
using System.Net.Http;
using CuaHangBanQuanAo.Models;
using CuaHangBanQuanAo.Utils;

namespace CuaHangBanQuanAo.CallAPI
{
    public class LoaiSanPhamAPI
    {
        string baseUrl = Common.baseUrl;
        HttpClient client;
        public LoaiSanPhamAPI()
        {
            client = new HttpClient();
            client.BaseAddress = new Uri(baseUrl);
        }

        public List<LoaiSanPham> GetLoaiSanPhams()
        {
            List<LoaiSanPham> loaiSanPhams = new List<LoaiSanPham>();
            var res = client.GetAsync("api/LoaiSanPhams");
            res.Wait();
            var rs = res.Result;
            if (rs.IsSuccessStatusCode)
            {
                loaiSanPhams = rs.Content.ReadAsAsync<List<LoaiSanPham>>().Result;
            }

            return loaiSanPhams;
        }

        public LoaiSanPham GetLoaiSanPham(int id)
        {
            LoaiSanPham loaiSanPham = new LoaiSanPham();
            var res = client.GetAsync($"api/LoaiSanPhams/{id}");
            res.Wait();
            var rs = res.Result;
            if (rs.IsSuccessStatusCode)
            {
                loaiSanPham = rs.Content.ReadAsAsync<LoaiSanPham>().Result;
            }

            return loaiSanPham;
        }

        public int AddLoaiSanPham(LoaiSanPham loaiSanPham)
        {
            int kq = -1;
            var res = client.PostAsJsonAsync("api/LoaiSanPhams", loaiSanPham);
            res.Wait();
            var rs = res.Result;
            if (rs.IsSuccessStatusCode)
            {
                kq = rs.Content.ReadAsAsync<int>().Result;
            }

            return kq;
        }
        public int UpdateLoaiSanPham(LoaiSanPham loaiSanPham)
        {
            int kq = -1;
            var res = client.PutAsJsonAsync($"api/LoaiSanPhams/{loaiSanPham.MaLoai}", loaiSanPham);
            res.Wait();
            var rs = res.Result;
            if (rs.IsSuccessStatusCode)
            {
                kq = rs.Content.ReadAsAsync<int>().Result;
            }

            return kq;
        }
        public int DeleteLoaiSanPham(int id)
        {
            int kq = -1;
            var res = client.DeleteAsync($"api/LoaiSanPhams/{id}");
            res.Wait();
            var rs = res.Result;
            if (rs.IsSuccessStatusCode)
            {
                kq = rs.Content.ReadAsAsync<int>().Result;
            }

            return kq;
        }

    }
}