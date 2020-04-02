package JAN;

import java.util.List;

public interface ISaveable
{
    List<String> wrtie();

    void read(List<String> savedValues);
}
