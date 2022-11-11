package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Contact;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository contactRepository;
	
	public List<String> getAllContact()
	{
		List<Contact> contacts = contactRepository.findAll();
		List<String> contactList = new ArrayList<>();
		
		for (Contact contact : contacts) {
			contactList.add(contact.getName());
		}
		
		return contactList;
	}
	
	public List<Contact> getContacts()
	{
		return this.contactRepository.findAll();
	}
	
	public Contact saveContact(Contact contact)
	{
		Contact saveContact = contactRepository.save(contact);
		return saveContact;
	}
	
	public Page<Contact> findAll(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending()
				: Sort.by(sortField).descending();

		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		Page<Contact> pageContact = contactRepository.findAll(pageable);
		return pageContact;
	}
}
