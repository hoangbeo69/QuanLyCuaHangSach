/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.ThongKe;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;



public class ThongKe {
    public void setDataToChart1(JPanel jpnItem)  {
        ThongKeDB db = new ThongKeDB();
         ArrayList<HoaDonThongKe> listItem = new ArrayList<>();
        try {
         listItem  = db.thongKeHoaDon();   
        } catch (Exception e) {
            System.out.println(e);
        }
 
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (listItem != null) {
            for (HoaDonThongKe item : listItem) {
                              dataset.addValue(item.getSohoadon(), "Học viên", item.getThang());
            }
        }
 
        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu Đố Số Hóa Đơn 6 Tháng Gần Nhất ".toUpperCase(),
                "Tháng ", "Số lượng Đơn",
                dataset, PlotOrientation.VERTICAL, false, true, false);
        ChartPanel chartPanel;
        chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(),jpnItem.getHeight()));
 
        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
    
    
        public void setDataToChart2(JPanel jpnItem)  {
        ThongKeDB db = new ThongKeDB();
         ArrayList<DoanhThuThongKe> listItem = new ArrayList<>();
        try {
         listItem  = db.thongKeDoanhThu();   
        } catch (Exception e) {
            System.out.println(e);
        }
 
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (listItem != null) {
            for (DoanhThuThongKe item : listItem) {
                              dataset.addValue(item.getDoanhthu(), "Học viên", item.getThang());
            }
        }
 
        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu Đố Doanh Thu  6 Tháng Gần Nhất ".toUpperCase(),
                "Tháng ", " Doanh Thu (VNĐ)",
                dataset, PlotOrientation.VERTICAL, false, true, false);
        ChartPanel chartPanel;
        chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(),jpnItem.getHeight()));
 
        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
}
