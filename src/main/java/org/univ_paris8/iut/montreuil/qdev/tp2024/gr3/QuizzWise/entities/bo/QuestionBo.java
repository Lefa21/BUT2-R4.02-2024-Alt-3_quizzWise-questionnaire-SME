package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.bo;

import java.util.Objects;

public class QuestionBo {
    private int idQuestionnaire;
    private int numQuestionnaire;
    private String langue;
    private String libelleQuestion;
    private String response;
    private String Difficulte;
    private String explication;
    private String Reference;

    public QuestionBo(int idQuestionnaire, int numQuestionnaire, String langue, String libelleQuestion, String response, String difficulte, String explication, String reference) {
        this.idQuestionnaire = idQuestionnaire;
        this.numQuestionnaire = numQuestionnaire;
        this.langue = langue;
        this.libelleQuestion = libelleQuestion;
        this.response = response;
        Difficulte = difficulte;
        this.explication = explication;
        Reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionBo)) return false;
        QuestionBo that = (QuestionBo) o;
        return idQuestionnaire == that.idQuestionnaire && numQuestionnaire == that.numQuestionnaire && Objects.equals(langue, that.langue) && Objects.equals(libelleQuestion, that.libelleQuestion) && Objects.equals(response, that.response) && Objects.equals(Difficulte, that.Difficulte) && Objects.equals(explication, that.explication) && Objects.equals(Reference, that.Reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestionnaire, numQuestionnaire, langue, libelleQuestion, response, Difficulte, explication, Reference);
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public int getNumQuestionnaire() {
        return numQuestionnaire;
    }

    public void setNumQuestionnaire(int numQuestionnaire) {
        this.numQuestionnaire = numQuestionnaire;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getLibelleQuestion() {
        return libelleQuestion;
    }

    public void setLibelleQuestion(String libelleQuestion) {
        this.libelleQuestion = libelleQuestion;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getDifficulte() {
        return Difficulte;
    }

    public void setDifficulte(String difficulte) {
        Difficulte = difficulte;
    }

    public String getExplication() {
        return explication;
    }

    public void setExplication(String explication) {
        this.explication = explication;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }
}
