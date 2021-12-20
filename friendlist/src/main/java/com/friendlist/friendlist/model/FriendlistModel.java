package com.friendlist.friendlist.model;

import java.util.*;

import com.friendlist.friendlist.repository.FriendlistRepository;

import org.springframework.beans.factory.annotation.Autowired;

import com.friendlist.friendlist.model.*;

public class FriendlistModel {

    @Autowired
    FriendlistRepository friendlistRepository;
    
    public void addNewFriend() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter friend First name");
        String firstname = sc.nextLine();

        System.out.println("Enter friend Last name");
        String lastname = sc.nextLine();

        friendlistRepository.insertNewFriendToDatabase(firstname,lastname);
    }

    public void getFriend() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter friend ID");
        int id = sc.nextInt();
        Friend friendname = friendlistRepository.getFriendFromDatabase(id);
        System.out.println(friendname.getFirstname());
        System.out.println(friendname.getLastname());

    }
}
