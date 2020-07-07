/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans;

/**
 *
 * @author jason
 */
public enum TestResult { NONE(0),POSITIVE(1),NEGATIVE(2);
public int value;
TestResult(int code){
value = code;
}
    
}
