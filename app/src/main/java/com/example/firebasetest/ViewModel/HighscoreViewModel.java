package com.example.firebasetest.ViewModel;

import android.os.Handler;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.firebasetest.Model.Player;
import com.example.firebasetest.Repository.PlayerRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.LogRecord;

public class HighscoreViewModel extends ViewModel {

    private MutableLiveData<List<Player>> topPlayers = new MutableLiveData<List<Player>>();
    private PlayerRepository repo = new PlayerRepository();
    MutableLiveData liveData = repo.getLiveData();

    public MutableLiveData<List<Player>> getTopPlayersLiveData() {
        return liveData;
    }

}
