import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class StaffCourseDescription extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffCourseDescription frame = new StaffCourseDescription();
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
	public StaffCourseDescription() {
		setTitle("Course Title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblCourseName = new JLabel("Course:");
		GridBagConstraints gbc_lblCourseName = new GridBagConstraints();
		gbc_lblCourseName.insets = new Insets(0, 0, 5, 5);
		gbc_lblCourseName.gridx = 1;
		gbc_lblCourseName.gridy = 1;
		contentPane.add(lblCourseName, gbc_lblCourseName);
		
		JLabel lblCpsc = new JLabel("CPSC101");
		GridBagConstraints gbc_lblCpsc = new GridBagConstraints();
		gbc_lblCpsc.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpsc.gridx = 2;
		gbc_lblCpsc.gridy = 1;
		contentPane.add(lblCpsc, gbc_lblCpsc);
		
		JLabel lblDescription = new JLabel("Description:");
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 6;
		gbc_lblDescription.gridy = 1;
		contentPane.add(lblDescription, gbc_lblDescription);
		
		JLabel lblNewLabel = new JLabel("Description here");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 6;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblProfessor = new JLabel("Professor:");
		GridBagConstraints gbc_lblProfessor = new GridBagConstraints();
		gbc_lblProfessor.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfessor.gridx = 1;
		gbc_lblProfessor.gridy = 3;
		contentPane.add(lblProfessor, gbc_lblProfessor);
		
		JLabel lblDrFeelgood = new JLabel("Dr. Feelgood");
		GridBagConstraints gbc_lblDrFeelgood = new GridBagConstraints();
		gbc_lblDrFeelgood.insets = new Insets(0, 0, 5, 5);
		gbc_lblDrFeelgood.gridx = 2;
		gbc_lblDrFeelgood.gridy = 3;
		contentPane.add(lblDrFeelgood, gbc_lblDrFeelgood);
		
		JLabel lblTime = new JLabel("Time:");
		GridBagConstraints gbc_lblTime = new GridBagConstraints();
		gbc_lblTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblTime.gridx = 1;
		gbc_lblTime.gridy = 5;
		contentPane.add(lblTime, gbc_lblTime);
		
		JLabel lblTimeOclock = new JLabel("Time o'clock");
		GridBagConstraints gbc_lblTimeOclock = new GridBagConstraints();
		gbc_lblTimeOclock.insets = new Insets(0, 0, 5, 5);
		gbc_lblTimeOclock.gridx = 2;
		gbc_lblTimeOclock.gridy = 5;
		contentPane.add(lblTimeOclock, gbc_lblTimeOclock);
		
		JButton btnAdd = new JButton("Add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 0, 5);
		gbc_btnAdd.gridx = 7;
		gbc_btnAdd.gridy = 8;
		contentPane.add(btnAdd, gbc_btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		GridBagConstraints gbc_btnEdit = new GridBagConstraints();
		gbc_btnEdit.insets = new Insets(0, 0, 0, 5);
		gbc_btnEdit.gridx = 8;
		gbc_btnEdit.gridy = 8;
		contentPane.add(btnEdit, gbc_btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.gridx = 9;
		gbc_btnDelete.gridy = 8;
		contentPane.add(btnDelete, gbc_btnDelete);
	}

}
