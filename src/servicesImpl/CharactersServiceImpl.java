package servicesImpl;

import objects.Characters;
import services.CharactersService;

import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Human Booster on 18/01/2017.
 */
public class CharactersServiceImpl implements CharactersService{
    //TEST CODE
    private List<Characters> chars = new ArrayList<>();

    CharactersServiceImpl(){
        chars.add(new Characters(1,"BASIC GOOD GUY", true));
        chars.add(new Characters(2,"BASIC BAD GUY", false));
    }


    @Override
    public Characters getCharactersById(int id) {
        try{
            for (int i = 0; i < chars.size(); ++i){
                if (chars.get(i).getId() == id){
                    return chars.get(i);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
