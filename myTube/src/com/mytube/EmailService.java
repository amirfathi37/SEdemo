package com.mytube;

public class EmailService implements IEmailService {
    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }

    @Override
    public void sendEmail(String userName) {
        System.out.println("Notifying " + userName + "...");
        System.out.println("Done!\n");
    }
}
