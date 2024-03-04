package com.phoneBook;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class TestBase {
    @BeforeMethod
    public void init() {
        RestAssured.baseURI ="https://contactapp-telran-backend.herokuapp.com";
        RestAssured.basePath ="v1";
    }
}
