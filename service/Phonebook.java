package DZ7.service;

import java.util.LinkedList;
import DZ7.data.ContactMain;

public class Phonebook {

    private LinkedList<ContactMain> lst;

    public Phonebook() {
        this.lst = new LinkedList<>();
    }

    public LinkedList<ContactMain> getLst() {
        return lst;
    }

    @Override
    public String toString() {
        String res = "";
        for (Object elem : lst) {
            res = res + elem + "\n";
        }
        return res;
    }

}