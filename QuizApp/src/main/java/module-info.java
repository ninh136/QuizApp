module com.pnn.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;

    opens com.pnn.quizapp to javafx.fxml;
    exports com.pnn.quizapp;
}
