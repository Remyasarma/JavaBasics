package com.inter.assign;

public class PlayerInter {

	public static void main(String[] args) {
		MediaPlayer mediaplayer = new VLCMediaPlayer();
		mediaplayer.playMusic();
		mediaplayer.downloadMusic();
		mediaplayer = new WindowsMediaPlayer11();
		mediaplayer.playMusic();
		mediaplayer.downloadMusic();

	}

}
