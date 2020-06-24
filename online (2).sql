﻿go
use master
go
create database QLShowroom
 go 
 use QLShowroom
 go

 create table NHANVIEN(
	MANV nvarchar(20) not null primary key,
	TENNV nvarchar(50) not null,
	CHUCVU nvarchar(30) not null
 )

 create table SANPHAM(
	MASP nvarchar(20) not null primary key,
	TENSP nvarchar(30) not null,
	GIA MONEY not null,
	KIEUDANG nvarchar(20) not null,
	MAUSAC nvarchar(20) not null,
	XUATXU nvarchar(20) not null,
	SOLUONG int not null,
	MOTA nvarchar(100) not null,
	DELETED INT DEFAULT 0	
)
 create table KHACHHANG(
	MAKH nvarchar(20) not null primary key,
	TENKH nvarchar(30) not null,
	SODT nvarchar(10) not null,
	NGAYSINH date not null,
	THOIQUEN nvarchar(100),
	SOTHICH nvarchar(100)
 )
 
 create table CHITIEU(
	MACT nvarchar(20) not null primary key,
	TENKHOANCHI nvarchar(100) not null,
	NGAY date not null,
	SOTIEN MONEY not null,
	
 )
 create table HOADON(
	MAHD nvarchar(20) not null,
	MASP nvarchar(20) not null,
	MANV nvarchar(20) not null,
	MAKH nvarchar(20) not null,
	NGAYLAP date not null,
	SOLUONG int not null,
	CONSTRAINT HOADON_PK PRIMARY KEY (MAHD,MASP)	
 )


create trigger TRG_THEMHOADON
on HOADON
for insert 
as
begin		
			DECLARE @SOLUONG INT
			DECLARE @SOLUONGBAN INT
			SET @SOLUONG=(SELECT SANPHAM.SOLUONG FROM SANPHAM INNER JOIN INSERTED ON  SANPHAM.MASP=INSERTED.MASP)
			SET @SOLUONGBAN=(SELECT @SOLUONGBAN FROM INSERTED)
			
				UPDATE SANPHAM SET SOLUONG=SANPHAM.SOLUONG-@SOLUONGBAN FROM SANPHAM INNER JOIN INSERTED ON  SANPHAM.MASP=INSERTED.MASP		
					
END


-- for delete 
create trigger TRG_XOHOADON
on HOADON
FOR DELETE
AS
BEGIN
	DECLARE @MAHANG NVARCHAR(20)
	SET @MAHANG=(SELECT MASP FROM DELETED)
	
			 UPDATE SANPHAM SET SOLUONG=SANPHAM.SOLUONG+DELETED.SOLUONG
			 FROM SANPHAM INNER JOIN DELETED ON SANPHAM.MASP=DELETED.MASP		
END 
 DROP trigger TRG_XOHOADON
 drop trigger TRG_THEMHOADON


 CREATE TRIGGER TRG_XOAHOADON
    ON HOADON
    FOR DELETE AS
BEGIN
    UPDATE SANPHAM
    SET SOLUONG = SANPHAM.SOLUONG+ (
        SELECT SUM(SOLUONG)
        FROM deleted
        WHERE MASP = SANPHAM.MASP)
    FROM SANPHAM INNER JOIN DELETED ON SANPHAM.MASP = DELETED.MASP
END
GO



 CREATE TRIGGER TRG_SANPHAM
on HOADON
FOR UPDATE
AS
BEGIN
			DECLARE @SLTRUOC INT
			DECLARE @SLSAU INT

			SELECT @SLTRUOC=SOLUONG FROM DELETED 
			SELECT @SLSAU=SOLUONG FROM INSERTED
			UPDATE SANPHAM SET SOLUONG=SANPHAM.SOLUONG-(@SLSAU-@SLTRUOC)
			FROM SANPHAM INNER JOIN INSERTED ON SANPHAM.MASP=INSERTED.MASP
					INNER JOIN DELETED ON SANPHAM.MASP=DELETED.MASP
END

SELECT*FROM SANPHAM
-- insert d? li?u

insert into NHANVIEN values
('NV001',N'Hoàng Thị Trang',N'thu ngân'),						   
('NV002',N'Hoàng Thị Thu Trang',N'kế tóan')

insert into SANPHAM(MASP,TENSP,GIA,KIEUDANG,MAUSAC,XUATXU ,SOLUONG,MOTA)values
('SP0001','NEW MAZDA2',555000000,'SEDAN',N'đỏ',N'Mỹ',100,'New Mazda2 1.5L Deluxe'),
('SP0002','BT 50',590000000,'SPORT',N'xmas',N'Nhật',10,'BT-50 Standard 4x4')

insert into KHACHHANG values
('KH001','Trang','0367625499','1999/10/06',N'xem sản phẩm mới',N'đi du lịch')

insert into CHITIEU values
('CT001',N'lương nhân viên','2020/01/01',5000),
('CT002',N'nhập sản phẩm','2020/02/01',3000)

insert into HOADON values
('HD001','SP0001','NV001','KH001','2020/02/10',1),
('HD001','SP0002','NV001','KH001','2020/02/10',10)
insert into HOADON values
('HD002','SP0001','NV001','KH001','2020/02/10',1),
('HD003','SP0002','NV001','KH001','2020/02/10',10)
select *from HOADON INNER JOIN SANPHAM ON HOADON.MASP=SANPHAM.MASP
select SANPHAM.MASP,TENSP,HOADON.SOLUONG,GIA from HOADON INNER JOIN SANPHAM ON HOADON.MASP=SANPHAM.MASP where MAHD='HD001'
UPDATE HOADON SET MANV='NV001',MASP='SP0001',MAKH='KH001',NGAYLAP='2020/02/10',SOLUONG=10 WHERE MaHD='HD001'

select MAHD,MAKH,MANV,NGAYLAP, SUM(HOADON.SOLUONG*GIA) AS 'TONGTIEN' from HOADON INNER JOIN SANPHAM ON HOADON.MASP=SANPHAM.MASP
group by  MAHD,MAKH,MANV,NGAYLAP


SELECT * FROM SANPHAM
SELECT* FROM SANPHAM INNER JOIN HOADON ON SANPHAM.MASP=HOADON.MASP WHERE MAHD='HD003'
select* from HOADON
INSERT INTO HOADON  VALUES ('HD003','SP0001','NV001','KH001','200/0/10',1) update SANPHAM set SOLUONG=SOLUONG-(SOLUONG-HOADON.SOLUONG) WHERE HOADON.MASP=SANPHAM.MASP