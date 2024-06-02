package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.questionnaire;

public class IServiceQuestionnaireImplMockTestFileNotAvailable implements IServiceQuestionnaire {
    @Override
    public QuestionnairesDTO getListQuestionnaires(String sourceFichierCsv) throws FileNotAvailableException, EmptyFileException, CannotReadFileException {
        throw new FileNotAvailableException();
    }
}