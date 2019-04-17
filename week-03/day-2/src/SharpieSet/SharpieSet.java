package SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    public List<Sharpie> SharpieSet = new ArrayList<>();

    public void add(Sharpie addedSharpie) {
        SharpieSet.add(addedSharpie);
    }

    public int countUsable() {
        int counterUsable = 0;
        for (Sharpie testedSharpie : SharpieSet) {
            if (testedSharpie.inkAmount != 0) {
                counterUsable++;
            }
        }
        return counterUsable;
    }

    public void removeThrash() {

        int counterOfRemoving = 0;

        for (int i = 0; i < SharpieSet.size() - counterOfRemoving; i++) {
            if (SharpieSet.get(i).inkAmount == 0) {
                SharpieSet.remove(i);
                counterOfRemoving++;
            }
        }
    }
}


