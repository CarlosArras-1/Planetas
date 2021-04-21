public class Asteroid {
    private String name;
    private String composition;
    public double distance_earth;
    protected double speed;

    public Asteroid(String name, String composition, double distance_earth, double speed){
this.name=name;
this.composition=composition;
this.distance_earth=distance_earth;
this.speed=speed;
    }
public void setName(String newName){
        this.name=newName;
}
public String getName(){
        return this.name;
}
    public void setComposition(String newComposition){
        this.composition=newComposition;
    }
    public String getComposition(){
        return this.composition;
    }






}
