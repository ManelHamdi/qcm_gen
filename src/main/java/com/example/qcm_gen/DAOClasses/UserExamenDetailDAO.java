package com.example.qcm_gen.DAOClasses;

import com.example.qcm_gen.DAOInterfaces.IUserExamenDetailDAO;
import com.example.qcm_gen.Entities.UserExamenDetail;
import org.springframework.stereotype.Repository;

@Repository
public class UserExamenDetailDAO extends GenericDAO<UserExamenDetail, Integer> implements IUserExamenDetailDAO {
}
