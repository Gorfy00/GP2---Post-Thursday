import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;

public class DepartmentView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepartmentView frame = new DepartmentView();
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
	public DepartmentView() {
		setTitle("College of Computer Science");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblProfessorKitler = new JLabel("Computer Science");
		lblProfessorKitler.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		panel.add(lblProfessorKitler);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6, BorderLayout.NORTH);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{128, 66, 55, 35, 27, 35, 44, 0};
		gbl_panel_6.rowHeights = new int[]{15, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JLabel lblNewLabel_2 = new JLabel("Course Name  and Number\r\n\r\n");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		panel_6.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Discription");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		panel_6.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblTime = new GridBagConstraints();
		gbc_lblTime.insets = new Insets(0, 0, 0, 5);
		gbc_lblTime.gridx = 4;
		gbc_lblTime.gridy = 0;
		panel_6.add(lblTime, gbc_lblTime);
		
		JLabel lblMaxStu = new JLabel("Max Stu");
		lblMaxStu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMaxStu = new GridBagConstraints();
		gbc_lblMaxStu.gridx = 6;
		gbc_lblMaxStu.gridy = 0;
		panel_6.add(lblMaxStu, gbc_lblMaxStu);
		
		JList list = new JList();
		panel_5.add(list, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_5.add(panel_3, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{51, 63, 116, 55, 51, 0};
		gbl_panel_3.rowHeights = new int[]{23, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JButton btnAdd = new JButton("Add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnAdd.insets = new Insets(0, 0, 0, 5);
		gbc_btnAdd.gridx = 1;
		gbc_btnAdd.gridy = 0;
		panel_3.add(btnAdd, gbc_btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnDelete.insets = new Insets(0, 0, 0, 5);
		gbc_btnDelete.gridx = 2;
		gbc_btnDelete.gridy = 0;
		panel_3.add(btnDelete, gbc_btnDelete);
		
		JButton btnView = new JButton("View");
		GridBagConstraints gbc_btnView = new GridBagConstraints();
		gbc_btnView.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnView.insets = new Insets(0, 0, 0, 5);
		gbc_btnView.gridx = 3;
		gbc_btnView.gridy = 0;
		panel_3.add(btnView, gbc_btnView);
		
		JButton btnEdi = new JButton("Edit");
		GridBagConstraints gbc_btnEdi = new GridBagConstraints();
		gbc_btnEdi.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnEdi.gridx = 4;
		gbc_btnEdi.gridy = 0;
		panel_3.add(btnEdi, gbc_btnEdi);
	}

}
