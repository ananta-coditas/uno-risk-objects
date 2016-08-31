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
public enum AffectedType {
    NONE(0), ONE(1), MULTIPLE(2);
    public int value = 0;

    AffectedType(int code) {
        value = code;
    }
    public boolean isAffected() {
        return value != 0;
    }
    public static AffectedType toAffectedType(Integer code) {
        for (AffectedType type : values()) {
            if (type.value == code) {
                return type;
            }
        }
        return AffectedType.NONE;
    }
    
}
