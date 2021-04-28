import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
      /* Planet x = new Planet( "Tierra", 1500, "Solida", 365,5454 );

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
*/
        int op=0;
        Scanner scanner=new Scanner(System.in);
        while(op!=4){
            System.out.println("¿Qué desea hacer? \n 1)Crear estrella \n 2)Crear Asteroide \n 3)Crear Planeta \n 4)Salir");
             op=scanner.nextInt();
             switch (op){
                 case 1:{
                     System.out.println("Introduce el diametro");
                     double d=scanner.nextDouble();
                     System.out.println("Tipo de estrella \n 1)Enana Roja \n2)Enana Blanca \n3)Supernova");
                     int t= scanner.nextInt();
                     String tipo="";
                     if(t==1){tipo="Enana Roja";}
                    else if(t==2){tipo="Enana Blanca";}
                    else if(t==3){tipo="Spernova";}
                     else{
                         tipo="Estrella normal";
                     }
                     System.out.println("Elige el color de la Estrella \n1) Roja \n2)Azul 3)Amarilla");
                     int c=scanner.nextInt();
                     Color color=Color.BLACK;
                     if(c==1){color=Color.RED;}else if(c==2){color=Color.BLUE;}else if(c==3){color=Color.YELLOW;}
                    Star estrella1=new Star(d,tipo,color);
                     System.out.println("La estrella que creaste es: \n Diametro  " + estrella1.getDiameter() +
                             "\n El tipo"+ estrella1.getType() + "\nEl color" + estrella1.getColor().toString() );
                     break;

                 }
                 case 2:{
                     //Asteroide
                     System.out.println("Introduce el nombre del asteroide");
                     String N= scanner.next();
                     System.out.println("Introduce la composicion de el asteroide \n1) Solido \n2)liquido \n3)Gaseoso");
                     int C= scanner.nextInt();
                     String composition="";
                     if(C==1){composition="Solido";}
                     else if (C==2){composition="Liquido";}
                     else if (C==3){composition="Gaseoso";}
                     System.out.println("Coloca la Distancia entre el asteroide y la tierra");
                     double Distance_earth= scanner.nextDouble();
                     System.out.println("Coloca la velcoidad del asteroide");
                     double speed= scanner.nextDouble();
                     Asteroid asteroide1 = new Asteroid(N,composition,Distance_earth,speed);
                     System.out.println("El nombre del asteroide es: "+ asteroide1.getName() + "\nLa composicion del asteroide es: " + asteroide1.getComposition()
                     + "\nLa distancia a la tierra es: "+ Distance_earth + "\ny por ultimo la velociadad es:" + speed );

                     break;
                 }
                 case 3:{
                     //Planeta
                     System.out.println("Introduce el nombre del planeta");
                     String Nombre = scanner.next();
                     System.out.println("Introduce la distancia al sol");
                     double SD= scanner.nextDouble();
                     System.out.println("Introduce su composicion");
                     String Comp= scanner.next();
                     System.out.println("Introduce sus dias en orbita");
                     int DO= scanner.nextInt();
                     System.out.println("Introduce la masa del planeta");
                     double Masa= scanner.nextDouble();
                     Planet planeta1= new Planet(Nombre,SD,Comp,DO,Masa);
                     System.out.println("El nombre del asteroide es: "+ planeta1.getName() + "\nLa composicion del asteroide es: " + planeta1.getSun_Distance()
                             + "\nLa distancia a la tierra es: "+ planeta1.getComposition() + "\n Los dias en orbita son: " + planeta1.getOrbit_days() + "\n La masa es: "+ Masa  );


                     break;
                 }
                 case 4:{
                     //Salir
                     System.out.close();

                     break;

                 }
                 default:{
                     System.out.println("Opcion no valida");
                 }
             }
        }
        System.out.println("Gracias por utilizar el sistema");
    }


}
