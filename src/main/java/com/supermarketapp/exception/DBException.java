package com.supermarketapp.exception;

public class DBException {
	public class DBException extends Exception {
		
		private static final long serialVersionUID = 1L;

		public void DBException(String message, Throwable t) {
			super (message,t);
		}

}
}
