package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto;

import java.util.List;
import java.util.Objects;

public class QuestionnairesDTO {
    private List<QuestionDTO> listQuestionnaire;
    private int idQuestionnaire;
    private static int compteur = 0;

    public QuestionnairesDTO(List<QuestionDTO> listQuestionnaire) {
        this.listQuestionnaire = listQuestionnaire;
        compteur++;
        this.idQuestionnaire = compteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionnairesDTO that = (QuestionnairesDTO) o;
        return idQuestionnaire == that.idQuestionnaire && Objects.equals(listQuestionnaire, that.listQuestionnaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listQuestionnaire, idQuestionnaire);
    }

    @Override
    public String toString() {
        return "QuestionnairesDTO{" +
                "listQuestionnaire=" + listQuestionnaire +
                ", idQuestionnaire=" + idQuestionnaire +
                '}';
    }

    public List<QuestionDTO> getListQuestionnaire() {
        return listQuestionnaire;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public void setListQuestionnaire(List<QuestionDTO> listQuestionnaire) {
        this.listQuestionnaire = listQuestionnaire;
    }


    public Object getListQuestionnaires(String s) {
    }
}
