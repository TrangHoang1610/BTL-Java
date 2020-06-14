go
use master

create database QLShowroom
 go 
 use QLShowroom
 go

 create table NhanVien(
	MaNV nvarchar(20) not null primary key,
	TenNV nvarchar(30),
	ChucVu nvarchar(20)
 )

 create table SanPham(
	MaH nvarchar(20) not null primary key,
	TenH nvarchar(30),
	LoaiHang nvarchar(20),
	KieuDang nvarchar(20),
	MauSac nvarchar(20),
	XuatXu nvarchar(20)
 )
 create table KhachHang(
	MaKH nvarchar(20) not null primary key,
	TenKH nvarchar(30) not null,
	SoDT nvarchar(10),
	SinhNhat date,
	GhiChu nvarchar(50)
 )
 create table HangTon(
	MaH nvarchar(20) not null primary key,
	SoLuong int,
	TrangThai nvarchar(20),
	constraint FK_HangTon foreign key(MaH) references SanPham(MaH),
 )
 create table ChiTieu(
	MaHD nvarchar(20) not null,
	MaH nvarchar(20) not null,
	TenKhoanChi nvarchar(20),
	Ngay date,
	DonGia Float,
	SoLuong int,
	Constraint PK_ChiTieu primary key(MaHD,MaH),
	constraint FK_ChiTieu foreign key(MaH) references SanPham(MaH)
 )
  create table HoaDon(
	MaHoaDon nvarchar(20) not null primary key,
	MaNV nvarchar(20) not null,
	MaH nvarchar(20) not null,
	MaKH nvarchar(20) not null,
	NgayLap date,
	SoLuong int,
	DonGia float,
	constraint FK_HoaDon foreign key(MaH) references SanPham(MaH),
	constraint FK_HoaDon1 foreign key(MaKH) references KhachHang(MaKH),
	constraint FK_HoaDon2 foreign key(MaNV) references NhanVien(MaNV),

 )