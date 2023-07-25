package com.aljava.classes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author GERSON
 */
public class DAO<E> {

    /*Declarando variavel emf do tipo EntityManagerFactory */
    private static EntityManagerFactory emf;

    /*Declarando variavel em do tipo EntityManager*/
    private EntityManager em;

    /*Declaração de classe generica*/
    private Class<E> classe;

    /*Inicialização da EntityManagerFactory onde e passado persistence-unit do arquivo persistence,xml*/
    static {
        try {
            emf = Persistence.createEntityManagerFactory("agendAqui");
        } catch (Exception e) {
            System.out.println(e.initCause(e));
        }
    }

    /*Metodo construtor padrão*/
    public DAO() {
        this(null);
    }

    /*Metodo construtor de classe*/
    public DAO(Class<E> classe) {
        this.classe = classe;
        em = emf.createEntityManager();
    }

    /*Metodo para abrir a transição*/
    public DAO<E> abrirT() {
        em.getTransaction().begin();
        return this;
    }

    /*Metodo para fechar a transição*/
    public DAO<E> fecharT() {
        em.getTransaction().commit();
        return this;
    }

    /*Metodo para incluir os dados*/
    public DAO<E> incluir(E entidade) {
        em.persist(entidade);
        return this;
    }

    /*Metodo para incluir dados utilizando todos os metodos já criando, fazendo assim um metodo atomico que faz tudo*/
    public DAO<E> incluirAll(E entidade) {
        return this.abrirT().incluir(entidade).fecharT();
    }

    /*Metodo para atualiza dados utilizando todos os metodos já criando, fazendo assim um metodo atomico que faz tudo*/
    public DAO<E> atualizar(E entidade) {
        em.detach(entidade);
        em.merge(entidade);
        return this;
    }

    /*Metodo para atualizar todos dados utilizando todos os metodos já criando, fazendo assim um metodo atomico que faz tudo*/
    public DAO<E> atualizarAlll(E entidade) {
        return this.abrirT().atualizar(entidade).fecharT();
    }

    /*Metodo lista todos os cliente onde pode ser passado quantidade maxima de resultados e o deslocamento destes resultados.*/
    public List<E> obterTodos(int qte, int deslocamento) {
        if (classe == null) {
            throw new UnsupportedOperationException("Classe Nula!");
        }

        String jpql = "select e from " + classe.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(qte);
        query.setFirstResult(deslocamento);
        return query.getResultList();
    }

    /*Metodo para atualiza dados utilizando todos os metodos já criando, fazendo assim um metodo atomico que faz tudo*/
    public E obterId(int id) {
//        long l =  Long.parseLong(id);
        return em.find(classe, id);
    }
    /*Metodo para atualiza dados utilizando todos os metodos já criando, fazendo assim um metodo atomico que faz tudo*/
    public DAO<E> delete(E entidade) {
        em.remove(entidade);
        return this;
    }

    /*Metodo para fechar a EntityManagerFactory*/
    public void fechar() {
        em.close();
    }
}
