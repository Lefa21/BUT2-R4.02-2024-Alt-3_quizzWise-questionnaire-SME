package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.test.questionnaire;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.questionnaire.IServiceQuestionnaireImplMockEmptyFile;

public class IServiceQuestionnaireTestEmptyFile {

    private IServiceQuestionnaire iServiceQuestionnaire = new IServiceQuestionnaireImplMockEmptyFile();


    @Test
    public void testChargerQuestionnaireEmptyFileException() throws FileNotAvailableException, EmptyFileException, CannotReadFileException {
        Assertions.assertThrows(EmptyFileException.class, () -> {
            iServiceQuestionnaire.getListQuestionnaires("src/test/resources/EmptyFile");
        });

    }
}