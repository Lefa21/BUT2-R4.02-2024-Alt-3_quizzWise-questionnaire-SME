package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.impl;

import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.QuestionnaireImpl;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utiles.exception.FichierIntrouvableException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utiles.exception.FichierVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utiles.exception.FormatFichierInvalideException;
import static org.junit.jupiter.api.Assertions.assertThrows;



class ServiceChargerQuestionnaireImplTests {

    @Test
    void testFichierIntrouvableException() {
        IQuestionnaire iQuestionnaire = new QuestionnaireImpl();
        //IQuestionnaire iQuestionnaire = new IServiceQuestionnaireChargerListeQuestMock1();

        assertThrows(FichierIntrouvableException.class, () -> {
            iQuestionnaire.chargerQuestionnaire("url/fictive/nonExistant.csv");
        });
    }

    @Test
    void testFichierVideException() {
        IQuestionnaire iQuestionnaire = new QuestionnaireImpl();
        //IServiceQuestionnaireChargerListeQuestMock2 iQuestionnaire = new IServiceQuestionnaireChargerListeQuestMock2();

        assertThrows(FichierVideException.class, () -> {
            iQuestionnaire.chargerQuestionnaire("./resources/org/univ_paris8/iut/montreuil/qdev/tp2024/gr4/LesFootX/ressources/fichiervide.csv");
        });
    }

    @Test
    void testFormatFichierInvalideException() {
        IQuestionnaire iQuestionnaire = new QuestionnaireImpl();
        //IServiceQuestionnaireChargerListeQuestMock3 iQuestionnaire = new IServiceQuestionnaireChargerListeQuestMock3();

        assertThrows(FormatFichierInvalideException.class, () -> {
            iQuestionnaire.chargerQuestionnaire("chemin/vers/fichierAvecMauvaisFormat.csv");
        });
    }
}


