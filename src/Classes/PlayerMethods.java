/**
 * auther: Martin Palman
 * version: 1.0
 */
package Classes;
/**
 * Har importerar vi 
 */
import Interface.PlayerInterface;
import jaco.mp3.player.MP3Player;



public class PlayerMethods implements PlayerInterface{
	private MP3Player mp3Player;
	public PlayerMethods() {
		
	
	}
/**
 * 
 * Getters och Setters
 */
	public MP3Player getMp3Player() {
		return mp3Player;
	}

	public void setMp3Player(MP3Player mp3Player) {
		this.mp3Player = mp3Player;
	}

	
/**
 * Har gor jag sa att play far funktionen play och sa vidare 
 */
	public void myPlay() {
		mp3Player.play();
		
	}
	public void myPause(){
		mp3Player.pause();
		
	}
	public void myStop(){
		mp3Player.stop();
	
	}
	public void myOpen(){	
		mp3Player.stop();
		mp3Player.play();
		
		
			
		}
	}


	

