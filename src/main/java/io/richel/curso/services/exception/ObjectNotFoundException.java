package io.richel.curso.services.exception;

public class ObjectNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 381526185987117146L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
