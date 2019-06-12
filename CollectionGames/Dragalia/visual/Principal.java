package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

<<<<<<< HEAD
import logica.ManejadorDeColeccion;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ManejadorDeColeccion Listado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 419);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewTrainables = new JMenu("New Trainables");
		menuBar.add(mnNewTrainables);
		
		JMenuItem mntmAdventurers = new JMenuItem("Adventurers");
		mntmAdventurers.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				CrearPersonajes NuevosPersonajes = new CrearPersonajes();
				NuevosPersonajes.main();
			}
		});
		mnNewTrainables.add(mntmAdventurers);
		
		JMenuItem mntmDragons = new JMenuItem("Dragons");
		mnNewTrainables.add(mntmDragons);
		
		JMenuItem mntmWyrmprint = new JMenuItem("Wyrmprint");
		mnNewTrainables.add(mntmWyrmprint);
		
		JMenuItem mntmWeapons = new JMenuItem("Weapons");
		mnNewTrainables.add(mntmWeapons);
		
		JMenu mnEquipos = new JMenu("Equipos");
		menuBar.add(mnEquipos);
		
		JMenuItem mntmNuevos = new JMenuItem("Nuevos");
		mnEquipos.add(mntmNuevos);
		
		JMenuItem mntmEdiccion = new JMenuItem("Ediccion");
		mnEquipos.add(mntmEdiccion);
		
		JMenuItem mntmVisualizar = new JMenuItem("Visualizar");
		mnEquipos.add(mntmVisualizar);
=======
public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
>>>>>>> branch 'master' of https://github.com/RaysomAO/Collection.git
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
