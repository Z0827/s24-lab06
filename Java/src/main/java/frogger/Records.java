package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    //private final List<String[]> records;

    private final List<FroggerID> ids;

    public Records() {
        //this.records = new ArrayList<>();
        this.ids = new ArrayList<>();
    }

    public boolean addRecord(FroggerID id){
        for(FroggerID i: this.ids){
            if(i.equals(id)) return false;
        }
        return true;
    }

    // /**
    //  * Adds a frogger's record.
    //  *
    //  * @param firstName   first name of the frogger
    //  * @param lastName    last name of the frogger
    //  * @param phoneNumber phone number of the frogger
    //  * @param zipCode     zip code of the frogger
    //  * @param state       state of the frogger
    //  * @param gender      gender of the frogger
    //  * @return Return false if the record has existed. Else, return true.
    //  */
    // public boolean addRecord(String firstName, String lastName, String phoneNumber,
    //                          String zipCode, String state, String gender) {
    //     for (String[] row : this.records) {
    //         // really redundant here. Code duplication for the .equals()
    //         if (row[0].equals(firstName)
    //                 && row[1].equals(lastName)
    //                 && row[2].equals(phoneNumber)
    //                 && row[3].equals(zipCode)
    //                 && row[4].equals(state)
    //                 && row[5].equals(gender)) {
    //             return false;
    //         }
    //     }
    //     this.records.add(
    //             new String[]{firstName, lastName, phoneNumber, zipCode, state, gender});
    //     return true;
    // }
}