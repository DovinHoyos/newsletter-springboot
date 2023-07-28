package com.example.newsletter.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmailRepository {

    @PersistenceContext
    private EntityManager baseDeDatos;

    @Transactional
    public void guardarEmail(String emailUsuario){
        String consultaSql = "INSERT INTO Lead (email) " +
                "VALUES (:paramEmail)";
        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail", emailUsuario)
                .executeUpdate();
    }

   @Transactional
    public void eliminarEmail(String emailUsuario) {
        String consultaSql = "DELETE FROM Lead WHERE email = :paramEmail";
        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail", emailUsuario)
                .executeUpdate();
    }
}
