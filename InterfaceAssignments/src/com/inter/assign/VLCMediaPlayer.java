package com.inter.assign;

public class VLCMediaPlayer implements MediaPlayer {

	@Override
	public void playMusic() {
		System.out.println("Playing VLC music");

	}

	@Override
	public void downloadMusic() {
		System.out.println("Saved in mkv format");

	}

}
