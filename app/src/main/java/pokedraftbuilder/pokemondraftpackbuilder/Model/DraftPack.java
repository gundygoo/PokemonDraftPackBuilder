package pokedraftbuilder.pokemondraftpackbuilder.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erik on 2/9/2017.
 */

public class DraftPack {
    private List<String> pokePack = new ArrayList<>();
    private int packID;

    public DraftPack(List<String> newPack, int packID){
        pokePack = newPack;
        this.packID = packID;
    }

    public String getPokeAtIndex(int index){
        return pokePack.get(index);
    }

    public void addPokeToPack(String poke){
        pokePack.add(poke);
    }

    public void removePokeFromPack(String poke){
        pokePack.remove(poke);
    }

    public int getPackID(){
        return packID;
    }

    public List<String> getPokePack() {
        return pokePack;
    }

    public void changeOnePokeInPack(String oldPoke, String newPoke){
        int index = pokePack.indexOf(oldPoke);
        pokePack.remove(oldPoke);
        pokePack.add(index, newPoke);
    }
}
