module es.ieslosmontecillos.tableviewsample {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.tableviewsample to javafx.fxml;
    exports es.ieslosmontecillos.tableviewsample;
}