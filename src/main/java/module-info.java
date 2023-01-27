module com.example.learnjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.learnjavafx to javafx.fxml;
    exports com.example.learnjavafx;
}