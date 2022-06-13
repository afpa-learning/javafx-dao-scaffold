module fr.afpa {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens fr.afpa to javafx.fxml;
    exports fr.afpa;
    
    opens fr.afpa.controller to javafx.fxml;
    exports fr.afpa.controller;
}
