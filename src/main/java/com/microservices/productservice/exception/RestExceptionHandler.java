/*
package com.microservices.productservice.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler {

  @ExceptionHandler()
  public String handleNotFound(String msg) {
    return msg;
  }

  */
/*@Override
  protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
      String error = "Malformed JSON request";
      return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST, error, ex));
  }

  private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
      return new ResponseEntity<>(apiError, apiError.getStatus());
  }

  //other exception handlers below*//*


}
*/
