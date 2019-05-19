package otmaston;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class _17410082038_odev extends JFrame {

	DefaultComboBoxModel modk = new DefaultComboBoxModel<>();
	DefaultComboBoxModel modm = new DefaultComboBoxModel<>();
	DefaultComboBoxModel mody = new DefaultComboBoxModel<>();
	
	static int r,g,b;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_17410082038_odev frame = new _17410082038_odev();
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
	 
	public _17410082038_odev() {
		for(int i=0 ;i<256; i++) {
			modk.addElement(i);
			mody.addElement(i);
			modm.addElement(i);
			
		};
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cmbk = new JComboBox();
		
		cmbk.setBounds(10, 42, 123, 36);
		contentPane.add(cmbk);
		cmbk.setModel(modk);
		
		
		
		JComboBox cmbm = new JComboBox();
		
		cmbm.setBounds(154, 42, 123, 36);
		contentPane.add(cmbm);
		cmbm.setModel(modm);
		JComboBox cmby = new JComboBox();
		
		cmby.setBounds(301, 42, 123, 36);
		contentPane.add(cmby);
		cmby.setModel(mody);
		
		JLabel lblk = new JLabel("Kirmizi");
		lblk.setBounds(32, 11, 46, 14);
		contentPane.add(lblk);
		
		JLabel lblm = new JLabel("mavi");
		lblm.setBounds(176, 11, 46, 14);
		contentPane.add(lblm);
		
		JLabel lbly = new JLabel("yesil");
		lbly.setBounds(339, 11, 46, 14);
		contentPane.add(lbly);
		
		JLabel lblkt = new JLabel("");
		lblkt.setBounds(10, 83, 123, 36);
		contentPane.add(lblkt);
		lblkt.setOpaque(true);
		
		JLabel labelmt = new JLabel("");
		labelmt.setBounds(154, 83, 123, 36);
		contentPane.add(labelmt);
		
		labelmt.setOpaque(true);
		JLabel labelyt = new JLabel("");
		labelyt.setBounds(301, 83, 123, 36);
		contentPane.add(labelyt);
		
		labelyt.setOpaque(true);
		
		JLabel but = new JLabel("");
		but.setBounds(10, 130, 414, 120);
		contentPane.add(but);
		but.setOpaque(true);
		r=0;
		g=0;
		b=0;
		cmbk.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				r=cmbk.getSelectedIndex();
				lblkt.setBackground(new Color(r,0,0));
				but.setBackground(new Color(r,g,b));
			}
		});
		
		cmbm.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				b=cmbm.getSelectedIndex();
				labelmt.setBackground(new Color(0,0,b));
				but.setBackground(new Color(r,g,b));
			}
		});
		
		cmby.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				g=cmby.getSelectedIndex();
				labelyt.setBackground(new Color(0,g,0));
				but.setBackground(new Color(r,g,b));
			}
		});
		
		
	}
}
