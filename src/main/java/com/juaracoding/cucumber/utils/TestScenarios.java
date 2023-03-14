package com.juaracoding.cucumber.utils;

public enum TestScenarios {
    T1("User successful Login into web HRM"),
    T2("User unsuccessful Login with invalid credentials into web HRM"),
    T3("User unsuccessful Login with null credentials into web HRM"),
    T4("User successful add candidate");



    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
