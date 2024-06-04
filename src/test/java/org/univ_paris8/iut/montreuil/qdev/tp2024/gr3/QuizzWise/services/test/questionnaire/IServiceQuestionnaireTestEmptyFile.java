package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.test.questionnaire;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.questionnaire.IServiceQuestionnaireImplMockEmptyFile;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces.IServiceQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.CannotReadFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.EmptyFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.FileNotAvailableException;

public class IServiceQuestionnaireTestEmptyFile {

    private IServiceQuestionnaire iServiceQuestionnaire = new IServiceQuestionnaireImplMockEmptyFile();


    @Test
    public void testChargerQuestionnaireEmptyFileException() throws FileNotAvailableException, EmptyFileException, CannotReadFileException {
        Assertions.assertThrows(EmptyFileException.class, () -> {
            iServiceQuestionnaire.getListQuestionnaires("src/test/resources/EmptyFile");
        });

    }
}