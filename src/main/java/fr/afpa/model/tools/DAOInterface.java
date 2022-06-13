package fr.afpa.model.tools;

import java.util.ArrayList;

/**
 * Interface à implémenter pour tout DAO (Data Access Object).
 * Chaque méthode correspond à un type de requête (SELECT, INSERT, UPDATE)
 */
public interface DAOInterface<T> {
    
    /**
     * Permet de récupérer un objet via son identifiant
     * @param id
     * @return l'objet retrouvé en base de données
     */
    public abstract T find(long id);

    /**
     * Permet de récupérer une liste de tous les objets {@code T}
     * @return Liste dynamique d'objets crées à partir des enregistrements de base de données
     */
    public abstract ArrayList<T> list();
    
    /**
     * Permet de créer une entrée dans la base de données à partir d'un objet
     * @param obj L'objet représentant l'enregistrement à créer
     */
    public abstract T create(T obj);
    
    /**
     * Permet de mettre à jour les données d'une entrée dans la base 
     * @param obj L'objet permettant de mettre à jour la base
     */
    public abstract T update(T obj);
    
    /**
     * Permet la suppression d'une entrée de la base
     * @param obj L'objet représentant l'enregistrement à supprimer
     */
    public abstract void delete(T obj);
}
