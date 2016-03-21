import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;

public class AddCourseViewer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCourseViewer frame = new AddCourseViewer();
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
	public AddCourseViewer() {
		setTitle("Class Name");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[1px][364px]", "[1px][14px][14px][14px][126px][23px]"));
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, "cell 0 0,alignx left,aligny top");
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = new JLabel("Title");
		contentPane.add(lblTitle, "cell 1 1,alignx center,aligny center");
		
		JEditorPane dtrpnComputerScience = new JEditorPane();
		contentPane.add(dtrpnComputerScience, "cell 1 2,alignx center,aligny center");
		dtrpnComputerScience.setForeground(Color.LIGHT_GRAY);
		dtrpnComputerScience.setText("CPSC");
		
		JLabel lblDescription = new JLabel("Description");
		contentPane.add(lblDescription, "cell 1 3,alignx center,aligny center");
		
		JEditorPane editorPane = new JEditorPane();
		contentPane.add(editorPane, "cell 1 4,grow");
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 1 5,growx,aligny top");
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{167, 89, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewButton = new JButton("Submit");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 0;
		panel.add(btnNewButton, gbc_btnNewButton);
	}

}
