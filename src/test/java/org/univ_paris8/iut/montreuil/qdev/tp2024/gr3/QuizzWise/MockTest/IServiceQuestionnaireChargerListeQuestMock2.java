package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.MockTest;


import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utiles.exception.FichierIntrouvableException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utiles.exception.FichierVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utiles.exception.FormatFichierInvalideException;

import java.io.IOException;

public class IServiceQuestionnaireChargerListeQuestMock2 implements IQuestionnaire {
    @Override
    public QuestionnairesDTO chargerQuestionnaire(String url) throws FichierIntrouvableException, FormatFichierInvalideException, IOException, FichierVideException {
        throw new FichierVideException("Fichier vide: " + url);
    }
}
