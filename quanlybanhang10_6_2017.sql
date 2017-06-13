
create database da_qlbh default character set utf8;
use da_qlbh;
create table NhanVien(
MaNV varchar(8) not null primary key,
HoTen nvarchar(100) not null,
Luong int not null default 0 check (Luong >0),
Email varchar(100) not null unique,
DiaChi nvarchar(300) null,
SoDT varchar(12) not null,
Username varchar(30) not null unique,
Pass nvarchar(40) not null,
GhiChu nvarchar(300) null
);
insert into NhanVien (MaNV,HoTen,Luong,Email,DiaChi,SoDT,UserName,Pass) values 
    ('NV000001',N'Nguyễn Duy Mạnh',2500000,'Manh@gmai.com',N'Tây Sơn','01636323484','manh','12345'),
    ('NV000002',N'Đặng Tiến Chiêu',3200000,'Chieu@gmai.com',N'Hà Đông','0122218786','chieu','12345'),
    ('NV000003',N'Vũ Khánh Chi',3000000,'chixxx@gmai.com',N'Thạch Thất','0986213214','chi','12345'),
    ('NV000004',N'Trần Văn Huy',2100000,'huy@gmai.com',N'Hai bà Trưng','01222108386','huy','12345');
create table NhaCC(
MaNCC varchar(8) not null primary key,
TenNCC nvarchar(200) not null unique,
Masothue varchar(100) null,
DiaChi nvarchar(300) null,
soDT varchar(12) null,
Email varchar(100) not null unique,
GhiChu nvarchar(300) null
);
insert into NhaCC(MaNCC,TenNCC,MaSoThue,DiaChi,soDT,Email) values 
	('NC000001','Sony','23110932',N'Trường Chinh','044343784','sonyitachi@mail.com'),
    ('NC000002','Điện Máy Xanh','43650123',N'Thanh Xuân','044889999','dienmayxanh@mail.com'),
    ('NC000003','Thế Giới Di ĐỘng','09374654',N'Thanh Nhàn','0446754321','thegioididong@mail.com'),
    ('NC000004','SamSung','439567493',N'Nguyễn Lương Bằng','6r380277','samsung@mail.com'),
	('NC000005','Little Rock','0123455678','Thai lan','653276432','ltr@gmail.com'),
	('NC000006','Nike','8217388789','America','2183138512','nike@gmail.com'),
	('NC000007','Adidas','2193129009','America','1203120802','adidas@gmail.com'),
	('NC000008','Muscletech','01239812232','Australia','9988910183','muscletech@gmail.com'),
	('NC000009','PowerTrain','89123721312','Australia','9812738121','powertrain@gmail.com');
create table KhachHang(
MaKH varchar(8) not null primary key,
TenKH nvarchar(100) not null,
DiaChi nvarchar(300) null,
SoDT varchar(12) null,
Email varchar(100) null
); 
insert into KhachHang (MaKH,TenKH,DiaChi,SoDT,Email) values
	('KH000001',N'Anh Long',N'102 Thanh Xuân','0987123999','longxxx@gmail.com'),
    ('KH000002',N'Chị Phương',N'298 Vương Thừa Vũ','0979926189','phuong@gmail.com'),
    ('KH000003',N'Chị Hòa',N'56 Trường Chinh','01623554932','hoapham@gmail.com'),
    ('KH000004',N'Chị Xuân',N'67 Láng Hạ','08463826384','xuanhihi@gmail.com'),
    ('KH000005',N'Chị Phượng',N'32 Vũ Tông Phan','09362836443','phuongxx@gmail.com'),
    ('KH000006',N'Anh Huy',N'45 Hai Bà Trưng','0937482648','huyhihi@gmail.com'),
    ('KH000007',N'Anh Vũ',N'67 Khương Trung','09439534833','vuxxx@gmail.com'),
    ('KH000008',N'Anh Tuấn',N'32 Thượng Đình','0933827492','tuandz@gmail.com'),
    ('KH000009',N'Anh Minh',N'54 Đoàn Thị Điểm','096364823','minhlong@gmail.com'),
    ('KH000010',N'Anh Phan',N'21 Hoàn Kiếm','0975372821','phanthanh@gmail.com'),
    ('KH000011',N'Anh Đạt',N'231 Trường Chinh','017383846','dattran@gmail.com'),
    ('KH000012',N'Chị Linh',N'43 Nguyễn Văn Cừ','09372438436','linhxinh@gmail.com'),
    ('KH000013',N'Anh Mạnh',N'731 Giải Phóng','09763547262','manhxxx@gmail.com'),
    ('KH000014',N'Anh Thi',N'43 Định Công Hạ','03347352374','thilong@gmail.com'),
    ('KH000015',N'Chị Ngọc',N'54 Tôn Thất Tùng','0823727838','ngocnguyen@gmail.com'),
    ('KH000016',N'Chị Ngân',N'65 Lò Đúc','0934434567','nganminh@gmail.com');
create table HangHoa(
MaHH varchar(8) not null primary key,
TenHH nvarchar(200) not null,
NhomHH varchar(20) null,
GiaBan int not null check (GiaBan >0),
GiaNhap int not null check (GiaNhap >0),
ThuocTinh nvarchar(300) null,
SoLuong int not null default 0 check (SoLuong >0),
DonViTinh nvarchar(30) not null default 'cái',
MaNCC varchar(8) not null, 
GhiChu nvarchar(300) null,
foreign key (MaNCC) references NhaCC(MaNCC)
);

insert into HangHoa(MaHH,TenHH,NhomHH,GiaBan,GiaNhap,ThuocTinh,SoLuong,DonViTinh,MaNCC,GhiChu) values
	('SP000001',N'Áo ba lỗ bản to',N'Áo ba lỗ',220000,130000,'',30,N'cái','LTR',''),
	('SP000002',N'Áo thun Nike Pro Combat',N'Áo thun',230000,150000,'',50,N'cái','NKE',''),
	('SP000003',N'Quần short Nike dù',N'Quần short',180000,100000,'',50,N'cái','NKE',''),
	('SP000004',N'Găng tay Muscletech',N'Găng tay',320000,180000,'',40,N'đôi','MST',''),
	('SP000005',N'Cuốn cổ tay Muscltech',N'Cuốn cổ tay',200000,90000,'',45,N'đôi','MST',''),
	('SP000006',N'Túi thể thao 3 ngăn Adidas',N'Túi xách',350000,150000,'',30,N'cái','ADD',''),
	('SP000007',N'Bình nước PowerTrain',N'Bình nước',150000,70000,'',25,N'chiếc','PWT',''),
	('SP000008',N'Cuốn gối Muscletech',N'Phụ kiện khác',450000,200000,'',20,N'đôi','MST',''),
	('SP000009',N'Dây Lifting Muscletech',N'Phụ kiện khác',150000,80000,'',40,N'đôi','MST',''),
	('SP000010',N'Đai lưng Muscletech',N'Đai lưng',550000,250000,'',10,N'cái','MST','');
create table CaLam(
MaCa int auto_increment primary key,
GioBD time not null,
GioKT time not null
);
insert into CaLam (GioBD,GioKT) values 
	('9:00','13:00'),('13:00','18:00'),('18:00','21:00');
create table BangChamCong(
MaCC int auto_increment primary key,
Ngay date not null,
GioBD time not null,
GioKT time not null,
TienPhat int  default 0,
PhuCap int default 0 check (PhuCap >0),
TamUng int  default 0 check (TamUng >0),
MaNV varchar(8) not null,
MaCa int not null check (MaCa >0),
foreign key (MaNV) references NhanVien(MaNV),
foreign key (MaCa) references CaLam(MaCa)
);
insert into BangChamCong(Ngay,GioBD,GioKT,TienPhat,PhuCap,TamUng,MaNV,MaCa) values
	('2017/04/01','9:00','13:00',0,50000,default,'NV000001',1),
	('2017/04/01','13:00','18:00',10000,30000,default,'NV000002',2),
	('2017/04/01','18:00','21:00',0,30000,default,'NV000004',3),
	('2017/04/02','9:00','13:00',0,34000,default,'NV000003',1),
	('2017/04/02','13:00','18:00',10000,47000,default,'NV000004',2),
	('2017/04/02','18:00','21:00',0,22000,default,'NV000001',3),
	('2017/04/03','9:00','13:00',0,27000,default,'NV000004',1),
	('2017/04/03','13:00','18:00',0,51000,default,'NV000002',2),
	('2017/04/03','18:00','21:00',0,28000,default,'NV000001',3),
	('2017/04/04','9:00','13:00',10000,40000,default,'NV000003',1),
	('2017/04/04','13:00','18:00',0,44000,default,'NV000002',2),
	('2017/04/04','18:00','21:00',0,31000,default,'NV000004',3);
create table HoaDon(
MaHD varchar(8) not null primary key,
Ngay date not null,
MaKH varchar(8) not null,
MaNV varchar(8) not null,
foreign key (MaKH) references KhachHang(MaKH),
foreign key (MaNV) references NhanVien(MaNV)
);
insert into HoaDon values
	('HD000001','2017/04/01','KH000003','NV000001'),
	('HD000002','2017/04/01','KH000008','NV000001'),
	('HD000003','2017/04/01','KH000014','NV000002'),
	('HD000004','2017/04/02','KH000007','NV000003'),
	('HD000005','2017/04/02','KH000006','NV000004'),
	('HD000006','2017/04/02','KH000001','NV000001'),
	('HD000007','2017/04/03','KH000014','NV000002'),
	('HD000008','2017/04/03','KH000010','NV000001'),
	('HD000009','2017/04/04','KH000009','NV000002'),
	('HD000010','2017/04/04','KH000003','NV000003'),
	('HD000011','2017/04/04','KH000005','NV000004');
create table CTHoaDon(
MaHD varchar(8) not null,
MaHH varchar(8) not null,
SoLuong int not null check (SoLuong >0),
DonGia int not null check (DonGia >0),
GiamGia int null check (GiamGia between 0 and 100) ,
foreign key (MaHD) references HoaDon(MaHD),
foreign key (MaHH) references HangHoa(MaHH),
primary key (MaHD,MaHH)
);
insert into CTHoaDon(MaHD,MaHH,SoLuong,DonGia,GiamGia) values
	('HD000001','SP000002',1,230000,0),
	('HD000001','SP000003',1,180000,0),
	('HD000001','SP000004',1,320000,0),
	('HD000002','SP000002',1,230000,0),
	('HD000002','SP000001',2,220000,20000),
	('HD000003','SP000010',1,550000,0),
	('HD000003','SP000007',1,150000,0);
create table DonDatHang(
MaDDH varchar(8) not null primary key,
Ngay date not null,
MaNV varchar(8) not null,
TrangThai int default 0,
foreign key(MaNV) references NhanVien(MaNV)
);
insert into DonDatHang(MaDDH,Ngay,MaNV,TrangThai) values
	('DH000001','2017/04/01','NV000001', 1),
	('DH000002','2017/04/01','NV000003', 1),
	('DH000003','2017/04/02','NV000002', 0),
	('DH000004','2017/04/03','NV000001', 1),
	('DH000005','2017/04/04','NV000004', 0);
create table CTDonDatHang(
MaDDH varchar(8) not null,
MaHH varchar(8) not null,
SoLuong int not null check (SoLuong >0),
DonGia int not null check (DonGia >0),
primary key (MaDDH,MaHH),
foreign key (MaDDH) references DonDatHang(MaDDH),
foreign key (MaHH) references HangHoa(MaHH)
);
insert into CTDonDatHang(MaDDH,MaHH,SoLuong,DonGia) values
	('DH000001','SP000001',15,130000),
    ('DH000001','SP000006',15,150000),
    ('DH000002','SP000002',10,150000),
    ('DH000002','SP000004',10,180000),
    ('DH000003','SP000010',10,250000);
create table PhieuChi(
MaPC varchar(8) not null primary key,
Ngay date not null,
LoaiChi nvarchar(100) null,
NguoiNhan nvarchar(100) null,
GiaTri int not null check (Giatri >0),
GhiChu nvarchar(300) null,
MaNV varchar(8) not null,
foreign key (MaNV) references NhanVien(MaNV)
);

insert into PhieuChi(MaPC,Ngay,LoaiChi,NguoiNhan,GiaTri,GhiChu,MaNV) values
	('PC000001','2017/04/01',N'Tiền điện','',674000,'','NV000001'),
	('PC000002','2017/04/04',N'Tiền nước','',130000,'','NV000002'),
	('PC000003','2017/04/03',N'Tiền hàng','',1250000,'','NV000004'),
	('PC000004','2017/04/10',N'Tiền hàng','',860000,'','NV000002'),
	('PC000005','2017/04/27',N'Tiền Internet','',263000,'','NV000003');
delimiter $$
 CREATE TRIGGER before_insert_BangChamCong BEFORE INSERT ON BangChamCong
       FOR EACH ROW
       BEGIN
           IF isnull(new.Ngay) THEN
               SET NEW.Ngay = curdate();
			END IF;
			IF isnull(New.GioBD) THEN
				SET NEW.GioBD = curtime();
			END IF;
       END;
 $$ delimiter ;
 delimiter $$
 CREATE TRIGGER before_update_BangChamCong BEFORE UPDATE ON BangChamCong
       FOR EACH ROW
       BEGIN
			IF isnull(New.GioKT) THEN
				SET NEW.GioKT = curtime();
			END IF;
       END;
 $$ delimiter ;
 
 delimiter //
 CREATE TRIGGER before_insert_HoaDon BEFORE INSERT ON HoaDon
	FOR EACH ROW
    BEGIN
		IF isnull(NEW.Ngay) THEN
			SET NEW.Ngay = curdate();
		END IF;
    END;
 // delimiter ;
 
DELIMITER //
CREATE TRIGGER before_insert_DonDatHang BEFORE INSERT ON DonDatHang
FOR EACH ROW
BEGIN
	IF isnull(NEW.Ngay) THEN
		SET NEW.Ngay =  curdate();
	END IF;
END
// DELIMITER ;

DELIMITER //
CREATE TRIGGER before_insert_PhieuChi BEFORE INSERT ON PhieuChi
FOR EACH ROW
BEGIN
	IF isnull(NEW.Ngay) THEN
		SET NEW.Ngay =  curdate();
	END IF;
END;
// DELIMITER ;

delimiter //
CREATE TRIGGER update_after_BanHang 
after  insert   ON CTHoaDon
FOR EACH ROW
begin
	update HangHoa
	set HangHoa.SoLuong = HangHoa.SoLuong - NEW.SoLuong
	where MaHH = NEW.MaHH;
end;
// delimiter ;
