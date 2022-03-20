package lab.pkg1;

/**
 *
 * @author yurar
 */
public class Country {
    private String name;
    private float square;
    private int peopleCount;
    private String capital;
    private int peopleCapitalCount;

    public Country(String name, float square, int peopleCount) {
        this.name = name;
        this.square = square;
        this.peopleCount = peopleCount;
    }
    
    public Country(String name, float square, int peopleCount, String capital, int peopleCapitalCount) {
        this.name = name;
        this.square = square;
        this.peopleCount = peopleCount;
        this.capital = capital;
        this.peopleCapitalCount = peopleCapitalCount;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
        if (square <= 0) {
            throw new IllegalArgumentException("Площадь должна быть положительной");
        }
        this.square = square;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        if (peopleCount <= 0 ) {
            throw new IllegalArgumentException("Население должно быть положительным");
        }
        this.peopleCount = peopleCount;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPeopleCapitalCount() {
        return peopleCapitalCount;
    }

    public void setPeopleCapitalCount(int peopleCapitalCount) {
        this.peopleCapitalCount = peopleCapitalCount;
    }
    
   public void print() {
        String info =
               "name=" + name
            + "; square=" + square
            + "; peopleCount=" + peopleCount;
        if (capital != null) {
                info = info +
                     "; capital=" + capital +
                     "; peopleCapitalCount=" + peopleCapitalCount;
        }
        
       System.out.println(info);
   }
    
}
