package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.AssetType;

@Repository
public interface IAssetTypeRepo extends JpaRepositoryImplementation<AssetType, Integer> {

}
