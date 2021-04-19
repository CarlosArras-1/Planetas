public class Planet {
    private String name;
    private double sun_distance;
    private String composition;
    private int orbit_days;
    public double mass;

//CONSTRUCTOR
    public Planet(String nom, double d, String c,int orbit_d,double mass){
this.name=nom;
this.sun_distance=d;
this.composition=c;
this.orbit_days=orbit_d;
this.mass=mass;
    }

}
