public class Stereo  {

    private Radio radio;
    private RecordDeck recordDeck;
    private String stereoName;

    public Stereo(Radio radio, RecordDeck recordDeck, String stereoName){
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.stereoName = stereoName;
    }

    public void tuneStation(String station){
         this.radio.setStation(station);
    }

}
