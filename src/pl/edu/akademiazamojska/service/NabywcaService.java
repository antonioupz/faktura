package pl.edu.akademiazamojska.service;

import pl.edu.akademiazamojska.entity.Nabywca;

import java.util.ArrayList;
import java.util.List;

public class NabywcaService {
    private List<Nabywca> nabywcaList=new ArrayList<>();
    public Nabywca findNabywcaByNip(Integer nip){
        for (Nabywca n:nabywcaList
             ) {
            if(n.getNip()==nip)
                return n;
        }
        return null;
    }


    public NabywcaService(){
        nabywcaList.add(new Nabywca("A", "Zamosc", "Swojska", "22-400", "1", 1, null));
        nabywcaList.add(new Nabywca("B", "Zamosc", "Swojska", "22-400", "2", 2, null));
        nabywcaList.add(new Nabywca("C", "Zamosc", "Swojska", "22-400", "3", 3, null));
        nabywcaList.add(new Nabywca("D", "Zamosc", "Swojska", "22-400", "4", 4, null));
        nabywcaList.add(new Nabywca("E", "Zamosc", "Swojska", "22-400", "5", 5, null));
        nabywcaList.add(new Nabywca("F", "Zamosc", "Swojska", "22-400", "6", 6, null));

    }
}
