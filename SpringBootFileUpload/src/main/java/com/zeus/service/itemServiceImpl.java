package com.zeus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zeus.domain.Item;
import com.zeus.mapper.ItemMapper;
@Service
public class itemServiceImpl implements itemService {
	
	@Autowired 
	private ItemMapper mapper; 

	@Override
	@Transactional
	public Boolean regist(Item item) throws Exception {
		return mapper.insert(item) == 0 ? false : true;
	}

	@Override
	@Transactional(readOnly = true)
	public Item select(Item item) throws Exception {
		return mapper.select(item);
	}

	@Override
	@Transactional
	public Boolean update(Item item) throws Exception {
		return mapper.update(item) == 0? false : true;
	}

	@Override
	@Transactional
	public Boolean delete(Item item) throws Exception {
		return mapper.delete(item) == 0? false : true;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Item> list() throws Exception {
		return mapper.list();
	}

	  @Override
	    @Transactional(readOnly = true)
	    public String getPicture(Item item) throws Exception {
	        return mapper.getPicture(item);
		}

	  @Override
	  @Transactional
	  public boolean insert(Item item) throws Exception{
		  return mapper.insert(item) == 0? false : true;
	  }

}
