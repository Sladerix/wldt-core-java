package it.wldt.exception;

/**
 * Author:
 *      Marco Picone, Ph.D. (picone.m@gmail.com)
 * Date: 01/03/2023
 *
 * Project: White Label Digital Twin Java Framework - (whitelabel-digitaltwin)
 */
public class WldtEngineException extends Exception {
    public WldtEngineException(String errorMsg) {
        super(errorMsg);
    }
}
