package Prog_Tarea08;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José Luis
 */
 class Emails implements Comparable<Emails>{
        public String email;
  
        @Override
        public int compareTo(Emails e){
            return email.compareTo(e.email);
        }
    }
