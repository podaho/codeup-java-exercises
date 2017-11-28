package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String changeName(String newName) {
        this.name = newName;
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public String changeCategory(String newCat) {
        this.category = newCat;
        return this.category;
    }

    public String getCategory() {
        return this.category;
    }
}
