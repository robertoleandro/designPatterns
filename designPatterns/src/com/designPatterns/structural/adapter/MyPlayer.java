package com.designPatterns.structural.adapter;

public class MyPlayer implements Player{
	
	AudioPlayer audioPlayer = new MyAudioPlayer();
	VideoPlayer videoPlayer = new MyVideoPlayer();
	
	public MyPlayer() {
	}

	@Override
	public void play(String type, String fileName) {
		if (type.equalsIgnoreCase("avi")) {
			videoPlayer.playVideo("avi");
		}else if(type.equalsIgnoreCase("mp3")){
			audioPlayer.playAudio("mp3");
		}
	}

}
