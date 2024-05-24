module org.example.controledefluxodesafio {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.controledefluxodesafio to javafx.fxml;
    exports org.example.controledefluxodesafio;
}