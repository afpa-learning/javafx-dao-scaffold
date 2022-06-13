package fr.afpa.model;

import java.sql.Connection;
import java.util.ArrayList;

import fr.afpa.model.tools.DAOInterface;
import fr.afpa.model.tools.MariaDBConnection;

/**
 * Exemple d'implémentation d'un DAO avec un classe fictive
 * Dans nos projets nous utiliserons 
 * TODO créer des DAO en fonction des objets métiers
 */
public class ModelTestDAO implements DAOInterface<ModelTest> {

    @Override
    public ModelTest find(long id) {
        // TODO requête de type SELECT
        @SuppressWarnings("unused")
        Connection connection = MariaDBConnection.getInstance();
        return null;
    }

    @Override
    public ArrayList<ModelTest> list() {
        // TODO requête de type SELECT *
        return null;
    }

    @Override
    public ModelTest create(ModelTest obj) {
        // TODO requête de type INSERT
        return null;
    }

    @Override
    public ModelTest update(ModelTest obj) {
        // TODO requête de type UPDATE
        return null;
    }

    @Override
    public void delete(ModelTest obj) {
        // TODO requête de type DELETE
    }
}
