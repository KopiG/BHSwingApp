package com.braininghub.swing.model;

import com.braininghub.swing.entity.Donor;

import javax.swing.table.AbstractTableModel;
import java.awt.Color;
import java.time.LocalDate;
import java.util.List;

/**
 * Base Model class to hold Donors
 * Created by kopig on 2019. 03. 26.
 */
public class DonorTableModel extends AbstractTableModel {
    private final List<Donor> donors;

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClasses[columnIndex];
    }

    private final String[] columnNames = new String[] {
        "First Name", "Last Name", "All Donations", "Last Donation"
    };

    private final Class[] columnClasses = new Class[] {
        String.class, String.class, Integer.class, LocalDate.class
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
        switch (columnIndex) {
            case 0:
                return donors.get(rowIndex).getFirstName();
            case 1:
                return donors.get(rowIndex).getLastName();
            case 2:
                return donors.get(rowIndex).getAllDonations();
            case 3:
                return donors.get(rowIndex).getLastDonation();
            default:
                return null;
        }
    }

    public DonorTableModel(List<Donor> donors) {
        this.donors = donors;
    }

    public Color getBackgroundColor(int rowNumber) {
        LocalDate lastDonation = (LocalDate) getValueAt(rowNumber, 3);
        if (LocalDate.now().isAfter(lastDonation.plusDays(56))) {
            return Color.GREEN;
        } else {
            return Color.RED;
        }
    }

}
