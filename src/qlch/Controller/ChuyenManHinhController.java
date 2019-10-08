/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Controller;

import qlch.Bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import qlch.View.CuaHangPanel;
import qlch.View.HoaDonPanel;
import qlch.View.KhoPanel;
import qlch.View.MainControl;
import qlch.View.DSSach;
import qlch.View.PhieuNhapPanel;
import qlch.View.TaiKhoanPanel;
import qlch.View.ThongKePanel;
import qlch.View.TrangChuPanel;


/**
 *
 * @author HiHi
 */
public class ChuyenManHinhController {
    private  JPanel jpnRoot;
    private String kindSelected = "";
    List<DanhMucBean> listItem = null;
    String s ="";
    public ChuyenManHinhController(JPanel jpnRoot){
        this.jpnRoot = jpnRoot;
        
    }
    public void setView(JPanel jpnItem,JLabel jlbItem){
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(102,102,102));
        jlbItem.setBackground(new Color(102,102,102));
        jlbItem.setForeground(new Color(204,204,204));
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new TrangChuPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }
    public JPanel getJpnRoot() {
        return jpnRoot;
    }

    public void setJpnRoot(JPanel jpnRoot) {
        this.jpnRoot = jpnRoot;
    }

    public String getKindSelected() {
        return kindSelected;
    }

    public void setKindSelected(String kindSelected) {
        this.kindSelected = kindSelected;
    }
    public void setEvent(List <DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item: listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    class LabelEvent implements MouseListener{
        private JPanel node;
        private  String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                switch(kind){
                    case "TrangChu":
                        node   =  new TrangChuPanel();
                        s = "Trang Chủ";
                        MainControl.changeTitle(s);
                        break;
                    case "CuaHang":
                        node  = new CuaHangPanel();
                        s = "Cửa Hàng";
                        MainControl.changeTitle(s);
                        break;
                    case "Kho":
                        node = new KhoPanel();
                        s = "Kho";
                        MainControl.changeTitle(s);
                        break;
                    case "HoaDon":
                        node = new HoaDonPanel();
                        s = "Hóa Đơn";
                        MainControl.changeTitle(s);
                        break;
                    case "SanPham":
                        node = new DSSach();
                        s = "Sản Phẩm";
                        MainControl.changeTitle(s);
                        break;
                    case "ThongKe":
                        node = new ThongKePanel();
                        s = "Thống Kê";
                        MainControl.changeTitle(s);
                        break;
                    case "TaiKhoan":
                        node = new TaiKhoanPanel();
                        s = "Tài Khoản";
                        MainControl.changeTitle(s);
                        break;
                    case "PhieuNhap":
                        node = new PhieuNhapPanel();
                        s = "Phiếu Nhập Hàng";
                        MainControl.changeTitle(s);
                        break;
                    default:break;
                    
                }
                jpnRoot.removeAll();
                jpnRoot.setLayout(new BorderLayout());
                jpnRoot.add(node);
                jpnRoot.validate();
                jpnRoot.repaint();
                setChangeBackgroud(kind);
            } catch (SQLException ex) {
                Logger.getLogger(ChuyenManHinhController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        //set màu cho ô con chuột đang được chọn màu
        public void mousePressed(MouseEvent e) {
           kindSelected = kind;
           jpnItem.setBackground(new Color(102,102,102));
           jlbItem.setBackground(new Color(96,100,191));
           jlbItem.setForeground(new Color(204,204,204));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        //khi di chuyển chuột vào thì đổi màu này
        public void mouseEntered(MouseEvent e) {
        
            jpnItem.setBackground(new Color(102,102,102));
           jlbItem.setBackground(new Color(96,100,191));    
           jlbItem.setForeground(new Color(204,204,204));
        }
        @Override
        //khi con chuột di ra ngoài thì đổi màu 
        public void mouseExited(MouseEvent e) {
          if(!kindSelected.equalsIgnoreCase(kind)){
               jpnItem.setBackground(new Color(30,30,30));
               jlbItem.setBackground(new Color(255,51,51));
               jlbItem.setForeground(new Color(153,153,153));
          }
    
        }
    }
    private void  setChangeBackgroud(String kind){
        for(DanhMucBean item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(102,102,102));
                item.getJlb().setBackground(new Color(96,100,191));
                
            }else{
                item.getJlb().setBackground(new Color(30,30,30));
                item.getJpn().setBackground(new Color(30,30,30));
            }
        }
    }
}
