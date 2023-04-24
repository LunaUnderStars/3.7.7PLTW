public class Cereal {
    String name = "";
    int sugar = 0;
    double rating = 0;

    public Cereal(String name, int sugar, double rating) {
        this.name = name;
        this.sugar = sugar;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getSugar() {
        return sugar;
    }

    public double getRating() {
        return rating;
    }


    public void setName(String name) {
        this.name = name; 
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString() {
        return name + ", Sugar content " + sugar + ", Rating " + rating;
    }
}