module com.example.tutorialcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tutorialcss to javafx.fxml;
    exports com.example.tutorialcss;
}