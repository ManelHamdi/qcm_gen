package com.example.qcm_gen.DAOClasses;

import com.example.qcm_gen.DAOInterfaces.IModulesDAO;
import com.example.qcm_gen.Entities.Modules;
import org.springframework.stereotype.Repository;

@Repository
public class ModulesDAO extends GenericDAO<Modules, Integer> implements IModulesDAO {
}
