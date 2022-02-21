package com.amazon.ata.music.playlist.service.exceptions;

public class InvalidAttributeChangeException extends InvalidAttributeException {

    public static final long serialVersionUID = 3742166363677176516L;

    public InvalidAttributeChangeException() {
        super();
    }

    public InvalidAttributeChangeException(String message) {
        super(message);
    }

    public InvalidAttributeChangeException(Throwable cause) {
        super(cause);
    }

    public InvalidAttributeChangeException(String message, Throwable cause) {
        super(message, cause);
    }
}
