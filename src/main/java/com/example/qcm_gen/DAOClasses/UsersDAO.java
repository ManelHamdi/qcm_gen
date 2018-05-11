package com.example.qcm_gen.DAOClasses;

import com.example.qcm_gen.DAOInterfaces.IUsersDAO;
import com.example.qcm_gen.Entities.Users;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDAO extends GenericDAO<Users, Integer> implements IUsersDAO {
}
