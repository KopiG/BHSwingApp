package com.braininghub.swing.model;

import com.braininghub.swing.entity.Donor;

import javax.swing.table.AbstractTableModel;
import java.util.Date;
import java.util.List;

/**
 * Created by kopig on 2019. 03. 26..
 */
public class DonorTableModel extends AbstractTableModel {
    List<Donor> donors;

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClasses[columnIndex];
    }

    protected String[] columnNames = new String[] {
            "First Name", "Last Name", "All Donations", "Last Donation"
    };

    protected Class[] columnClasses = new Class[] {
            String.class, String.class, Integer.class, Date.class
    };

    @Override
    public int getRowCount() {
        return donors.size();
    }

    @Override
    public int getColumnCount() {
        return Donor.class.getDeclaredFields().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0 : return donors.get(rowIndex).getFirstName();
            case 1 : return donors.get(rowIndex).getLastName();
            case 2 : return donors.get(rowIndex).getAllDonations();
            case 3 : return donors.get(rowIndex).getLastDonation();
            default: return null;
        }
    }

    public DonorTableModel(List<Donor> donors) {
        this.donors = donors;
    }
}
