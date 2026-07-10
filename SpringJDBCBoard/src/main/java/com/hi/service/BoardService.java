package com.hi.service;

import java.util.List;

import com.hi.dto.BoardDTO;

//상수, 추상메소드
public interface BoardService {
	// insert
    public boolean insert(BoardDTO boardDto) throws Exception; 
    
    // select
    public BoardDTO select(BoardDTO boardDto) throws Exception; 
    
    // update
    public boolean update(BoardDTO boardDto) throws Exception; 
    
    // delete
    public boolean delete(BoardDTO boardDto) throws Exception; 
    
    // all select
    public List<BoardDTO> list() throws Exception;

		
}
