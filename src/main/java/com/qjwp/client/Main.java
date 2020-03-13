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
    final static String LOAD_URL = "http://10.110.1.11:8001/";
    final static String TOKEN = "a3dde62ea4afbdce5e75a65e0bfce09f";

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();
        webEngine.setUserAgent(TOKEN);
        browser.setMinWidth(MIN_WIDTH);
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
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
