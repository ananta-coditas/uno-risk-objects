/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.tcuzick;

/**
 *
 * @author jason
 */
 public enum BIRADS { A(1),B(2), C(3), D(4);
        public double value;
        BIRADS(int code) {
            value = code;
        }
    };
