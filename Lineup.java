import java.util.ArrayList;

public class Lineup <T> {
    private final ArrayList<T> lineup = new ArrayList<>(4);

    private boolean isAscending;

    public Lineup(T first, T second, T third, T fourth) {

        this.isAscending = true;
    }

    @Override
    public String toString(){
        return lineup.get(0) + " -> " +
        lineup.get(1) + " -> " +
        lineup.get(2) + " -> " +
        lineup.get(3);
    }

    public <T> void add(T element) {
        if (isAscending) {
            //use insertion sort here
            for (int i = 0; i < 4; i ++){
            }
        }
    }

    public <T> boolean remove(T element) {
        for(int i = 0; i < 4; i++){
            //gets the last element and places it in the removed index
            if (lineup.get(i).equals(element)){
                lineup.remove(element);
                return true;
            }

        }
        return false;
    }

    public void reverseLineup() {
        //implement iterable, for each
        for (T thing : lineup) {

        }
        isAscending = !isAscending;
    }

    public <T> boolean contains(T element) {

        for(T thing : lineup){
            if (thing.equals(element))
                return true;
        }
        return false;
    }

    public int size() {
        int counter = 0;
        for (T thing : lineup){
            if (thing != null) {
                counter ++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

    }

}
