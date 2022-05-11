module equipo.dinamita {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens crudjavafx to javafx.fxml;
    exports crudjavafx;
}
