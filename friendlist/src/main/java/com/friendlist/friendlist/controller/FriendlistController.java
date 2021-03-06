package com.friendlist.friendlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.friendlist.friendlist.model.*;

import java.util.*;

@Controller
public class FriendlistController implements CommandLineRunner {
    
    @Autowired
    FriendlistModel friendlistModelObj;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welcome to SpringBoot\n\n\n\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("----MENU-----");
        System.out.println("1. Add new Friend");
        System.out.println("2. Get friend from List by ID");

        boolean menu = true;

        while (menu) {
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Adding new friend");
                    friendlistModelObj.addNewFriend();
                    break;
                case 2:
                    System.out.println("Getting friend name");
                    friendlistModelObj.getFriend();
                    break;
                case 4:
                    menu = false;
                default:
                    break;
            }            
        }
        System.exit(0);
    }
}
