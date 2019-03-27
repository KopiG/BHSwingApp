package com.braininghub.swing.service;

import com.braininghub.swing.entity.Donor;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019. márc. 27.
 *
 * @author <a href="gergo.kopacsi@loxon.eu">Gergő Kopácsi</a>
 */
public class DonorService {
    public static List<Donor> getDonors() {
        List<Donor> donors = new ArrayList<>();
        LocalDate localDate = LocalDate.of(2018, Month.DECEMBER, 3);
        LocalDate localDate2 = LocalDate.of(2019, Month.MARCH, 11);
        Donor donor1 = new Donor("Peter", "Miska", 3, localDate);
        Donor donor2 = new Donor("Gabor", "Alfoldi", 1, localDate2);

        donors.add(donor1);
        donors.add(donor2);
        return donors;
    }
}
