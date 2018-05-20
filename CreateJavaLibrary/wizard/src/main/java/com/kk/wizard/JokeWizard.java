package com.kk.wizard;

import com.kk.joke.JokeSmith;

public class JokeWizard {

    public String getJoke() {
        return new JokeSmith().getJoke();
    }

}
