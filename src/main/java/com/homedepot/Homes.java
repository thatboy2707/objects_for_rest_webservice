package main.java.com.homedepot;

public class Homes {
    //homes: craftsman, tudor, colonial
    String craftsman;
    String tudor;
    String victorian;

    public Homes(String craftsman, String tudor, String victorian) {
        this.craftsman= craftsman;
        this.tudor= tudor;
        this.victorian= victorian;
    }

    public Homes(){

    }

    public String getCraftsman() {
        return craftsman;
    }

    public String getTudor() {
        return tudor;
    }

    public String getVictorian() {
        return victorian;
    }

    public String toString()
    {
        return("This house is a " + this.getCraftsman()+ "style home" +
                ".\n not a " + this.getTudor() + " or a " + this.getVictorian());
    }

    public static void main(String[] args)
    {
        Homes description = new Homes("old style craftsman", "not a old style tudor","a victorian" );
        System.out.println(description.toString());
    }

}


//    public static void main(String[] args)
//    {
//        Dog tuffy = new Dog("tuffy","papillon", 5, "white");
//        System.out.println(tuffy.toString());
//    }
//}