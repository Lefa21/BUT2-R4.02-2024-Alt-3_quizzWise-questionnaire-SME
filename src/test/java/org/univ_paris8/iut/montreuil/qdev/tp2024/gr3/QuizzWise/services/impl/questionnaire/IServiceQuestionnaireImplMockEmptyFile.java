package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.questionnaire;

public class IServiceQuestionnaireImplMockEmptyFile implements IServiceQuestionnaire {
    @Override
    public QuestionnairesDTO getListQuestionnaires(String sourceFIchierCsv) throws FileNotAvailableException, EmptyFileException, CannotReadFileException {
        throw new EmptyFileException();
    }
}
