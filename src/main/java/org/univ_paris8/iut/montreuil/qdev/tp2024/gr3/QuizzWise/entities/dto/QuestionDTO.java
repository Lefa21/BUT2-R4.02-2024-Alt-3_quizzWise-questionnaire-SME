package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.enumerate.Difficulte;

import java.util.Objects;

public class QuestionDTO {
    private int numQuestionnaire;
    private String libelleQuestion;
    private String reponse;
    private Difficulte difficulte;

    public QuestionDTO(int numQuestionnaire, String libelleQuestion, String reponse, Difficulte difficulte) {
        this.numQuestionnaire = numQuestionnaire;
        this.libelleQuestion = libelleQuestion;
        this.reponse = reponse;
        this.difficulte = difficulte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionDTO that = (QuestionDTO) o;
        return numQuestionnaire == that.numQuestionnaire && Objects.equals(libelleQuestion, that.libelleQuestion) && Objects.equals(reponse, that.reponse) && Objects.equals(difficulte, that.difficulte);
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

    public Difficulte getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(Difficulte difficulte) {
        this.difficulte = difficulte;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "numQuestionnaire=" + numQuestionnaire +
                ", libelleQuestion='" + libelleQuestion + '\'' +
                ", reponse='" + reponse + '\'' +
                ", difficulte=" + difficulte +
                '}';
    }
}
