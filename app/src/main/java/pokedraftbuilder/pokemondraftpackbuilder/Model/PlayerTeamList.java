package pokedraftbuilder.pokemondraftpackbuilder.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erik on 2/9/2017.
 */

public class PlayerTeamList {
    private List<String> teamList = new ArrayList<String>();
    private String playerName;

    public List<String> getTeamList() {
        return teamList;
    }

    public String getPlayerName() {
        return playerName;
    }

    public PlayerTeamList(String playerName){
        this.playerName = playerName;
    }

    public void addPokeToTeam(String poke){
        teamList.add(poke);
    }

    public void removePokeFromTeam(String poke){
        teamList.remove(poke);
    }


}
