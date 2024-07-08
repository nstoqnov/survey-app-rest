package com.example.SurveyREST.service;

import com.example.SurveyREST.model.SurveyModel;

import java.util.List;

public interface SurveyService {
    public List<SurveyModel> fetchSurveys();
}
