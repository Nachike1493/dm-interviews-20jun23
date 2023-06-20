package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.InvetoryMasterEntity;
@Repository
public interface InvetoryMasterDao extends JpaRepository<InvetoryMasterEntity, Long> {

}
