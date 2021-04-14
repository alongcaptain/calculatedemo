package cn.along.demos.processone;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.facade.IAddtion;

public class WelcomController {

    public TextField aVar;
    public TextField bVar;
    public TextField resVar;

    private IAddtion addtion;

    @FXML
    public void initialize(){
        try {
            addtion = (IAddtion) Class.forName("").newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void additionClick(MouseEvent mouseEvent) {
        Double aDouble = Double.parseDouble(aVar.getText());
        Double bDouble = Double.parseDouble(bVar.getText());
        Double resD = addtion.addtion(aDouble, bDouble);
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
