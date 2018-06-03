package com.codehub.acme.eshop.controller;


import com.codehub.acme.eshop.exception.*;
import com.codehub.acme.eshop.transformation.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * This controller is used to handle the exceptions for all controllers
 */
@ControllerAdvice(basePackageClasses = {CategoryController.class, UserController.class, ShoppingBasketController.class, ProductController.class, PurchaseController.class, OrderController.class})
public class AdviceController {

    /**
     * This method handles the {@link ShoppingBasketException}
     *
     * @param ex {@link ShoppingBasketException}
     * @param request the {@link HttpServletRequest}
     * @return the {@link ErrorMessage}
     */
    @ExceptionHandler({ShoppingBasketException.class})
    public ResponseEntity<ErrorMessage> handleErrors(ShoppingBasketException ex, HttpServletRequest request) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ErrorMessage(ex.getMessage()));
    }

    /**
     * This method handles the {@link NotFoundException}
     *
     * @param ex {@link NotFoundException}
     * @param request the {@link HttpServletRequest}
     * @return the {@link ErrorMessage}
     */
    @ExceptionHandler({NotFoundException.class})
    public ResponseEntity<ErrorMessage> handleErrors(NotFoundException ex, HttpServletRequest request) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ErrorMessage(ex.getMessage()));
    }

    /**
     * This method handles the {@link TokenInvalidException}
     *
     * @param ex {@link TokenInvalidException}
     * @param request the {@link HttpServletRequest}
     * @return the {@link ErrorMessage}
     */
    @ExceptionHandler({TokenInvalidException.class})
    public ResponseEntity<ErrorMessage> handleErrors(TokenInvalidException ex, HttpServletRequest request) {
        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(new ErrorMessage(ex.getMessage()));
    }



    /**
     * This method handles the {@link PasswordInvalidException}
     *
     * @param ex {@link PasswordInvalidException}
     * @param request the {@link HttpServletRequest}
     * @return the {@link ErrorMessage}
     */
    @ExceptionHandler({PasswordInvalidException.class})
    public ResponseEntity<ErrorMessage> handleInvalidErrors(PasswordInvalidException ex, HttpServletRequest request) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ErrorMessage(ex.getMessage()));
    }

    /**
     * This method handles the {@link UsernameInvalidException}
     *
     * @param ex {@link UsernameInvalidException}
     * @param request the {@link HttpServletRequest}
     * @return the {@link ErrorMessage}
     */
    @ExceptionHandler({UsernameInvalidException.class})
    public ResponseEntity<ErrorMessage> handleInvalidErrors(UsernameInvalidException ex, HttpServletRequest request) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ErrorMessage(ex.getMessage()));
    }


    /**
     * This method handles the {@link ProductOutOfStockException}
     *
     * @param ex {@link ProductOutOfStockException}
     * @param request the {@link HttpServletRequest}
     * @return the {@link ErrorMessage}
     */
    @ExceptionHandler({ProductOutOfStockException.class})
    public ResponseEntity<ErrorMessage> handleInvalidErrors(ProductOutOfStockException ex, HttpServletRequest request) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ErrorMessage(ex.getMessage()));
    }
}
