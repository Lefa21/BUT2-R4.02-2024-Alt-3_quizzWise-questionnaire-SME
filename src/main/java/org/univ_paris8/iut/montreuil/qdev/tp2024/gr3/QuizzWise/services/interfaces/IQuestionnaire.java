package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utiles.exception.FichierIntrouvableException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utiles.exception.FichierVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utiles.exception.FormatFichierInvalideException;

import java.io.IOException;

public interface IQuestionnaire {

    public QuestionnairesDTO chargerQuestionnaire(String url)
            throws FichierIntrouvableException, FormatFichierInvalideException, IOException, FichierVideException;

}
