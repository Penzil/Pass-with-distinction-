import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Color;
import javax.swing.JFrame;
import jaco.mp3.player.MP3Player;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class MainFrame {

	private JFrame frmMyMusicPlayer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmMyMusicPlayer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyMusicPlayer = new JFrame();
		frmMyMusicPlayer.setBackground(new Color(255, 255, 204));
		frmMyMusicPlayer.getContentPane().setBackground(new Color(204, 255, 204));
		frmMyMusicPlayer.setTitle("My Music Player");
		frmMyMusicPlayer.setBounds(100, 100, 290, 275);
		frmMyMusicPlayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnPlay = new JButton("");
		btnPlay.setBackground(Color.WHITE);
		btnPlay.setIcon(new ImageIcon("C:\\Users\\Martin\\Desktop\\Nackademin\\icons\\playp.jpg"));
		btnPlay.setBounds(12, 104, 97, 25);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MP3Player(new File("C:\\Users\\Martin\\Desktop\\Nackademin\\Crazy Frog - Axel F.mp3")).play();
				
			}
		});
		frmMyMusicPlayer.getContentPane().setLayout(null);
		frmMyMusicPlayer.getContentPane().add(btnPlay);
		
		JButton btnStop = new JButton("");
		btnStop.setBackground(Color.WHITE);
		btnStop.setIcon(new ImageIcon("C:\\Users\\Martin\\Desktop\\Nackademin\\icons\\stopp.jpg"));
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MP3Player(new File("C:\\Users\\Martin\\Desktop\\Nackademin\\Crazy Frog - Axel F.mp3")).stop();
			}
		});
		btnStop.setBounds(12, 168, 97, 25);
		frmMyMusicPlayer.getContentPane().add(btnStop);
		
		JButton btnPause = new JButton("");
		btnPause.setBackground(Color.WHITE);
		btnPause.setIcon(new ImageIcon("C:\\Users\\Martin\\Desktop\\Nackademin\\icons\\pausep.jpg"));
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MP3Player(new File("C:\\Users\\Martin\\Desktop\\Nackademin\\Crazy Frog - Axel F.mp3")).pause();
			}
		});
		btnPause.setBounds(163, 104, 97, 25);
		frmMyMusicPlayer.getContentPane().add(btnPause);
		
		JButton btnOpen = new JButton("");
		btnOpen.setBackground(Color.WHITE);
		btnOpen.setIcon(new ImageIcon("C:\\Users\\Martin\\Desktop\\Nackademin\\icons\\openp.jpg"));
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnOpen.setBounds(163, 168, 97, 25);
		frmMyMusicPlayer.getContentPane().add(btnOpen);
		
		JLabel lblNewLabel = new JLabel("Music:");
		lblNewLabel.setBounds(110, 13, 50, 16);
		frmMyMusicPlayer.getContentPane().add(lblNewLabel);
	}
}