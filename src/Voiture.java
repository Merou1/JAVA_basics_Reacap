public class Voiture {
    private String make;
    private  String model;
    private int year;

    Voiture(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    //copy constrictor gets the object as paameter and applies the copy method on the object we are instanciating now so it'll get the data of the object that's passed as argument
    Voiture(Voiture voiture){
        this.copy(voiture);
    }

    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }

    public void setMake(String newMake){
        this.make=newMake;
    }
    public void setModel(String newModel){
        this.model=newModel;
    }
    public void setYear(int newYear){
        this.year=newYear;
    }
    public  void copy(Voiture voiture){
        this.setModel(voiture.getModel());
        this.setMake(voiture.getMake());
        this.setYear(voiture.getYear());
        //copy gets an object and change this objects attributes to that object's attributes
    }

    public String toString(){
        return this.make+" "+this.model+" "+this.year;
    }
}
