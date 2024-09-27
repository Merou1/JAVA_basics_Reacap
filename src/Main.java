import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

    //---------------------------------1d arrays-------------------------------------------

    String[] cars={"lambo","porshe","ferrari"}; //kadeclara west {}

    //---------------------------------2d arrays-------------------------------------------

//        String[][] cars= new String [3][3] ;
//        cars[0][0]="lamborghini";
//        cars[0][1]="Ferrari";
//        cars[0][2]="ford";
//        cars[1][0]="mercedes";
//        cars[1][1]="bugatti";
//        cars[1][2]="aston martin";
//        cars[2][0]="pagani";
//        cars[2][1]="mclaren";
//        cars[2][2]="rolls royce";
//
//        System.out.println("cars array length: "+cars.length);
//
//        for (int i=0; i<cars.length; i++){
//                System.out.println();
//            for (int j=0; j<cars[i].length; j++){
//                if(j<cars[i].length-1){
//                    System.out.printf(cars[i][j]+"-");
//                }
//                else {
//                    System.out.printf(cars[i][j]);
//                }
//
//
//            }
//        }
//
//        String[][] fruits= { //2d array is and array {} of arrays {},{},{}...
//                {
//                    "lemon","orange","apple"
//                },
//                {
//                    "banana","strawberry","melon"
//                },
//                {
//                    "tomato","mango","avocado"
//                }
//        } ;
//        for (int i=0; i<fruits.length; i++){
//            System.out.println();
//            for (int j=0; j<fruits[i].length; j++){
//                if(j<fruits[i].length-1){
//                    System.out.printf(fruits[i][j]+"-");
//                }
//                else {
//                    System.out.printf(fruits[i][j]);
//                }
//
//
//            }
//        }
    //---------------------------------string methods-------------------------------------------

        String name="merou1";

        //int result = name.length();6
        //boolean result=name.equalsIgnoreCase("MErou1");true
        //char result = name.charAt(3);o
        //int result =name.indexOf("u");4
        //boolean result = name.isEmpty();false
        //String result = name.toUpperCase();MEROU1
        //String result =name.toLowerCase();merou1
        String result = name.replace("o","a"); //replace any o with a

        String name2="   merouane   ";
        if(name2=="   merouane   "){System.out.println("equals");} else{System.out.println("none equals");}
        //String result = name2.trim();merouane trim removes empty spaces

        System.out.println(result);
    // -------------------------------------- wrapper class-------------------------------
        /*boolean int double char ... are primitive data types that's why we don't
         declare them with capital first letter but String is reference data type that's why
         the S is capital and reference data type has some useful methods like indexof
         charat... but primitive data types don't have methods we can't have int x= 1
         x.method, but there's the wrapper classes of these primitive data types
         int->Integer, double->Double, char->Character, boolean->Boolean , if we notice they're declared
         with capital first letter so now we can use Integer x= 1 and have x.methods
         */
        Integer x= 2;
        //int result2 = x.hashCode();
        //int result2= x.byteValue();
        Character c= 'a';
        //char result3= c.charValue();
        int result3 = c.compareTo('b');//returns ' if true -1 if false
        System.out.println("result3: "+result3);

        /*at the same time even if we declare them as wrapper class they just behave as
        reference data types but they're still primitive because we can do if(c==''a) returns true
        ra a String wakha reference data type mashy darouri ndir xequlsy n9der ndir if x==y wakha
        bjuj strings, ghe hna weama wakha khdemna b wrapper class ra n9edrou ntreatiwhoum as
        primitive data types(hada kitsema l unboxing) w le fait d anaka takhed haja primitive
        b7al true w tpasseha l wrapper class li hiya Boolean x= true katkun derti autoboxing
        li hiya rediti primitive data type en utilisant wrapper class ybehave as a reference data type

        the disadvantage of using wrapper class is accessing their data is slower than
        primitive data types
         */
        /*                               SUMMARY
         if you want to have access to some useful methods on the primitive
        data types use their wrapper classes
         */
        //border!!!don't pass until you revise all the code above!!!

    // -----------------------------1d Arraylist------------------------------------
        /*
        in other programming languages arrays have methods like push pop ... that help
        you add or remove elements from arrays but in java arrays don't have these methods
        if you want to add or remove you should return to the array declaration and modify
        ------------------>In java arrays are irresizable
        ..................>Arraylists are resizable arrays t9der moura lcompilation
        west lcode t adde wla t remove elts wla tcleare l arraylist
        ..................Note: ArrayList kat9bel ghe reference data types donc
        la bghit nkhdem b int,boolean...
        khass n nkhedem wrapper classes
         */
        ArrayList<String> food= new ArrayList<String>();//empty
        //add elements
        food.add("Pizza");
        food.add("Icecream");
        food.add("humberger");
        System.out.println("menu 1: "+food);
        //remove elements
        food.remove(0);//remove(index)
        System.out.println("menu 2: "+food);
        //clear arrayList
        //food.clear();
        //System.out.println("menu 3: "+food);

        //get one item
        System.out.println(food.get(1));



        // -----------------------------2d Arraylist------------------------------------
            /* 2d array is an array of arrays so 2d arrayList is an arrayList of arrayLists
             */
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        //2d arrayList that has arrayLists insinde it that's why it has ArrayList<String> as data type
        ArrayList<ArrayList<String>> groceryList =new ArrayList();

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println("groceryList: \n"+groceryList);
        System.out.println("groceryList's first arraylist: \n"+groceryList.get(0));
        System.out.println("groceryList's first arraylist's first element: \n"+groceryList.get(0).get(0));//.get.get because they're all arraylists i won't have [0] but i should use .get method of arrayLists

        // -----------------------------for-each------------------------------------
        String[] myCars={"lambo","porshe","ferrari"};
        /*array fiha strings ha elash kandeclarew i b efss type w ":" rahoum equivalent
        l in, donc l koula string in myCars array dir traitement li lwest
        i hna mashy compteur ra hadi fir each katgul l kula i men l array donc i khass
        imatche data type dyal elements dl array
         */
        System.out.println("myCars array elements are :");
        for(String i : myCars){ //for each string element in myCars array print the element
            System.out.printf("car: %s\n",i);//i is a string %s in printf is a placeholder for a string
        }

        ArrayList<String> animals =new ArrayList<String>();

        animals.add("dog");
        animals.add("horse");
        animals.add("cat");

        System.out.println("animals arrayList elements are :");
        for(String i : animals){
            System.out.println(i);
        }

        // -----------------------------printf , f stands for formatting i guess------------------------------------
            //printf b7al dyal c katkhedem fiha placeholders: %d %c %.2f for precision...

        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character] = b-c-f-d... ela hssab var type
        //System.out.printf("%b",myBoolean);
        //System.out.printf("%c",myChar);
        //System.out.printf("%s",myString);
        //System.out.printf("%d",myInt);%d meand decimal
        //System.out.printf("%f",myDouble);%f for double and float

        //[width]
        // minimum number of characters to be written as output
        //System.out.printf("Hello %10s",myString);Hello        Bro 7 spaces+3 charcaacts of Bro=10 width

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        //System.out.printf("You have this much money %.1f",myDouble);1000.0 without precision atkun 1000.000000

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify kaytzadou spaces men limen  width:spaces men left -width spaces ela limen mais makitedfe3sh kitzadou spaces
        //System.out.printf("Hello %-10s m",myString);//Hello bro        m
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value la kenti mdeclareh positif atkteb hdah + la keenti mdeclareh negatif atkteb hdah -
        // 0 : numeric values are zero-padded kaytdfe3 dak number b des 0 men limen katkemel lwidth b des 0
        // , : comma grouping separator if numbers > 1000

        //System.out.printf("You have this much money %,f",myDouble);1,000.000000
        //System.out.printf("You have this much money %,.2f",myDouble);1,000.00
        //System.out.printf("You have this much money %020f",myDouble);0000000001000.000000 kemelna 0 dyal lwidth b des 0


        // -----------------------------final keyword------------------------------------
            /*normalemet ay var declaret char String int... ymkne men bead nbedeliha lvalue
            ghe lmhm neatiha nefs type
            int x=10;
            x=13;
            System.out.printf(x);13
            x="x";
            System.out.printf(x);error
            final hiya cst maymkensh tbedel w 7ssen tsemi lfinal vars b PI hadi convention
             */
            final int Y=100;
            //Y=300;//error

        // ***********************OOP******************************
            DiceRoller diceRoller = new DiceRoller();

        // -----------------------------Array of objects------------------------------------

        Food food1 = new Food("pizza");
        Food food2 = new Food("pizza");
        Food food3 = new Food("pizza");

        //Food[] refrigerator = refregirator array that'll store data of type Food objects
        Food[] refrigerator ={food1,food2,food3};

        for(Food i : refrigerator){//Food i hit refregirator eamr b objects dyal Food class
            System.out.println(i.name);
        }
        // -----------------------------object passing------------------------------------
        Car car1 = new Car("Audi RSQ8");
        Car car2 = new Car("Range Rover Vogue");

        Garage garage1 = new Garage();

        garage1.park(car1);

        // -----------------------------static keyword------------------------------------
        /*
        a variable that's not static kay9der ay objet yaccedelha w fl7a9i9a kaykoun koula
        objet endou wa7ed lcopy men dak lvariable dyalou bu7du ha elash mnin kandir objectName.varName
        kateati amiya dyal dak objet bou7dou hit khda copie dyal dak lvariable
        var wla method static katkun copy we7da katshara nefssha end gae l members dyal lclass
        mashy kula wa7ed b dyaliu donc maymkensh techniquement n3eytouliha b object.staticVar
        hit hiya katkun l owner dyalha hiya lclass mafihash des copies lkula var
        donc kan3eytoulha b className.statucvar
         */
        System.out.println( Car.numberOfCars);//2


        Car car3 = new Car("Range Rover Sport");
        /*
        hna name var mashy static donc n9der ndir car3.name w at3tini name dyal car3
        hit car3 khda copy dlvar name w dar fiha smiytou mais lfou9 numberOfCars ghatb9a t3tina
        number total dyal lcars li kaytzadou drnaha static hit mam7tajinsh kul car ikoun fiha
        numberofcars hna bghina var wa7ed kaytjme3 fih numberOfCars

        we can also have a static method:
         */
        Car.numberOfCarsMethod();//you have 3 cars static method called by class name

        // -----------------------------inheritance------------------------------------
        /*
        mnin kikounou endeq 2 classes wla ktar metcharken f des attributes w methodes bash
        téviter répitition d anaka tkteb bzaf dlhajat b7al b7al f des classes mkhtalfin
        katakhed dkshy li mshabhin fih w dirou fclass mère men bead houma kayextendewha
        w ykhdmou b duk attributes w methods lwe9t li 7tajouhoum
         */
        car3.go();

        Bycicle bycicle1 =new Bycicle();
        bycicle1.stop();

        //because car and bycicle classes extend vehicle class they can use it's methods and attributes


        // -----------------------------super keyword------------------------------------
        Hero hero1 = new Hero("batman",42,"Rich");
        Hero hero2 = new Hero("superman", 42, "Strong");

        System.out.println(hero1);////hero1 or hero1.toString() give the same result
        System.out.println(hero2.toString()); //hero2 or hero2.toString() give the same result

        // -----------------------------abstraction------------------------------------
            /*abstract class has at least 1 abstract method , abstract methodhas no body, abstract class can't be instanciated
            maymkensh ikoun endha objet w rah logic b7ala mshit lshy car dealership  w gtlou 3tini wa7ed lvehicule
            mashy 3tini car wla truck...
            so it'll be overided in the subclass, kanderou des classeabstraite ldkshy li kikun globale
            b7al vehicule forme geom... kaykunu fehq des methodes mais mafihumsh lbody
            lbody aydar f kula methode ela 7ssab child kidayr matalan abstract method go f abstract class vehicule
            kula mera atkun go endeha body ela 7ssab child wash car truck...
             */

        // -----------------------------acess modifiers------------------------------------
        /* -No modifier: Acessed by classes in the same package(FOLDER FIH BZAF DCLASSES) or the same class
           - Public accessed from everywhere
           - Private Accessed by element in the same CLASS only
           -Protected: Accessed by child-class elements or the class(parent class fin
            mdeclarer houa)elements or same package classes but others that are outside
             can't access it
         */

        // -----------------------------Encapsulation------------------------------------
            /*
            -Encapsulation: to make attributes or methods(aghlabya kaykunu public) hidden(private)
            they can only be accessed through getters and setters
            -It's better to make attributes and methods hidden=encapsulated=private if you don't have a
            reason to make them public or protected
            -So encapsulation is for private vars and you can access them by getters ans setters
             */

            Voiture voiture = new Voiture("Lamborghini", "Aventador", 2017);
            //System.out.println(voiture.year);Error year is private so it can only be accessed inside the Voiture class

            //getters to access private vars because the get methods are public=can be accessed from everywhere
            System.out.println(voiture.getMake()+" "+voiture.getModel()+" "+voiture.getYear());

            //setters to changes attributes values
            voiture.setMake("Audi");
            voiture.setModel("RSQ8");
            voiture.setYear(2023);

            System.out.println(voiture.getMake()+" "+voiture.getModel()+" "+voiture.getYear());

        // -----------------------------copy objects------------------------------------
        /*
        we can copy objects in the main or we can do in the class a copy constructor
        */
        /*
        object1=object2 is not copying objects hit hna ayweliw bjujhum nefss l'object
        la printinahoum ayeatiwna nefs l'adresse donc kaypointew llnefss l'adresse donc wela
        endena nefss l'objet hna bghina 2 object kula wa7ed w lash kaypointe w n9der n7et data
        d hada f lakhour
         */
        Voiture voiture1= new Voiture("Lamborghini","veneno", 2014);

        voiture.copy(voiture1);//voiture and voiture1 are two distinct objects that'll have now the same data

        //i have toString fct overrided so System.out.println(voiture); will print data not adress
        System.out.println(voiture);
        System.out.println(voiture1);
        //voiture and voiture1 are two distinct objects with the same data

        /*we can also use a copy contructor that has the copy methode inside
        wich helps copy objects in object in the moment in instanciation,
        check constructor in Voiture class
         */
        Voiture voiture2 = new Voiture(voiture1);
        System.out.println(voiture2+"--");//it should have the data of voiture1

        /*
        if i didn't have the toString method each System.out.println(voitureObject) will have an adress

         */

        // -----------------------------Interface------------------------------------
        /*
        interface is a template hiya wa7ed prototype dyal des classe b7al wa7ed tearif dyal des classe
        li kaykoun general walakin fmìnefs lwe9t abstract maymkensh nkhdem bih nishan
        b7al f exemple dyal shape la dert class shape w feha methode draw atji abstract
        hit kighander nrssem shape khass nearaf wash rectangle triangle.., interface hiya li kaykunu
        gae methods fiha abstract kaykunu bla body w mnin kandeclarewha b inerface makan7tajoush
        ndirou public abstract 9edam methods hit katkun implicitement f ay interface
        kader ghe matalan void draw();
        men bead anjib class smitha triangle implements shape han an9der nakhd methods
        dyal shape n overidehoum w koula methode atkhdem f kul class m inplementya
        l'interface f shkel ela 7ssab lclass w hada hua polymorphisme nefs fcy w kula
        mera endeha corps

        donc interface hiya f le cas li kander fih w7ed b7al template general
        w li maymkensh nkhdem biha nishan hadshy elash gae methods dyal kaykunu abstract w maymkensh
        t intancia maymejnsh ndir Shape shape= new shape()  (n9der nder : Shape shape  w n7bess
        hit hadi kantsema creet type ma instancietsh object)

        donc les interface an kan7eded mnen kanl9a rassi an7tajhoum kaji b7al hierarchie
        endi l'interface lfou9 w mdefini fiha shnu katt9der dir as abstract methods w men bead les classes
        kayimplementewha wioveridew l methods
         */









    }
}