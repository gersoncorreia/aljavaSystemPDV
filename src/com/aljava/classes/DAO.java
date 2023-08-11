package com.aljava.classes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

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
            System.out.println(e.getMessage());
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

    /*Metodo para atualizar varios Objetos de uma vez só fazendo assim um metodo atomico que faz tudo*/
    public DAO<E> atualizarAlll(E entidade) {
        return this.abrirT().atualizar(entidade).fecharT();
    }

    /*Metodo lista todos os Objetos onde pode ser passado quantidade maxima de resultados e o deslocamento destes resultados.*/
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

    /*Metodo para buscar um Objetos por seu ID*/
    public E obterId(int id) {
        return em.find(classe, id);
    }

    public List<E> buscarPorNome(String nome) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<E> query = cb.createQuery(classe);
        javax.persistence.criteria.Root<E> root = query.from(classe);
        query.select(root).where(cb.like(root.get("nome"), "%" + nome + "%"));
        return em.createQuery(query).getResultList();
    }

    public List<E> buscarPorParams(String params) {
        if (classe == null) {
            throw new UnsupportedOperationException("Classe Nula!");
        }
        return em.createQuery(
                "select p from "+ classe.getName()+ " p where name = :keyword OR barsCode = :keyword", classe)
                .setParameter("keyword",params )
                .getResultList();
    }

    ;
    /*Metodo para deletar um Objetos do banco de dados.*/
    public DAO<E> delete(E entidade) {
        em.remove(entidade);
        return this;
    }

    /*Metodo para fechar a EntityManagerFactory*/
    public void fechar() {
        em.close();
    }
}
