public class Principal {
    public static void main(String[] args){
       Planet x = new Planet( "Tierra", 1500, "Solida", 365,5454 );

       Asteroid Mechas = new Asteroid("Mechas","gaseoso",122342.33,34.32);
        Asteroid Pp2 = new Asteroid("Pp2","Solido",153434.0001,12.21);
        Asteroid son = new Asteroid("son","semigaseoso",1231231234,1.234);
    System.out.println(Mechas.getName());
        System.out.println(Mechas.getComposition());
        Mechas.setName("Mechas 2.0");
        Mechas.setComposition("FLuidos misteriosos");
        System.out.println(Mechas.getName());
        System.out.println(Mechas.getComposition());

        System.out.println(Pp2.getName());
        System.out.println(Pp2.getComposition());
        Pp2.setName("R2D2");
        Pp2.setComposition("Metalico");
        System.out.println(Pp2.getName());
        System.out.println(Pp2.getComposition());

        System.out.println(son.getName());
        System.out.println(son.getComposition());
        son.setName("I´m you father");
        son.setComposition("NO0o0o0o0o0o0o");
        System.out.println(son.getName());
        System.out.println(son.getComposition());

    }


}
