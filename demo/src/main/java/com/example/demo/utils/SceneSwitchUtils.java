package com.example.demo.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * 场景切换工具类。
 * @author 熊健
 * @date 2020/6/6  15:21
 */
public class SceneSwitchUtils {
    /**
     * 按钮类型切换场景。
     * @param actionEvent
     * @throws IOException
     */
    public  void buttonSwitchScene(ActionEvent actionEvent,String fxmlUrl) throws IOException {
        Parent Operation_Parent = FXMLLoader.load(getClass().getResource(fxmlUrl));
        Scene Operation_Creating_Scene = new Scene(Operation_Parent);
        Stage CreateOperation_Stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        CreateOperation_Stage.hide();
        CreateOperation_Stage.setScene(Operation_Creating_Scene);
        CreateOperation_Stage.show();
    }

}
