package disquera.disquerahm.models.Disquera;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

@Repository
public class DisqueraDao implements IDisquera {
    @PersistenceContext
    private EntityManager em;
    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Disquera> findAll(){
        return em.createQuery("from Disquera").getResultList();
    }
    @Transactional
    @Override
    public void save(Disquera disquera) {
        if(disquera.getIdDisquera() != null && disquera.getIdDisquera() > 0){
            em.merge(disquera);
        }else{
            em.persist(disquera);
        }
    }
    @Override
    @Transactional(readOnly = true)
    public Disquera findOne(Integer id) {
    return em.find(Disquera.class, id);
    }
    @Override
    @Transactional
    public void delete(Integer id){
        em.remove(findOne(id));
    }
}