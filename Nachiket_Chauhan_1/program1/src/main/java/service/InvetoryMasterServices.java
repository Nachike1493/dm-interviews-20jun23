package service;

import java.util.List;

import entity.InvetoryMasterEntity;

public interface
InvetoryMasterServices {
	InvetoryMasterEntity saveDepartment(InvetoryMasterEntity invetoryMasterEntity);

	List<InvetoryMasterEntity> fetchInventoryList();

	InvetoryMasterEntity updateInventory(InvetoryMasterEntity invetoryMasterEntity, Long invetoryMasterEntitytId);

	void deleteInventoryById(Long invetoryMasterEntitytId);

}
