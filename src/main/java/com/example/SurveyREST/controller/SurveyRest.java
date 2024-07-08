package com.example.SurveyREST.controller;

import com.example.SurveyREST.model.SurveyModel;
import com.example.SurveyREST.service.SurveyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SurveyRest {
    private SurveyService surveysServiceRest;

    public SurveyRest(SurveyService surveyServiceService){
        this.surveysServiceRest = surveyServiceService;
    }
    @GetMapping(value = "/")
    public String getAllSurveys(){
        List<SurveyModel> list = surveysServiceRest.fetchSurveys();
        return "";
    }

}
