package com.example.qcm_gen.DAOClasses;

import com.example.qcm_gen.DAOInterfaces.IUserExamenDetailPKDAO;
import com.example.qcm_gen.Entities.UserExamenDetailPK;
import org.springframework.stereotype.Repository;

@Repository
public class UserExamenDetailPKDAO extends GenericDAO<UserExamenDetailPK, Integer> implements IUserExamenDetailPKDAO {
}
