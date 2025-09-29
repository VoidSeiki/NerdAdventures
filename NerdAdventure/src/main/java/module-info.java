module com.mycompany.nerdadventure {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.nerdadventure to javafx.fxml;
    exports com.mycompany.nerdadventure;
}
