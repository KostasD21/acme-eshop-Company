package com.codehub.acme.eshop.transformation;

/**
 * This class is used to render the exception
 */
public class ErrorMessage {

    /**
     * the message of the error
     */
    private String msg;

    /**
     * the constructor of the msg
     *
     * @param msg the message
     */
    public ErrorMessage(String msg) {
        this.msg = msg;
    }

    /**
     * this method gets the message
     *
     * @return the message
     */
    public String getMsg() {
        return msg;
    }

    /**
     * this method sets the message
     *
     * @param msg the message
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
