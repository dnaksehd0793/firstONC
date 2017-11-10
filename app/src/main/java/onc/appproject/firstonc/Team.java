package onc.appproject.firstonc;

/**
 * Created by jamleekim on 2017-11-10.
 */

public class Team {
    public String teamName;
    //public String teamLeader;
    public String teamregion;
    public boolean official; //등록유무
    public Team(){

    }
    public Team(String teamName , String teamregion, boolean official){
        this.teamName = teamName;
        this.teamregion = teamregion;
        this.official = official;
    }

}
