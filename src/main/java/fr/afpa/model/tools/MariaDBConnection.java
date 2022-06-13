package fr.afpa.model.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe encapsulant les informations nécessaire à la connexion à une base de données.
 * Cette classe est un singleton : http://thecodersbreakfast.net/index.php?post/2008/02/25/26-de-la-bonne-implementation-du-singleton-en-java
 */
public class MariaDBConnection {

    /**
     * URL de connexion à la base de données
     * TODO à compléter
     */
    private static String url;
    /**
     * Nom de l'utilisateur à utiliser pour la connexion à la base de données
     * TODO à compléter
     */
    private static String user;
    /**
     * Mot de passe de l'utilisateur à utiliser pour la connexion à la base de données
     * TODO à compléter
     */
    private static String password;
    /**
     * Objet {@code Connection} de {@code java.sql}
     * {@code static} car unique et partagé en plusieurs classes.
     */
    private static Connection connect;
    
    /**
     * Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
     * 
     * @return La connexion à utiliser pour l'accès à la base de données
     */
    public static Connection getInstance() {
        if(connect == null){
            try {
                connect = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }        
        return connect;    
    }    
}
