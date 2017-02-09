package pokedraftbuilder.pokemondraftpackbuilder.ViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pokedraftbuilder.pokemondraftpackbuilder.Model.DraftList;
import pokedraftbuilder.pokemondraftpackbuilder.Model.DraftPack;

/**
 * Created by Erik on 2/9/2017.
 */

public class PlayDraft {
    public List<String> addedPokes = new ArrayList<>();
    public List<DraftPack> draftPacks = new ArrayList<>();
    public DraftList draftList;
    Random random;

    public PlayDraft(){
        draftList = new DraftList();
        random = new Random();
    }

    //creates a set of 3 draft packs for each player in the draft
    public void startDraft(int numberOfPlayers){
        int packID = 0;
        for (int i = 0; i < numberOfPlayers; i++){
            for (int j = 0; j < 3; j++){
                List<String> currentPack = new ArrayList<String>();
                for (int k = 0; k < 6; k++){
                    String nextPoke = draftList.getPokeAtIndex(random.nextInt(draftList.getPokeListLength()));
                    while (addedPokes.contains(nextPoke)){
                        nextPoke = draftList.getPokeAtIndex(random.nextInt(draftList.getPokeListLength()));
                    }
                    addedPokes.add(nextPoke);
                }
                draftPacks.add(new DraftPack(currentPack, packID));
                packID++;
            }
        }
    }

    public DraftPack getPackOneByPlayerNumber(int playerNumber){
        int packOneIndex = (playerNumber * 3) - 1;
        return draftPacks.get(packOneIndex);
    }

    public DraftPack getPackTwoByPlayerNumber(int playerNumber){
        int packTwoIndex = (playerNumber * 3) - 2;
        return draftPacks.get(packTwoIndex);
    }

    public DraftPack getPackThreeByPlayerNumber(int playerNumber){
        int packThreeIndex = (playerNumber * 3) - 3;
        return draftPacks.get(packThreeIndex);
    }

    public void choosePokeFromPack(int packID, String poke){
        draftPacks.get(packID).removePokeFromPack(poke);
    }
}
