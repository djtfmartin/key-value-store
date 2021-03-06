package org.gbif.rest.client.retrofit;

/**
 * Exception thrown in cases of un-handled error cases.
 */
public class RestClientException extends RuntimeException {

  public RestClientException() {
    //DO NOTHING
  }

  public RestClientException(String message) {
    super(message);
  }

  public RestClientException(String message, Throwable cause) {
    super(message, cause);
  }

  public RestClientException(Throwable cause) {
    super(cause);
  }

  public RestClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
