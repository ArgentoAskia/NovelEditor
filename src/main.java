import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *  程序入口点类
 * @author Askia
 */

/*
    翻译指南：
    1.首先将初次翻译文本进行翻译 + 通读
    2.明白大意后，进行润色（逐词、逐句修正翻译，人名替换）
    3.文本润色
    4.修改排版
    5.发布（内置浏览器？）
*/
public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("View/NEMainPanel.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("翻译文章管理");
        primaryStage.setHeight(400);
        primaryStage.setWidth(600);
        primaryStage.show();
    }
}
