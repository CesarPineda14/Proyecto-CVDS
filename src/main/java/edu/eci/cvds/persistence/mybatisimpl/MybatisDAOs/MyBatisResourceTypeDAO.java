package edu.eci.cvds.persistence.mybatisimpl.MybatisDAOs;

import com.google.inject.Inject;
import edu.eci.cvds.entities.ResourceType;
import edu.eci.cvds.persistence.ExceptionReport.ReportFile;
import edu.eci.cvds.persistence.mybatisimpl.DAOs.ResourceTypeDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ResourceTypeMapper;

import java.util.List;

public class MyBatisResourceTypeDAO implements ResourceTypeDAO {

    @Inject
    private ResourceTypeMapper resourceTypeMapper;


    @Override
    public List<ResourceType> getResourceType() {
        try{
            return resourceTypeMapper.getResourceTypeList();
        } catch (Exception e){
            ReportFile.loadReport(e.getMessage());
            return null;
        }
    }
}
