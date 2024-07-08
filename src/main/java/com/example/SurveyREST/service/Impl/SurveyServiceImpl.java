package com.example.SurveyREST.service.Impl;

import com.example.SurveyREST.model.SurveyModel;
import com.example.SurveyREST.service.SurveyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SurveyServiceImpl implements SurveyService {
    @Override
    public List<SurveyModel> fetchSurveys() {
        List<SurveyModel> list = new ArrayList<>();
        SurveyModel s1 = new SurveyModel();
        s1.setId(1);
        s1.setOwner("Nikolay");
        list.add(s1);
        return list;
    }
}
