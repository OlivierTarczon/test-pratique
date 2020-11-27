package com.connexence.testPratique;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChattonRepository extends CrudRepository<Chatton, Long>
{
	public List<Chatton> findAll();
}
