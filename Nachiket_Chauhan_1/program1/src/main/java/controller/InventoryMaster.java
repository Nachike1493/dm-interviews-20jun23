package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.InvetoryMasterEntity;
import service.InvetoryMasterServices;

@RestController
public class InventoryMaster {
	
	@Autowired
	InvetoryMasterServices invenInvetoryMasterServices;

	 @PostMapping("/inventorys")
	    public InvetoryMasterEntity saveInventory(
	        @Validated @RequestBody InvetoryMasterEntity invetoryMasterEntity)
	    {
	        return invenInvetoryMasterServices.saveDepartment(invetoryMasterEntity);
	    }
	 
	    @GetMapping("/inventory")
	    public List<InvetoryMasterEntity> fetchInventoryList()
	    {
	        return invenInvetoryMasterServices.fetchInventoryList();
	    }
	 
	 
	    @PutMapping("/inventory/{id}")
	    public InvetoryMasterEntity
	    updateInventory(@RequestBody InvetoryMasterEntity invetoryMasterEntity,
	                     @PathVariable("id") Long invetoryMasterEntitytId)
	    {
	        return invenInvetoryMasterServices.updateInventory(
	        		invetoryMasterEntity, invetoryMasterEntitytId);
	    }
	 
	  
	    @DeleteMapping("/inventory/{id}")
	    public String deleteInventoryById(@PathVariable("id")
	                                       Long invetoryMasterEntitytId)
	    {
	    	invenInvetoryMasterServices.deleteInventoryById(
	    			invetoryMasterEntitytId);
	        return "Deleted Successfully";
	    }

}
