package JAN;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>
{
    public String name;
    private ArrayList<T> leauge = new ArrayList<>();

    public League(String name)
    {
        this.name = name;
    }

    public boolean add(T team)
    {
        if(leauge.contains(team))
        {
            return false;
        }

        leauge.add(team);
        return true;
    }

    public void showLeagueTable()
    {
        Collections.sort(leauge);
        for(T t: leauge)
        {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
