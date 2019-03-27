package com.braininghub.swing.service;

import com.braininghub.swing.entity.Donor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created on 2019. márc. 27.
 *
 * @author <a href="gergo.kopacsi@loxon.eu">Gergő Kopácsi</a>
 */
public class DonorService {
    public static List<Donor> getDonors() {
        List<Donor> donors = new ArrayList<>();
        Donor donor1 = new Donor("Peter", "Miska", 3, new Date());
        Donor donor2 = new Donor("Gabor", "Alfoldi", 1, new Date());
        donors.add(donor1);
        donors.add(donor2);
        return donors;
    }
}
