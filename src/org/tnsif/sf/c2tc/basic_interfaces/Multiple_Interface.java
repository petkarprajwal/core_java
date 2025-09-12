package org.tnsif.sf.c2tc.basic_interfaces;

//multiple interface

interface Camera{
	void takePhoto();
}
interface MusicPlayer{
	void playMusic();
}
class SmartPhone implements Camera, MusicPlayer{

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Taking a photo with smartphone camera");
		
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("Playing music  with smartphone ");
		
	}
	
}
public class Multiple_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myphone=new SmartPhone();
		myphone.playMusic();
		myphone.takePhoto();

	}

}
