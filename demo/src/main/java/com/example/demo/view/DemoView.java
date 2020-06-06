package com.example.demo.view;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import javafx.scene.layout.BorderPane;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * @author 熊健
 * @date 2020/6/2  16:55
 */
// fxml的位置相对于resource文件夹
@FXMLView("/view/sample.fxml")
public class DemoView extends AbstractFxmlView {

}