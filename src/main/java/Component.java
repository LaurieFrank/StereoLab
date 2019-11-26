public abstract class Component {

    protected String model;
    protected boolean play;

    public Component(String model){
        this.model = model;
        this.play = false;
    }

    public String getModel(){
        return this.model;
    }

    public boolean getPlay(){
        return this.play;
    }

    public void pressPlay(){
        this.play = true;
    }

}
