/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.ejb.Local;
import javax.ejb.Startup;

/**
 *
 * @author benjaminseiller
 */
@javax.ejb.Singleton
@Startup
@javax.ejb.LocalBean
@Local(value = IAEjb.class)
@javax.enterprise.context.ApplicationScoped
public class AEjb implements IAEjb {
    
}
