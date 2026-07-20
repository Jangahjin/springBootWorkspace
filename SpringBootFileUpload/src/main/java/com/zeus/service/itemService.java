package com.zeus.service;

import java.util.List;
import com.zeus.domain.Item;

public interface itemService {
	public Boolean regist(Item item) throws Exception; 
	public Item select(Item item) throws Exception; 
	public Boolean update(Item item) throws Exception; 
	public Boolean delete(Item item) throws Exception; 
	public List<Item> list() throws Exception; 
	public String getPicture(Item item) throws Exception;
	public boolean insert(Item item) throws Exception;

}
