package com.vehiclelicense.vehiclelicense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicense.vehiclelicense.entity.Documents;
import com.vehiclelicense.vehiclelicense.repo.DocumentsRepository;

@Service
public class DocumentsService {
	@Autowired
	DocumentsRepository documentsRepository;

	public Documents createDocuments(Documents documents) {
		// TODO Auto-generated method stub
		return documentsRepository.save(documents);
	}

	public List<Documents> getDocuments() {
		// TODO Auto-generated method stub
		return documentsRepository.findAll();
	}

	public boolean deleteAllDocuments() {
		try {
			documentsRepository.deleteAll();
		}catch(Exception e)
		{
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public Documents updateDocuments(int documentsId, Documents obj) {
		Optional<Documents> addContainer=documentsRepository.findById(documentsId);
		if(addContainer.isPresent()) 
		{
			Documents oldObj=addContainer.get();
			oldObj.setPhoto(obj.getPhoto());
			oldObj.setIdProof(obj.getIdProof());
			System.out.println("Successfully updated");
			return documentsRepository.saveAndFlush(oldObj);
		}
		// TODO Auto-generated method stub
		System.out.println("No Object found with these Id");
		// TODO Auto-generated method stub
		return obj;
	}

}
