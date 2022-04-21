using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Data.Entity.Infrastructure;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using System.Web.Http.Description;
using CuaHangBanQuanAo.Models;

namespace CuaHangBanQuanAo.Controllers.api
{
    public class LoaiSanPhamsController : ApiController
    {
        private QLCuaHangQuanAoEntities db = new QLCuaHangQuanAoEntities();

        // GET: api/LoaiSanPhams
        public IEnumerable<LoaiSanPham> GetLoaiSanPhams()
        {
            return db.LoaiSanPhams;
        }

        // GET: api/LoaiSanPhams/5
        [ResponseType(typeof(LoaiSanPham))]
        public IHttpActionResult GetLoaiSanPham(int id)
        {
            LoaiSanPham loaiSanPham = db.LoaiSanPhams.Find(id);
            if (loaiSanPham == null)
            {
                return NotFound();
            }

            return Ok(loaiSanPham);
        }

        // PUT: api/LoaiSanPhams/5
        [ResponseType(typeof(void))]
        public IHttpActionResult PutLoaiSanPham(int id, LoaiSanPham loaiSanPham)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(ModelState);
            }

            if (id != loaiSanPham.MaLoai)
            {
                return BadRequest();
            }

            db.Entry(loaiSanPham).State = EntityState.Modified;

            return Ok(db.SaveChanges());
        }

        // POST: api/LoaiSanPhams
        [ResponseType(typeof(LoaiSanPham))]
        public IHttpActionResult PostLoaiSanPham(LoaiSanPham loaiSanPham)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(ModelState);
            }

            db.LoaiSanPhams.Add(loaiSanPham);
            return Ok(db.SaveChanges());

        }

        // DELETE: api/LoaiSanPhams/5
        [ResponseType(typeof(LoaiSanPham))]
        public IHttpActionResult DeleteLoaiSanPham(int id)
        {
            LoaiSanPham loaiSanPham = db.LoaiSanPhams.Find(id);
            if (loaiSanPham == null)
            {
                return NotFound();
            }

            db.LoaiSanPhams.Remove(loaiSanPham);
            return Ok(db.SaveChanges());

        
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }

        private bool LoaiSanPhamExists(int id)
        {
            return db.LoaiSanPhams.Count(e => e.MaLoai == id) > 0;
        }
    }
}