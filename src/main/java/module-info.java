module com.example.movierecommendationplatform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.movierecommendationplatform to javafx.fxml;
    exports com.example.movierecommendationplatform;
}