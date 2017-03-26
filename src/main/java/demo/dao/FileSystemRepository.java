package demo.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import org.springframework.transaction.annotation.Transactional;

import demo.model.Document;

import org.springframework.stereotype.Repository;

@Repository
public class FileSystemRepository {
	
	private EntityManager entityManager;
	/*@Transactional
	public Document findFileByID(Long id){
		
		try{
			Query qry= null;
			
			qry = entityManager.createQuery("select doc from Document doc where doc.id= :id. Document.class");
			qry.setParameter("id", id);
			List<Document> results=qry.getResultList();
			if(results.size()>0){
			return results.get(0);
		     }else
		    	 return null; 
		}catch(PersistenceException e){
			//log.error(e.Message));
		}
		
	}*/

	@Transactional
	public void saveFile(Document doc){
		if(doc.getId() != null){
			//entityManager.persist(doc);=>save record to DB
			
		}else{
			//entityManager.merge(doc); => update record
			
		}
		
		
	}
}
