package com.braininghub.swing.frame;

import com.braininghub.swing.entity.Donor;
import com.braininghub.swing.model.DonorTableModel;
import com.braininghub.swing.service.DonorService;
import com.braininghub.swing.table.DonorTable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created on 2019. márc. 27.
 *
 * @author <a href="gergo.kopacsi@loxon.eu">Gergő Kopácsi</a>
 */
public class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException {
        DonorTableModel donorTableModel = new DonorTableModel(DonorService.getDonors());
        JScrollPane jScrollPane = new JScrollPane(new DonorTable(donorTableModel));
        JFrame frame = new JFrame("App");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().add(jScrollPane);
        frame.setSize(600, 400);
    }
}
