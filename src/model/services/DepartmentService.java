package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
			
	public List<Department> findAll() {
		return dao.findAll();
		
	}
	
	public void saveOrUpdate(Department obj) {
		if (obj.getId() == null) { //Inserindo no banco. O campo ID � auto incrementavel
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	public void remove(Department obj) {
		dao.deleteById(obj.getId());
	}
	
}
