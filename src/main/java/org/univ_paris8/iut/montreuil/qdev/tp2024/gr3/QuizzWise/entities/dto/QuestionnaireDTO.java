package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class QuestionnaireDTO {

    private List<QuestionDTO> lsteQuestion;

    public QuestionnaireDTO() {
        this.lsteQuestion = new ArrayList<>();
    }

    public List<QuestionDTO> getLsteQuestion() {
        return lsteQuestion;
    }

    public void addQuestion(QuestionDTO q){
        lsteQuestion.add(q);
    }

    public void setLsteQuestion(List<QuestionDTO> lsteQuestion) {
        this.lsteQuestion = lsteQuestion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionnaireDTO that = (QuestionnaireDTO) o;
        return Objects.equals(lsteQuestion, that.lsteQuestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lsteQuestion);
    }

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "lsteQuestion=" + lsteQuestion +
                '}';
    }
}
