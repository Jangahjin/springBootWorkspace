package com.hi.service;

import java.util.List;

import com.hi.domain.Board;
import com.hi.dto.BoardDTO;

public interface BoardService {
	public boolean insert(BoardDTO boardDto) throws Exception; 
	public BoardDTO select(BoardDTO boardDto) throws Exception; 
	public boolean update(BoardDTO boardDto) throws Exception; 
	public boolean delete(BoardDTO boardDto) throws Exception; 
	public List<BoardDTO> list() throws Exception;
}