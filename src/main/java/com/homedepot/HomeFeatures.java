package main.java.com.homedepot;

public class HomeFeatures extends Homes {
    //homeFeatures: bedrooms, squareFootage, numberOfStories
    int bedrooms;
    int bathrooms;
    int squarefootage;
    int numberOfStories;

    public HomeFeatures(int bedrooms, int bathrooms, int squarefootage, int numberOfStories, String craftsman, String tudor, String victorian) {
        super();
        this.bathrooms = bathrooms;
        this.bedrooms = bedrooms;
        this.squarefootage = squarefootage;
        this.numberOfStories = numberOfStories;
        //we can either call the super() or super class which will then look like this:
        // ----------super(craftsman, tudor, victorian); and add the arguments to the sub-class constructor. line 10
        // or create an empty constructor for Homes.....public Homes(){}, then add the this.arguments..this.craftsman=craftsman;
        //A Java superclass is a class which gives a method or methods to a Java subclass.

//        this.craftsman = craftsman;
//        this.tudor= tudor;
//        this.victorian= victorian;

    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getSquarefootage() {
        return squarefootage;
    }

    public int getNumberOfStories() {
        return numberOfStories;
    }
}


