package Domino;
import java.util.Comparator;

class SortDomino implements Comparator<Domino> {

    @Override
    public int compare(Domino o1, Domino o2) {
        if (o1.getLeftSide() != o2.getLeftSide()) {
            return o1.getLeftSide() - o2.getLeftSide();
        } else {
            return o1.getRightSide() - o2.getRightSide();
        }
    }
}
