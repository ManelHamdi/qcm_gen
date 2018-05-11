package com.example.qcm_gen.DAOClasses;

import com.example.qcm_gen.DAOInterfaces.IUsersExamenPKDAO;
import com.example.qcm_gen.Entities.UsersExamenPK;
import org.springframework.stereotype.Repository;

@Repository
public class UsersExamenPKDAO extends GenericDAO<UsersExamenPK, Integer> implements IUsersExamenPKDAO {
}
