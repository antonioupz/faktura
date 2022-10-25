package pl.edu.akademiazamojska.service;

import pl.edu.akademiazamojska.entity.StawkaVAT;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StawkaVatService {
    private List<StawkaVAT> stawkiVat=new ArrayList<>();

    public StawkaVAT getStawkaVATbyId(Integer id){
        for (StawkaVAT s:stawkiVat
             ) {
            if(s.getId()==id)
                return s;
        }
        return null;
    }

    public StawkaVatService() {
        stawkiVat.add(new StawkaVAT(-1, new BigDecimal("0"), "ZW" ));
        stawkiVat.add(new StawkaVAT(0, new BigDecimal("0"), "0%" ));
        stawkiVat.add(new StawkaVAT(5, new BigDecimal("5"), "5%" ));
        stawkiVat.add(new StawkaVAT(8, new BigDecimal("8"), "8%" ));
        stawkiVat.add(new StawkaVAT(23, new BigDecimal("23"), "23%" ));
    }
}
