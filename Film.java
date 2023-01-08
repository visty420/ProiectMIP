public class Film {
    private String titlu;
    private String categorie;
    private String dataLansare;
    private int aprecieri;

    public Film(String titlu, String categorie, String dataLansare, int aprecieri) {
        this.titlu = titlu;
        this.categorie = categorie;
        this.dataLansare = dataLansare;
        this.aprecieri = aprecieri;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getDataLansare() {
        return dataLansare;
    }

    public int getAprecieri() {
        return aprecieri;
    }
}