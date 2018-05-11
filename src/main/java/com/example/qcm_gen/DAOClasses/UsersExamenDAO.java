package com.example.qcm_gen.DAOClasses;

import com.example.qcm_gen.DAOInterfaces.IUsersExamenDAO;
import com.example.qcm_gen.Entities.UsersExamen;
import org.springframework.stereotype.Repository;

@Repository
public class UsersExamenDAO extends GenericDAO<UsersExamen, Integer> implements IUsersExamenDAO {
}
