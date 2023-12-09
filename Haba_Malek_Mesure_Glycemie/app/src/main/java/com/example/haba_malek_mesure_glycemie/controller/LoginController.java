package com.example.haba_malek_mesure_glycemie.controller;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.haba_malek_mesure_glycemie.model.User;

public class LoginController {

    private User user;

    public void createUser(String username, String password, Context context) {
        this.user = new User(username, password);
        SharedPreferences preferences = context.getSharedPreferences("pref", context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("name", username);
        editor.putString("mdp", password);
        editor.apply();
    }
    public void recapUser(Context contexy) {
        





    }
}







}
