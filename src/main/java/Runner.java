import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Tiger", "Wiids", 41);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("Kim", "Jong-un", 34);
        DBGolfer.save(golfer2);

        Golfer golfer3 = new Golfer("Doonald", "Troomp", 71);
        DBGolfer.save(golfer3);

        List<Golfer> golfers = DBGolfer.getGolfers();

        golfer1 = new Golfer("Tiger", "Woods", 41);
        DBGolfer.update(golfer1);

        Golfer foundGolfer = DBGolfer.findById(golfer1.getId());

       // Golfer foundByName = DBGolfer.findByName(golfer1.getFirstName());
    }
}
