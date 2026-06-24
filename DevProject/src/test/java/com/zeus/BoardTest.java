package com.zeus;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.zeus.domain.Board;
import java.util.Date; 

@SpringBootTest
public class BoardTest {

	@Test 
	public void test1() {
		Board board1 = new Board(); 
		board1.setBoardNo(10);
		board1.setTitle("kdj");
        
		Board board = Board.builder().boardNo(1)
				.content("kdj").writer("kdj")
				.COUNT(10).regDate(new Date()).title("kdj").build();
                
		System.out.printf("%d %s \n", board.getBoardNo(), board.getTitle());
	}
}
//@Test
//	public void test2() {
//		Board board = new Board();
//		board.setBoardNo(10);
//		board.setTitle("kdj");
//		System.out.printf("%s \n", board);
//	}
//}
