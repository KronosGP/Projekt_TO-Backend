module com.example.projekt_to {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.projekt_to to javafx.fxml;
    exports com.example.projekt_to;
}