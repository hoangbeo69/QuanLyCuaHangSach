create database quanlycuahangsach;
use quanlycuahangsach;
--
-- Tạo Bảng taikhoan
--
CREATE TABLE IF NOT EXISTS `taikhoan` (
  `TenTK` VARCHAR(30) NOT NULL,
  `MatKhau` VARCHAR(30) NOT NULL,
  `MaNV` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`TenTK`)
 )
ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
-- Tạo Bảng sach
--
INSERT INTO `quanlycuahangsach`.`taikhoan` (`TenTK`, `MatKhau`, `MaNV`) VALUES ('nhanvien1', '123456', 'NV01');
INSERT INTO `quanlycuahangsach`.`taikhoan` (`TenTK`, `MatKhau`, `MaNV`) VALUES ('nhanvien2', '123456', 'NV02');
INSERT INTO `quanlycuahangsach`.`taikhoan` (`TenTK`, `MatKhau`, `MaNV`) VALUES ('nhanvien3', '123456', 'NV03');
INSERT INTO `quanlycuahangsach`.`taikhoan` (`TenTK`, `MatKhau`, `MaNV`) VALUES ('nhanvien4', '123456', 'NV04');
INSERT INTO `quanlycuahangsach`.`taikhoan` (`TenTK`, `MatKhau`, `MaNV`) VALUES ('nhanvien5', '123456', 'NV05');
INSERT INTO `quanlycuahangsach`.`taikhoan` (`TenTK`, `MatKhau`, `MaNV`) VALUES ('nhanvien6', '123456', 'NV06');

CREATE TABLE IF NOT EXISTS `sach` (
    `MaSach` VARCHAR(10) COLLATE UTF8_UNICODE_CI NOT NULL,
    `TenSach` VARCHAR(45) COLLATE UTF8_UNICODE_CI NOT NULL,
    `TacGia` VARCHAR(45) COLLATE UTF8_UNICODE_CI NOT NULL,
    `NhaXB` VARCHAR(45) COLLATE UTF8_UNICODE_CI NOT NULL,
    `KichThuoc` VARCHAR(45) NOT NULL,
    `SoTrang` INT(4) NOT NULL,
    PRIMARY KEY (`MaSach`)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COLLATE = UTF8_UNICODE_CI;

INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS01', 'Nhà Giả Kim', 'Paulo Coelho', 'Nhà Xuất Bản Văn Học', '13 x 20.5 cm', '228');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS02', 'Đắc Nhân Tâm (Khổ Lớn)', 'Dale Carnegie', 'Nhà Xuất Bản Tổng hợp TP.HCM', '14.5 x 20.5 cm', '320');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS03', 'Để Con Được Ốm', 'Uyên Bùi - BS. TríĐoàn', 'Nhà Xuất Bản Thế Giới', '14 x 20.5 cm', '300');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS04', 'Khi Hơi Thở Hóa Thinh Không', 'Paul Kalanithi', 'Nhà Xuất Bản Lao Động', '14 x 20.5 cm', '236');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS05', 'Tony Buổi Sáng - Trên Đường Băng', 'Tony Buổi Sáng', 'Nhà Xuất Bản Trẻ', '13 x 20 cm', '308');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS06', 'Lối Sống Tối Giản Của Người Nhật', 'Sasaki Fumio', 'Nhà Xuất Bản Lao Động', '13 x 20.5 cm', '295');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS07', 'Tuổi Trẻ Đáng Giá Bao Nhiêu', 'Rosie Nguyễn', 'Nhà Xuất Bản Hội Nhà Văn', '14 x 20.5 cm', '285');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS08', 'Khi Tài Năng Không Theo Kịp Giấc Mơ', 'Mèo Maverick', 'Nhà Xuất Bản Thế Giới', '14.5 x 20.5 cm', '256');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS09', 'Bạn Chỉ Cần Sống Tốt, Trời Xanh Tự An Bài', 'Kotoha Yao', 'Nhà Xuất Bản Thế Giới', '14.5 x 20.5 cm', '200');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS10', 'Người Giàu Có Nhất Thành Babylon', 'George S. Clason', 'Nhà Xuất Bản Tổng hợp TP.HCM', '13 x 20.5 cm', '190');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS11', 'Ba Người Thầy Vĩ Đại', 'Robin Sharma', 'Nhà Xuất Bản Lao Động', '14.5 x 20.5 cm', '330');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS12', 'Đừng Bao Giờ Đi Ăn Một Mình', 'Keith Ferrazzi,Tahl Raz', 'Nhà Xuất Bản Trẻ', '14.5 x 20.5 cm', '388');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS13', 'Nghĩ Đơn Giản, Sống Đơn Thuần', 'Tolly Burkan', 'Nhà Xuất Bản Thế Giới', '13 x 18 cm', '184');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS14', 'Mình Là Cá, Việc Của Mình Là Bơi', 'Takeshi Furukawa', 'Nhà Xuất Bản Thế Giới', '12 x 20 cm', '192');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS15', 'Nếu Tôi Biết Được Khi Còn 20', 'Tina Seelig', 'Nhà Xuất Bản Trẻ', '13 x 20.5 cm', '252');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS16', 'Dám Nghĩ Lớn!', 'David J. Schwartz. Ph.D', 'Nhà Xuất Bản Tổng hợp TP.HCM', '14.5 x 20.5 cm', '250');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS17', '13 Nguyên Tắc Nghĩ Giàu Làm Giàu - Think And', 'Napoleon Hill', 'Nhà Xuất Bản Lao Động Xã Hội', '15.5 x 24 cm', '399');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS18', 'Tỷ Phú Bán Giày', 'Tony Hsieh', 'Nhà Xuất Bản Lao Động Xã Hội', '13 x 20.5 cm', '368');
INSERT INTO `quanlycuahangsach`.`sach` (`MaSach`, `TenSach`, `TacGia`, `NhaXB`, `KichThuoc`, `SoTrang`) VALUES ('MS19', 'Blockchain: Bản Chất Của Blockchain', 'Mark Gates', 'Nhà Xuất Bản Lao Động', '13 x 20.5 cm', '288');

 -- 
 -- Tạo Bảng sanpham
 --
 
CREATE TABLE IF NOT EXISTS `sanpham` (
  `MaSach` VARCHAR(10) NOT NULL,
  `DonGia` FLOAT NOT NULL,
  `SoLuong` INT(10) NOT NULL,
  `HinhAnh` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`MaSach`))
ENGINE = InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS01', '51000', '29', 'Nhagiakim.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS02', '53000', '22', 'Dacnhantam.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS03', '63000', '3', 'Deconduocom.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS04', '80000', '55', 'Khihoithohoathinhkhong.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS05', '55000', '6', 'Tonybuisang.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS06', '66000', '14', 'Loisongtoigian.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS07', '65000', '57', 'Tuoitredanggiabaonhieu.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS08', '61000', '31', 'Khitainangkhongtheokipgiacmo.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS09', '66000', '83', 'Songtottroixanh.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS10', '43000', '6', 'Nguoigiaunhaunhatthanh.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS11', '60000', '446', '3Nguoithayvidai.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS12', '78000', '32', 'Dungbaogiodian.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS13', '46000', '332', 'Nghidongian.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS14', '62000', '44', 'Minhlaca.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS15', '44000', '34', 'Neutoibietduoc.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS16', '98000', '23', 'Damnghilon.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS17', '61000', '78', 'Thinkandgrow.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS18', '97000', '46', 'Typhubangiay.jpg');
INSERT INTO `quanlycuahangsach`.`sanpham` (`MaSach`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('MS19', '71000', '86', 'Blockchain.jpg');


-- Tạo Ràng Buộc cho bảng sanpham
-- Tạo Bảng nhanvien

cREATE TABLE IF NOT EXISTS `nhanvien` (
  `MaNV` VARCHAR(10) NOT NULL,
  `TenNV` VARCHAR(45) COLLATE utf8_unicode_ci NOT NULL,
  `GioiTinh` VARCHAR(10) COLLATE utf8_unicode_ci NOT NULL,
  `NgaySinh` DATE NULL,
  `DiaChi` VARCHAR(45)  COLLATE utf8_unicode_ci NOT NULL,
  `SDT` VARCHAR(15)  NOT NULL,
  PRIMARY KEY (`MaNV`))
ENGINE = InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
INSERT INTO `quanlycuahangsach`.`nhanvien` (`MaNV`, `TenNV`, `GioiTinh`, `NgaySinh`, `DiaChi`, `SDT`) VALUES ('NV01', 'Trần Bảo Trọng', 'Nam', '1995/12/14', 'Hà Giang', '145647854');
INSERT INTO `quanlycuahangsach`.`nhanvien` (`MaNV`, `TenNV`, `GioiTinh`, `NgaySinh`, `DiaChi`, `SDT`) VALUES ('NV02', 'Lê Thùy Dương', 'Nữ', '1997/05/12', 'Hà Nội', '1262368193');
INSERT INTO `quanlycuahangsach`.`nhanvien` (`MaNV`, `TenNV`, `GioiTinh`, `NgaySinh`, `DiaChi`, `SDT`) VALUES ('NV03', 'Trần Phương Thảo', 'Nam', '1996/03/30', 'Quảng Ninh', '366227168');
INSERT INTO `quanlycuahangsach`.`nhanvien` (`MaNV`, `TenNV`, `GioiTinh`, `NgaySinh`, `DiaChi`, `SDT`) VALUES ('NV04', 'Lê Trương An', 'Nam', '1995/11/20', 'Ninh Bình', '981578293');
INSERT INTO `quanlycuahangsach`.`nhanvien` (`MaNV`, `TenNV`, `GioiTinh`, `NgaySinh`, `DiaChi`, `SDT`) VALUES ('NV05', 'Phạm Thị Hương Giang', 'Nữ', '1999/02/22', 'Hòa Bình', '977232173');
INSERT INTO `quanlycuahangsach`.`nhanvien` (`MaNV`, `TenNV`, `GioiTinh`, `NgaySinh`, `DiaChi`, `SDT`) VALUES ('NV06', 'Lê Thùy Dung', 'Nữ', '1997/12/05', 'Hà Nội', '805126735');

-- Tạo ràng buộc cho bảng nhanvien
-- Tạo bảng khachhang


CREATE TABLE IF NOT EXISTS `khachhang` (
  `MaKH` VARCHAR(10) NOT NULL,
  `TenKH` VARCHAR(45)  COLLATE utf8_unicode_ci NOT NULL,
  `DiaChi` VARCHAR(45)  COLLATE utf8_unicode_ci NOT NULL,
  `SDT` VARCHAR(15) NOT NULL,
  `GioiTinh` VARCHAR(10) COLLATE utf8_unicode_ci NULL,
  PRIMARY KEY (`MaKH`))
ENGINE = InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH1', 'Trần Văn Hoàng', 'TP HCM', '123456789', 'Nam');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH10', 'Trần Ngọc Hải', 'Kiên Giang', '905271941', 'Nữ');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH11', 'Nguyễn Xuân Diệu', 'TP HCM', '301279552', 'Nam');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH12', 'Trần Thanh Thiện', 'Hà Nội', '123617389', 'Nữ');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH13', 'Huỳnh Minh Mẫn', 'An Giang', '389230581', 'Nữ');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH14', 'Trần Xuân An', 'Long An', '972136531', 'Nam');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH15', 'Nguyễn Thị Xuân', 'TP HCM', '702571936', 'Nam');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH16', 'Huỳnh Anh Thư', 'Bến Tre', '892383623', 'Nam');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH17', 'Trần Thanh Nhã', 'TP HCM', '702397442', 'Nữ');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH18', 'Huỳnh Nhựt Trường', 'TP HCM', '120982736', 'Nam');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH19', 'Trần Ngọc Hà', 'TP HCM', '702843627', 'Nữ');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH2', 'Nguyễn Thiên Hữu', 'Huế', '126461589', 'Nam');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH20', 'Trần Thị Hoài Anh', 'TP HCM', '126729137', 'Nữ');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH21', 'Nguyễn Văn Thắng', 'Kiên Giang', '723812935', 'Nữ');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH22', 'Huỳnh Lê Diệu Hân', 'Hà Nội', '306279178', 'Nữ');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH3', 'Phan Thanh Tùng', 'Hà Nội', '952612771', 'Nam');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH4', 'Trần Thanh Sơn', 'Hải Phòng', '120617231', 'Nam');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH5', 'Trần Thanh Thái', 'Bến Tre', '912385524', 'Nam');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH6', 'Nguyễn Hồng Nhung', 'Huế', '967263941', 'Nữ');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH7', 'Từ Ngọc Cảnh', 'Sóc Trăng', '306172915', 'Nam');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH8', 'Nguyễn Thiên Phụng', 'Vũng Tàu', '703167293', 'Nữ');
INSERT INTO `quanlycuahangsach`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `GioiTinh`) VALUES ('KH9', 'Nguyễn Diệu Ái', 'TP HCM', '805178293', 'Nữ');

-- Tạo ràng buộc bảng khachhang
-- Tạo bảng hoadon


CREATE TABLE IF NOT EXISTS `hoadon` (
  `MaHD` VARCHAR(10) NOT NULL,
  `MaNV` VARCHAR(10) NOT NULL,
  `MaKH` VARCHAR(10) NOT NULL,
  `NgayLap` DATE NOT NULL,
  `GioLap` TIME NOT NULL,
  `TongTien` FLOAT NULL,
   PRIMARY KEY (`MaHD`)
)
ENGINE = InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD11', 'NV01', 'KH22', '2019/04/25 ', '13:20:37', '75700000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD12', 'NV01', 'KH19', '2019/04/26', '17:59:11', '84000000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD13', 'NV01', 'KH14', '2019/04/26', '18:58:06', '101200000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD14', 'NV02', 'KH19', '2019/05/01', '14:14:27', '975100000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD15', 'NV02', 'KH15', '2019/05/05', '15:12:27', '100900000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD16', 'NV02', 'KH1', '2019/05/10', '11:21:12', '400000000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD1', 'NV01', 'KH1', '2019/05/18', '23:15:36', '240000000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD2', 'NV01', 'KH1', '2019/05/18', '23:15:36', '240000000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD3', 'NV01', 'KH1', '2019/04/19', '18:44:34', '35000000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD4', 'NV01', 'KH1', '2019/05/21', '12:13:48', '60000000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD5', 'NV05', 'KH1', '2019/04/24', '3:18:01', '316000000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD6', 'NV05', 'KH4', '2019/04/25', '3:21:35', '174600000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD7', 'NV05', 'KH13', '2019/04/24', '3:22:30', '81000000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD8', 'NV05', 'KH3', '2019/04/24', '11:29:50', '174000000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD9', 'NV05', 'KH12', '2019/04/12', '21:43:30', '43900000');
INSERT INTO `quanlycuahangsach`.`hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `GioLap`, `TongTien`) VALUES ('HD10', 'NV05', 'KH12', '2019/04/12', '21:43:30', '43900000');

--  
-- Tạo bảng chitiethoadon
--

CREATE TABLE IF NOT EXISTS `chitiethoadon` (
  `MaHD` VARCHAR(10) NOT NULL,
  `MaSach` VARCHAR(10) NOT NULL,
  `SoLuong` INT(10) NOT NULL,
  `DonGia` Float NOT NULL,
  constraint primary key (MaHD,MaSach)
)
ENGINE = InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD2', 'MS6', '10', '20');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD2', 'MS1', '2', '20');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD1', 'MS1', '1', '20');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD3', 'MS4', '1', '15');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD3', 'MS6', '1', '20');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD1', 'MS2', '10', '8.2');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD1', 'MS3', '11', '15');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD4', 'MS1', '3', '20');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD5', 'MS23', '1', '19.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD5', 'MS4', '3', '3.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD6', 'MS4', '1', '3.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD6', 'MS3', '1', '7.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD6', 'MS8', '5', '23');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD6', 'MS10', '2', '23.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD7', 'MS10', '1', '23.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD7', 'MS12', '2', '7.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD7', 'MS16', '3', '11.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD7', 'MS17', '1', '5.6');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD8', 'MS15', '1', '5.5');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD8', 'MS16', '1', '11.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD9', 'MS10', '1', '23.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD9', 'MS1', '1', '20');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD10', 'MS13', '1', '7.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD10', 'MS5', '10', '25.7');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD10', 'MS6', '10', '6.5');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD11', 'MS1', '1', '20');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD11', 'MS10', '1', '23.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD11', 'MS11', '2', '15.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD12', 'MS15', '2', '5.5');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD12', 'MS17', '1', '5.6');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD12', 'MS12', '1', '7.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD12', 'MS16', '5', '11.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD13', 'MS5', '1', '25.7');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD13', 'MS6', '1', '6.5');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD13', 'MS8', '3', '23');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD14', 'MS23', '49', '19.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD15', 'MS10', '1', '23.9');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD15', 'MS1', '2', '20');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD15', 'MS18', '1', '24');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD15', 'MS19', '1', '13');
INSERT INTO `quanlycuahangsach`.`chitiethoadon` (`MaHD`, `MaSach`, `SoLuong`, `DonGia`) VALUES ('HD16', 'MS1', '20', '20');
-- 
-- Tạo bảng phieunhap 
--

CREATE TABLE IF NOT EXISTS `phieunhap` (
  `MaPN` VARCHAR(10) NOT NULL,
  `MaNV` VARCHAR(10) NOT NULL,
  `NgayNhap` DATE NOT NULL,
  `GioNhap` TIME NOT NULL,
  `TongTien` FLOAT NOT NULL,
  PRIMARY KEY (`MaPN`)
)ENGINE = InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
select * from phieunhap where  NgayNhap >= '1-1-20111';
INSERT INTO `quanlycuahangsach`.`phieunhap` (`MaPN`, `MaNV`, `NgayNhap`, `GioNhap`, `TongTien`) VALUES ('PN1', 'NV01', '2019/04/24', '1:25:08', '296000000');
INSERT INTO `quanlycuahangsach`.`phieunhap` (`MaPN`, `MaNV`, `NgayNhap`, `GioNhap`, `TongTien`) VALUES ('PN2', 'NV01', '2019/04/24', '1:25:23', '276500000');
INSERT INTO `quanlycuahangsach`.`phieunhap` (`MaPN`, `MaNV`, `NgayNhap`, `GioNhap`, `TongTien`) VALUES ('PN3', 'NV02', '2019/04/24', '17:06:52', '100000000');
INSERT INTO `quanlycuahangsach`.`phieunhap` (`MaPN`, `MaNV`, `NgayNhap`, `GioNhap`, `TongTien`) VALUES ('PN4', 'NV03', '2019/06/24', '2:51:18', '48800000');
INSERT INTO `quanlycuahangsach`.`phieunhap` (`MaPN`, `MaNV`, `NgayNhap`, `GioNhap`, `TongTien`) VALUES ('PN5', 'NV02', '2019/06/24', '17:54:01', '46900000');
INSERT INTO `quanlycuahangsach`.`phieunhap` (`MaPN`, `MaNV`, `NgayNhap`, `GioNhap`, `TongTien`) VALUES ('PN6', 'NV05', '2019/06/24', '17:58:26', '106900000');
INSERT INTO `quanlycuahangsach`.`phieunhap` (`MaPN`, `MaNV`, `NgayNhap`, `GioNhap`, `TongTien`) VALUES ('PN7', 'NV01', '2019/01/05', '14:15:27', '1190000000');
INSERT INTO `quanlycuahangsach`.`phieunhap` (`MaPN`, `MaNV`, `NgayNhap`, `GioNhap`, `TongTien`) VALUES ('PN8', 'NV02', '2019/10/05', '11:19:10', '119000000');
INSERT INTO `quanlycuahangsach`.`phieunhap` (`MaPN`, `MaNV`, `NgayNhap`, `GioNhap`, `TongTien`) VALUES ('PN9', 'NV02', '2019/10/05', '11:19:53', '200000000');
 
  
 -- 
 -- tạo bảng chitietphieunhap
 --
 
 CREATE TABLE IF NOT EXISTS `chitietphieunhap` (
  `MaPN` VARCHAR(10) NOT NULL,
  `MaSach` VARCHAR(45) NOT NULL,
  `SoLuong` INT(10) NOT NULL,
  `DonGia` FLOAT NOT NULL,
  constraint primary key (`MaPN`,`MaSach`)
)
ENGINE = InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
insert into chitietphieunhap values ('PN1','MS01',2,230000);
insert into chitietphieunhap values ('PN1','MS02',10,230000);
insert into chitietphieunhap values ('PN2','MS03',35,230000);
insert into chitietphieunhap values ('PN3','MS01',2,230000);
insert into chitietphieunhap values ('PN4','MS03',2,230000);
insert into chitietphieunhap values ('PN4','MS07',2,230000);
insert into chitietphieunhap values ('PN4','MS04',2,230000);
insert into chitietphieunhap values ('PN4','MS18',2,230000);
insert into chitietphieunhap values ('PN5','MS04',2,230000);
insert into chitietphieunhap values ('PN5','MS02',2,230000);
insert into chitietphieunhap values ('PN5','MS09',2,230000);
insert into chitietphieunhap values ('PN5','MS15',2,230000);
insert into chitietphieunhap values ('PN6','MS02',2,230000);
insert into chitietphieunhap values ('PN6','MS14',2,230000);
insert into chitietphieunhap values ('PN6','MS04',2,230000);
insert into chitietphieunhap values ('PN7','MS07',2,230000);
insert into chitietphieunhap values ('PN7','MS02',2,230000);
insert into chitietphieunhap values ('PN8','MS06',2,230000); 
insert into chitietphieunhap values ('PN9','MS017',2,230000); 
--
-- Tạo ràng buộc bảng chi tiết phiếu nhập
--
    
    