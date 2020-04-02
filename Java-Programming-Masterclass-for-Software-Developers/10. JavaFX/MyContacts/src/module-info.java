module MyContacts {

    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.web;
    requires java.desktop;
    opens sample.datamodel;
    opens sample;
}