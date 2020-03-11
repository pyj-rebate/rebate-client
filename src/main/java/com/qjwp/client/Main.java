package com.qjwp.client;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {
    final static int MIN_WIDTH = 1260;
    final static String TITLE = "核对小工具";
    final static String LOAD_URL = "http://www.baidu.com";

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();
        browser.setMinWidth(MIN_WIDTH);
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(browser);
        webEngine.load(LOAD_URL);
        scene.setRoot(scrollPane);
        stage.setMinWidth(MIN_WIDTH + 40);
        stage.setScene(scene);
        stage.setTitle(TITLE);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
