package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto;

import java.util.Objects;

public class QuestionDTO {
    private int numQuestionnaire;
    private String libelleQuestion;
    private String reponse;
    private int difficulte;

    public QuestionDTO(int numQuestionnaire, String libelleQuestion, String reponse, int difficulte) {
        this.numQuestionnaire = numQuestionnaire;
        this.libelleQuestion = libelleQuestion;
        this.reponse = reponse;
        this.difficulte = difficulte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionDTO)) return false;
        QuestionDTO that = (QuestionDTO) o;
        return numQuestionnaire == that.numQuestionnaire && difficulte == that.difficulte && Objects.equals(libelleQuestion, that.libelleQuestion) && Objects.equals(reponse, that.reponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numQuestionnaire, libelleQuestion, reponse, difficulte);
    }

    public int getNumQuestionnaire() {
        return numQuestionnaire;
    }

    public void setNumQuestionnaire(int numQuestionnaire) {
        this.numQuestionnaire = numQuestionnaire;
    }

    public String getLibelleQuestion() {
        return libelleQuestion;
    }

    public void setLibelleQuestion(String libelleQuestion) {
        this.libelleQuestion = libelleQuestion;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public int getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
    }
}
