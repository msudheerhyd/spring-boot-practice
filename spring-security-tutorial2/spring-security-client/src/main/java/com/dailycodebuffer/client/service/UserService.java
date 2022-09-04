package com.dailycodebuffer.client.service;

import com.dailycodebuffer.client.entity.User;
import com.dailycodebuffer.client.entity.VerificationToken;
import com.dailycodebuffer.client.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);

    String validateVerification(String token);

    VerificationToken generateNewVerificationToken(String oldToken);

    User findUserByEmail(String email);

    void createPasswordResetTokenForUser(User user, String token);
}
