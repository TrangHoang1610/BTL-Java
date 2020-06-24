/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.controller;

import community.com.model.KhachHangObject;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hoang
 */
public class KhachHangTable extends AbstractTableModel {
    private final String name[] = {"MaKH","TenKH","SoDT","NgaySinh","ThoiQuen","SoThich"};
    ArrayList<KhachHangObject> dsKH = new ArrayList<>();

    public KhachHangTable(ArrayList<KhachHangObject> dsKH) {
        this.dsKH = dsKH;
    }
    
    @Override
    public int getRowCount() {
        return dsKH.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsKH.get(rowIndex).getMaKH();
            case 1: return dsKH.get(rowIndex).getTenKH();
            case 2: return dsKH.get(rowIndex).getSoDT();
            case 3: return dsKH.get(rowIndex).getNgaySinh();
            case 4: return dsKH.get(rowIndex).getThoiQuen();
            case 5: return dsKH.get(rowIndex).getSoThich();
//            case 5: if(dsKH.get(rowIndex).getGioiTinh() == 1){ return "Nam"; } else { return "Nữ"; }
     
        }
        return null;
    }


    @Override
    public String getColumnName(int column) {
        return name[column]; //To change body of generated methods, choose Tools | Templates.
    }
}
