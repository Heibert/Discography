package disquera.disquerahm.models.Album;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

@Repository
public class AlbumDao implements IAlbum {
    @PersistenceContext
    private EntityManager em;
    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Album> findAll(){
        return em.createQuery("from Album").getResultList();
    }
    @Transactional
    @Override
    public void save(Album album) {
        if(album.getIdAlbum() != null && album.getIdAlbum() > 0){
            em.merge(album);
        }else{
            em.persist(album);
        }
    }
    @Override
    @Transactional(readOnly = true)
    public Album findOne(Integer id) {
    return em.find(Album.class, id);
    }
    @Override
    @Transactional
    public void delete(Integer id){
        em.remove(findOne(id));
    }
}