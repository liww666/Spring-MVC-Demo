package com.sunyard.springmvcexceptionhandle.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by lww on 2019/1/15.
 */
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Order")
public class OrderNotFoundException extends RuntimeException {
}
