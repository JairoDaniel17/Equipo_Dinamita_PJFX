module equipo.dinamita {
    requires javafx.controls;
    requires javafx.fxml;

    opens equipo.dinamita to javafx.fxml;
    exports equipo.dinamita;
}
