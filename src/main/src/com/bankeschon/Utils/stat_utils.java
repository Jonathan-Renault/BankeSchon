package com.bankeschon.Utils;

import com.bankeschon.Models.Howmanyprospect;
import com.bankeschon.Models.Offer;
import com.bankeschon.Models.Prospect;

import java.util.ArrayList;
import java.util.List;

public class stat_utils {
    public Offer getAllOffers () {
        Offer _object = new Offer();
        List offers;
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList filters = new ArrayList<String>();
        Filter filter = new Filter();
        fields.add("*");
        filters.add(filter.add("=", "1", "1"));
        offers = Database.select(_object, fields, filters);
        Offer offer = (Offer) offers.get(0);
        return offer;
    }

    public List<Prospect> getAllProspects () {
        Prospect _object = new Prospect();
        List prospect;
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList filters = new ArrayList<String>();
        Filter filter = new Filter();
        fields.add("*");
        filters.add(filter.add("=", "1", "1"));
        prospect = Database.select(_object, fields, filters);
        return prospect;
    }

    public Howmanyprospect getHowmanyprospect () {
        Howmanyprospect _object = new Howmanyprospect();
        List howmanyprospects;
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList filters = new ArrayList<String>();
        Filter filter = new Filter();
        fields.add("count");
        filters.add(filter.add("=", "1", "1"));
        howmanyprospects = Database.select(_object, fields, filters);
        Howmanyprospect howmanyprospect = (Howmanyprospect) howmanyprospects.get(0);

        return howmanyprospect;


    }


}
