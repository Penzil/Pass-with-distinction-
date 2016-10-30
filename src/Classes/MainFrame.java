/**
 * auther: Martin Palman
 * version: 1.0
 */
package Classes;

/**
 * Har importerar vi 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Color;
import javax.swing.JFrame;
import jaco.mp3.player.MP3Player;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class MainFrame {
/**
 * Har skapar jag olika konstruktors
 */
	// private JFrame frmMyMusicPlayer;
	private MP3Player mp3Player = null;
	private JLabel lblNewLabel = new JLabel("Music:");
	private PlayerMethods playerMethods = new PlayerMethods();

	/**
	 * Har skapar jag programmet
	 */

	private JFrame frmMyMusicPlayer;
	JButton btnPlay = new JButton("Play");
	JButton btnStop = new JButton("Stop");
	JButton btnPause = new JButton("Pause");
	JButton btnOpen = new JButton("Open");

	ActionListener actionListener = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			buttonPressed(e);
		}
	};

	public MainFrame() {
		initialize();
	}
/**
 * Har har jag koderna(storlek, farg m.m) för min My Music Player ruta
 */
	private void initialize() {
		frmMyMusicPlayer = new JFrame();
		frmMyMusicPlayer.setBackground(new Color(255, 255, 204));
		frmMyMusicPlayer.getContentPane().setBackground(new Color(204, 255, 204));

		frmMyMusicPlayer.setTitle("My Music Player");
		frmMyMusicPlayer.setBounds(100, 100, 290, 275);
		frmMyMusicPlayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyMusicPlayer.getContentPane().setLayout(null);
/**
 * Position och storlek på knappar
 */
		btnPlay.setBounds(12, 104, 97, 25);
		btnStop.setBounds(12, 168, 97, 25);
		btnPause.setBounds(163, 104, 97, 25);
		btnOpen.setBounds(163, 168, 97, 25);
/**
 * Har ser jag till att man inte kan klicka på play, pause eller stop innan man väljer skiva
 */
		btnPlay.setEnabled(false);
		btnStop.setEnabled(false);
		btnPause.setEnabled(false);
/**
 * Placering av textrad och ?
 */
		lblNewLabel.setBounds(12, 13, 248, 16);
		frmMyMusicPlayer.getContentPane().add(lblNewLabel);
		frmMyMusicPlayer.setVisible(true);

		addComponentsToFrame();
		addActionListerners();
	}
/**
 * ?
 */
	public void addComponentsToFrame() {
		frmMyMusicPlayer.getContentPane().add(btnPlay);
		frmMyMusicPlayer.getContentPane().add(btnStop);
		frmMyMusicPlayer.getContentPane().add(btnPause);
		frmMyMusicPlayer.getContentPane().add(btnOpen);
	}
/**
 * Har reagerar knapparna nar man klickar
 */
	public void addActionListerners() {
		btnPlay.addActionListener(actionListener);
		btnStop.addActionListener(actionListener);
		btnPause.addActionListener(actionListener);
		btnOpen.addActionListener(actionListener);
	}
/**
 * Har gor jag flera if satser om vad som hander nar jag klickar pa play och sa vidare
 * 
 */
	public void buttonPressed(ActionEvent arg0) {
		if (arg0.getSource() == btnPlay) {
			playerMethods.myPlay();
		}

		if (arg0.getSource() == btnStop) {
			playerMethods.myStop();
		}
		if (arg0.getSource() == btnPause) {
			playerMethods.myPause();

		}
		if (arg0.getSource() == btnOpen) {

			if (mp3Player != null) {
				playerMethods.myStop();
			}
/**
 * Har har jag open funktionen (ser till att open oppnar sig) 
 */
			JFileChooser fileChooser = new JFileChooser();
			int returnVal = fileChooser.showOpenDialog(btnOpen);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				btnPlay.setEnabled(true);
				btnPause.setEnabled(true);
				btnStop.setEnabled(true);

				File file = fileChooser.getSelectedFile();
				mp3Player = new MP3Player(file);
				playerMethods.setMp3Player(mp3Player);

				lblNewLabel.setText(file.getName().toString());
				frmMyMusicPlayer.setVisible(true);
			}
		}
	}

	{
		;
		{
		}
	}
}
