module com.uno.projectuno {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;

    opens com.uno.projectuno to javafx.fxml;
    exports com.uno.projectuno;
}