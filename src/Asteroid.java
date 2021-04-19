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
}
