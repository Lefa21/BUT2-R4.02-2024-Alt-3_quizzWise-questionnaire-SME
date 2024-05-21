package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto;

import java.util.List;
import java.util.Objects;

public class QuestionnairesDTO {
    private List<QuestionDTO> listQuestionnaire;

    public QuestionnairesDTO(List<QuestionDTO> listQuestionnaire) {
        this.listQuestionnaire = listQuestionnaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionnairesDTO)) return false;
        QuestionnairesDTO that = (QuestionnairesDTO) o;
        return Objects.equals(listQuestionnaire, that.listQuestionnaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listQuestionnaire);
    }

    @Override
    public String toString() {
        return "QuestionnairesDTO{" +
                "listQuestionnaire=" + listQuestionnaire +
                '}';
    }

    public List<QuestionDTO> getListQuestionnaire() {
        return listQuestionnaire;
    }

    public void setListQuestionnaire(List<QuestionDTO> listQuestionnaire) {
        this.listQuestionnaire = listQuestionnaire;
    }
}
