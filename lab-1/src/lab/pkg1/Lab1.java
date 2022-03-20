package lab.pkg1;

/**
 *
 * @author yurar
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Country[] countries = new Country[]{
            new Country("Russia", 17100000f, 146700000, "Moscow", 126000000),
            new Country("Finland", 338000f, 5500000, "Helsinki", 655000),
            new Country("France", 643800f, 67800000, "Paris", 2100000),
            new Country("Andorra", 467f, 85400, "Andorra la Vella", 22600),
            new Country("Singapore", 725f, 5700000)
        };
        printAll(countries);
    }
    
    static void printAll(Country[] countries) {
        for(int i = 0; i < countries.length; i++){
            countries[i].print();         
        }    
    }
    
}
