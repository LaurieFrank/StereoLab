public class Radio extends Component {

    private String station;

    public Radio(String model, String station){
        super(model);
        this.station = station;
    }

    public String getStation(){
        return this.station;
    }

    public void setStation(String radioStation){
        this.station = radioStation;
    }
}
