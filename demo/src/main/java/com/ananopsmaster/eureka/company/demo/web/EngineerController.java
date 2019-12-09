package com.ananopsmaster.eureka.company.demo.web;

import com.ananopsmaster.eureka.company.demo.model.Engineer;
import com.ananopsmaster.eureka.company.demo.service.EngineerServices;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/company/engineer")
public class EngineerController {
    @Autowired
    private EngineerServices engineerServices;

    //添加工程师信息
    @RequestMapping(value = "/addEngineer",method = RequestMethod.POST)
    private Map<String,Object> addEngineer(@RequestBody Engineer engineer)
            throws IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",engineerServices.addEngineerSelective(engineer));
        return modelMap;
    }

    //修改工程师信息
    @RequestMapping (value = "/modifyEngineer",method = RequestMethod.POST)
    private Map<String,Object> modityEngineer(@RequestBody Engineer engineer)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",engineerServices.modifyEngineerSelective(engineer));
        return modelMap;
    }

    //通过工程师id查询服务商信息
    @RequestMapping (value = "/getEngineerById",method = RequestMethod.GET)
    private Map<String,Object> getEngineerById(long engineerId)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",engineerServices.getEngineerById(engineerId));
        return modelMap;
    }

    //查询所有的工程师信息
    @RequestMapping(value = "getAllEngineer",method = RequestMethod.GET)
    private Map<String,Object> getAllEngineer(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Engineer> listEngineer =new ArrayList<>();
        listEngineer = engineerServices.getEngineerList();
        modelMap.put("companyList",listEngineer);
        return modelMap;
    }

    //删除工程师信息
    @RequestMapping(value = "deleteEngineerById",method = RequestMethod.GET)
    private Map<String, Object> deleteCompanyById(long engineerId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", engineerServices.deleteEngineer(engineerId));
        return modelMap;
    }

}

