package service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.InvetoryMasterDao;
import entity.InvetoryMasterEntity;

@Service
public class InvetoryMasterServicesImpl implements InvetoryMasterServices {

	@Autowired
	private InvetoryMasterDao invetoryMasterDao;

	@Override
	public InvetoryMasterEntity saveDepartment(InvetoryMasterEntity invetoryMasterEntity) {

		return invetoryMasterDao.save(invetoryMasterEntity);
	}

	@Override
	public List<InvetoryMasterEntity> fetchInventoryList() {

		return (List<InvetoryMasterEntity>) invetoryMasterDao.findAll();
	}

	@Override
	public InvetoryMasterEntity updateInventory(InvetoryMasterEntity invetoryMasterEntity,
			Long invetoryMasterEntitytId) {

		InvetoryMasterEntity inventEntity = invetoryMasterDao.findById(invetoryMasterEntitytId).get();

		if (Objects.nonNull(invetoryMasterEntity.getProductName())
				&& !"".equalsIgnoreCase(invetoryMasterEntity.getProductName())) {
			inventEntity.setProductName(invetoryMasterEntity.getProductName());
		}

		if (Objects.nonNull(invetoryMasterEntity.getProductDescription())
				&& !"".equalsIgnoreCase(invetoryMasterEntity.getProductDescription())) {
			inventEntity.setProductDescription(invetoryMasterEntity.getProductDescription());
		}

		if (Objects.nonNull(invetoryMasterEntity.getPricePerUnit())
				&& !"".equalsIgnoreCase(invetoryMasterEntity.getPricePerUnit())) {
			inventEntity.setPricePerUnit(invetoryMasterEntity.getPricePerUnit());
		}

		return invetoryMasterDao.save(inventEntity);
	}

	@Override
	public void deleteInventoryById(Long invetoryMasterEntitytId) {

		invetoryMasterDao.deleteById(invetoryMasterEntitytId);
	}

}
