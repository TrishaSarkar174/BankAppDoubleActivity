package com.hfad.bankappdoubleactivity;

import java.util.ArrayList;
import java.util.List;

public class Account {
    List<String> getAccounts(String string){
        List<String> acc= new ArrayList<>();
        if(string.equals("Current Account")){
            acc.add("Trisha Sarkar");
            acc.add("Suvro Roy");
        }
        else if(string.equals("Savings Account")){
            acc.add("Arjun Sarkar");
            acc.add("Malati Bala Debi");
        }
        else if(string.equals("Fix Deposit Account")){
            acc.add("Shukla Sarkar");
            acc.add("Sangita Sarkar");
        }
        else{
            acc.add("Rai Sen");
            acc.add("Aditto Sen");
        }
        return acc;
    }
}
