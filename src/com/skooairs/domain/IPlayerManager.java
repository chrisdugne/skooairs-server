package com.skooairs.domain;

import java.util.List;

import com.skooairs.entities.Board;
import com.skooairs.entities.Player;

public interface IPlayerManager {

	public boolean existFacebookPlayer(String facebookUID);
	public boolean createPlayer(int type, String playerUID);
	
	public Player getPlayer(String playerUID);
	public Player getFacebookPlayer(String facebookUID);
	public List<String> getFriendPlayerUIDs(List<String> facebookIds);

	public boolean changeLanguage(String playerUID, int language);
	public boolean changeMusicOn(String playerUID, boolean musicOn);
	
	public void refreshLastLog(String playerUID);
	
	public void setTransactionMillis(String playerUID, Long dateMillis);
	
	public int getRecord(String playerUID, int time, int colors);
	public void storeRecord(String playerUID, String surname, int time, int colors, int points);
	public List<Board> getBoard(String playerUID, int time, int colors, List<String> friendUIDs);
	

}