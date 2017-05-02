package odev;

import java.util.ArrayList;

/**
 * Created by SEZER on 2.05.2017.
 */


public class Singer {
    public ArrayList<String> VolkanKonak = new ArrayList<String>();
    public ArrayList<String> MuratBoz = new ArrayList<String>();
    public  ArrayList<String> Sagopa = new ArrayList<String>();

    public void ListSingerAlbum()

    {
        VolkanKonak.add("/ VOLKAN KONAK /");
        VolkanKonak.add("aleni");
        VolkanKonak.add("göklerdekartalgibiyim");
        VolkanKonak.add("mimozaciçeğim");
        for(int i = 0; i<VolkanKonak.size(); i++)
        {
            System.out.println(VolkanKonak.get(i));
        }
        MuratBoz.add("Gün Ağardı");
        MuratBoz.add("Iltimas");
        MuratBoz.add("Adını Bilen Yazsın");
        for(int i = 0; i<MuratBoz.size(); i++)
        {
            System.out.println(MuratBoz.get(i));
        }
        Sagopa.add("366.gun");
        Sagopa.add("Galiba");
        Sagopa.add("Baytar");
        for(int i = 0; i<Sagopa.size(); i++)
        {
            System.out.println(Sagopa.get(i));
        }
    }

}

