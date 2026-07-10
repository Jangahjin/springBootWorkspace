package com.hi.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hi.domain.Board;
import com.hi.dto.BoardDTO;

@Repository
public class BoardRepo {
	
	//jdbc 템플릿
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// insert
	public boolean insert(Board board) throws Exception {
		String query = "INSERT INTO board(boardNo, title, content, writer)" 
                + "VALUES(board_seq.NEXTVAL, ?, ?, ?)";
		//jdbcTemplate
		int count = jdbcTemplate.update(query, board.getTitle(), board.getContent(),board.getWriter());
		return (count == 0)?(false):(true);
	}

	// select
	public Board select(Board board) throws Exception {
		
		String query = "select * from board where boardno = ?";
		List<Board> list = jdbcTemplate.query(query, new RowMapper<Board>() {
			@Override
			public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
				Board board = new Board();
				board.setBoardNo(rs.getInt("BOARDNO"));
				board.setContent(rs.getString("CONTENT"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("Writer"));
				board.setRegDate(rs.getDate("regdate"));
				return board;
			}
			
		}, board.getBoardNo());
		
		return (list.isEmpty() == true)? (null) : (list.get(0));
	}

	public boolean update(Board board) throws Exception {
        String query = "UPDATE board set title= ?,content=?, writer = ? WHERE boardno=?";
        int count= jdbcTemplate.update(query,board.getTitle(),board.getContent(),board.getWriter(),board.getBoardNo());
        return (count <=0)?(false):(true);
    }

	// delete
	public boolean delete(Board board) throws Exception {
        String query ="DELETE  FROM board WHERE boardno=?";
        int count= jdbcTemplate.update(query,board.getBoardNo());
        return (count <=0)?(false):(true);
    }

	// all select
	public List<Board> list() throws Exception {
		String query = "select * from board where boardno > 0 order by regdate desc";
		List<Board> list = jdbcTemplate.query(query, new RowMapper<Board>() {
			@Override
			public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
				Board board = new Board();
				board.setBoardNo(rs.getInt("BOARDNO"));
				board.setContent(rs.getString("CONTENT"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("Writer"));
				board.setRegDate(rs.getDate("regdate"));
				return board;
			}
			
		});

		return list;
	}
}
