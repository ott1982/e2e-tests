package com.example.demo.glue;


import io.cucumber.java.en.When;

import java.io.IOException;


public class End2endTestsGlue {

    @When("users upload data on a project")
    public void usersUploadDataOnAProject() throws IOException {

    }


    @When("users want to get information on the {string} project")
    public void usersGetInformationOnAProject(String projectName) throws IOException {

    }


//    @When("^users want to get information on the '(.+)' project$")
//    public void usersGetInformationOnAProject(String projectName) throws IOException {
//
//    }

}
