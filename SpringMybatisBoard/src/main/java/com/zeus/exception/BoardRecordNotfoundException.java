package com.zeus.exception;
//사용자가 정의하는 예외처리방식
public class BoardRecordNotfoundException extends Exception {

	//생성자
	public BoardRecordNotfoundException(String message) {
		super(message);
	}

	
}
