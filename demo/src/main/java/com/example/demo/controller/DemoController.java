package com.example.demo.controller;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author 熊健
 * @date 2020/6/2  17:07
 */
@FXMLController
public class DemoController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public Label hello;
    public TextField MD5;

    public void finctionSayHello(ActionEvent actionEvent) {
        hello.setText("文件路径");
        Stage fileStage = null;
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        //选择文件，识别文件
        File selectedFile =fileChooser.showOpenDialog(fileStage);
        if(selectedFile!=null) {
            String fileMD5 = DigestUtils.md5Hex(String.valueOf(selectedFile));
            hello.setText(String.valueOf(selectedFile));
            System.out.println("文件MD5是" + fileMD5);
            MD5.setText(fileMD5);
        }else {
            hello.setText("请选择文件");
        }
    }


    public void login(ActionEvent actionEvent) {
        hello.setText("切换成功");
    }
}