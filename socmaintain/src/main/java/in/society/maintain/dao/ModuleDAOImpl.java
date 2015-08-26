package in.society.maintain.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.society.maintain.model.Module;
import in.society.maintain.model.User;

@Repository
public class ModuleDAOImpl implements ModuleDAO {
	private static final Logger LOGGER = LoggerFactory.getLogger(ModuleDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;



	@SuppressWarnings("unchecked")
	@Override
	public List<Module> getAllTopModules() {
		LOGGER.debug("Getting all the user");
		return this.sessionFactory.getCurrentSession().createQuery("from Module").list();
	}


}
