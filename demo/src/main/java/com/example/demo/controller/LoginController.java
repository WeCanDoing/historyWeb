package com.example.demo.controller;

import com.example.demo.service.LoginService;
import com.example.demo.utils.DataUtils;
import com.example.demo.utils.SceneSwitchUtils;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @author 熊健
 * @date 2020/6/6  14:49
 */
@FXMLController
public class LoginController implements Initializable {

    private static Logger logger =  LoggerFactory.getLogger(LoginController.class);


    public ImageView titleImage;
    public TextField UserName;
    public TextField PassWord;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image=new Image("/image/title.png");
        titleImage.setImage(image);
    }

    @Autowired
    LoginService loginService;

    /**
     * 登录。
     * @param actionEvent
     */
    public void login(ActionEvent actionEvent) throws Exception{
        String userName= UserName.getText();
        String passWorld=PassWord.getText();
        if(DataUtils.isNotNull(userName)&&DataUtils.isNotNull(passWorld)){
            try {
                Boolean isLogin = loginService.loginService(userName, passWorld);
                if(isLogin){
                    SceneSwitchUtils sceneSwitchUtils=new SceneSwitchUtils();
                    sceneSwitchUtils.buttonSwitchScene(actionEvent,"/view/sample.fxml");
                }
            }catch (Exception e){
                logger.error("数据库连接失败");
            }
        }

    }

    /**
     * 关闭。
     * @param actionEvent
     */
    public void closeScene(ActionEvent actionEvent) {
    }
}
