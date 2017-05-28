/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jrpmaia
 */
public class JPAUtil {

    public static EntityManagerFactory EMF
            = Persistence.createEntityManagerFactory("com_rjsoft_Cabure");
}
