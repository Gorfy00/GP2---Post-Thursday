import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class StudentFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList list;
	private DefaultListModel listModel_1 = new DefaultListModel();
	private static DefaultListModel listModel_2 = new DefaultListModel();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentFrame frame = new StudentFrame();
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
	public StudentFrame() {
		setTitle("Student Directory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[385px,grow][grow]", "[14px][1px][][grow][][][][grow]"));
		
		JLabel lblCourseDirectory = new JLabel("Course Directory");
		lblCourseDirectory.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		contentPane.add(lblCourseDirectory, "cell 0 0,alignx center");
		
		JLabel lblCourses = new JLabel("Course             Discription                                     Time");
		contentPane.add(lblCourses, "cell 0 2");
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "cell 0 3,grow");
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		listModel_1.addElement("CPSC101");
		
		JList list_1 = new JList(listModel_1); 
		panel_1.add(list_1, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Add");
		contentPane.add(btnNewButton, "cell 1 3");
		class AddButtonListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				int ScheduleSize = listModel_2.size();
				if(ScheduleSize <= 5 && 
						listModel_2.contains(list_1.getSelectedValue())== false){
					listModel_2.addElement((String) list_1.getSelectedValue());
				}
			}
		}
		btnNewButton.addActionListener(new AddButtonListener());
		
		
		JLabel lblSchedule = new JLabel("Schedule");
		contentPane.add(lblSchedule, "cell 0 6");
		
//		listModel_2.addElement("E.Bola 4 Jesus");
//		listModel_2.addElement("RealClass420");
		
		JList<String> list_2 = new JList<String>(listModel_2);
		contentPane.add(list_2, "cell 0 7,grow");
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, "cell 1 7,grow");
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btnDelete = new JButton("Delete");
		panel_3.add(btnDelete, BorderLayout.NORTH);
		class DeleteButtonListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				listModel_2.remove(list_2.getSelectedIndex());
			}
		}
		btnDelete.addActionListener(new DeleteButtonListener());
		
		JButton btnPrint = new JButton("Print");
		panel_3.add(btnPrint, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("Clear");
		panel_3.add(btnNewButton_1, BorderLayout.CENTER);
		class ClearButtonListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				listModel_2.clear();
			}
		}
		btnNewButton_1.addActionListener(new ClearButtonListener());
		
		
	}
	public static DefaultListModel getSchedule()
	{
		return listModel_2;
		
	}
}
