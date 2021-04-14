package cn.along.demos.processone;

import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;

public class WelcomController {


    public TextField aVar;
    public TextField bVar;
    public TextField resVar;

    public void additionClick(MouseEvent mouseEvent) {
        Double aDouble = Double.parseDouble(aVar.getText());
        Double bDouble = Double.parseDouble(bVar.getText());
        Double resD = aDouble + bDouble;
        resVar.setText(String.valueOf(resD));
    }

    public void subtractionClick(MouseEvent mouseEvent) {
        Double aDouble = Double.parseDouble(aVar.getText());
        Double bDouble = Double.parseDouble(bVar.getText());
        Double resD = aDouble - bDouble;
        resVar.setText(String.valueOf(resD));
    }

    public void multiplicationClick(MouseEvent mouseEvent) {
        Double aDouble = Double.parseDouble(aVar.getText());
        Double bDouble = Double.parseDouble(bVar.getText());
        Double resD = aDouble * bDouble;
        resVar.setText(String.valueOf(resD));
    }

    public void divisionClick(MouseEvent mouseEvent) {
        Double aDouble = Double.parseDouble(aVar.getText());
        Double bDouble = Double.parseDouble(bVar.getText());
        Double resD = aDouble / bDouble;
        resVar.setText(String.valueOf(resD));
    }

}
