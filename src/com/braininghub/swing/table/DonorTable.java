package com.braininghub.swing.table;

import com.braininghub.swing.model.DonorTableModel;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import java.awt.Component;

/**
 * Created on 2019. márc. 27.
 *
 * @author <a href="gergo.kopacsi@loxon.eu">Gergő Kopácsi</a>
 */
public class DonorTable extends JTable {
    public DonorTable(TableModel dm) {
        super(dm);
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component c = super.prepareRenderer(renderer, row, column);
        DonorTableModel donorTableModel = (DonorTableModel) getModel();
        c.setBackground(donorTableModel.getBackgroundColor(row));
        return c;
    }
}
