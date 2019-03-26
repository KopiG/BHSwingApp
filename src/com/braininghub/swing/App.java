package com.braininghub.swing;

import com.braininghub.swing.entity.Donor;
import com.braininghub.swing.model.DonorTableModel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kopig on 2019. 03. 26..
 */
public class App {

    public static void main(String[] args) {
        List<Donor> donors = new ArrayList<>();
        Donor donor1 = new Donor("Peter", "Miska", 3, new Date());
        Donor donor2 = new Donor("Gabor", "Alfoldi", 1, new Date());
        donors.add(donor1);
        donors.add(donor2);

        DonorTableModel donorTableModel = new DonorTableModel(donors);

        JTable donorTable = new JTable(donorTableModel);
        JScrollPane jScrollPane = new JScrollPane(donorTable);
        JFrame frame = new JFrame("App");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().add(jScrollPane);
        frame.setSize(600, 400);
    }
}
