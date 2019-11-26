import java.util.ArrayList;

public class RecordDeck extends Component {

    private ArrayList<String> vinyl;
    private int speed;

    public RecordDeck(String model, int speed){
        super(model);
        this.vinyl = new ArrayList<String>();
        this.speed = speed;
    }


    public int getSpeed() {
        return this.speed;
    }

    public ArrayList<String> getVinylSize() {
        return this.vinyl;
    }

    public void addVinyl(String vinylToAdd) {
        vinyl.add(vinylToAdd);
    }
}
