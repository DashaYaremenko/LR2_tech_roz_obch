module org.example.lr2_tech_roz_obch {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lr2_tech_roz_obch to javafx.fxml;
    exports org.example.lr2_tech_roz_obch;
}