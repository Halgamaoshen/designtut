module com.example.week1buttontutorialweek2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.week1buttontutorialweek2 to javafx.fxml;
    exports com.example.week1buttontutorialweek2;
}