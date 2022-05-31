package edu.smg;

//import java.awt.EventQueue;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.DefaultComboBoxModel;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//import javax.swing.OverlayLayout;
//import javax.swing.SwingConstants;
//import javax.swing.border.EmptyBorder;
//
//import java.sql.*;
//
//
//public class FonotecaFrame extends JFrame {
//
//	private JPanel parentPanel;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FonotecaFrame frame = new FonotecaFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public FonotecaFrame() throws SQLException {
//		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(600, 500);
//		setLocationRelativeTo(null);
//		setResizable(false);
//		
//		JPanel addPerformance = new JPanel();
//		addPerformance.setBorder(new EmptyBorder(5, 5, 5, 5));
//		addPerformance.setLayout(null);
//		
//		parentPanel = new JPanel();
//		parentPanel.setLayout(new OverlayLayout(parentPanel));
//		parentPanel.add(addPerformance);
//		setContentPane(parentPanel);
//		
//		addPerformance.setVisible(false);
//		
//		JLabel lblTitle = new JLabel("Title:");
//		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		lblTitle.setBounds(202, 43, 45, 21);
//		addPerformance.add(lblTitle);
//		
//		JLabel lblGenre = new JLabel("Genre:");
//		lblGenre.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		lblGenre.setBounds(187, 74, 60, 21);
//		addPerformance.add(lblGenre);
//		
//		JTextField tfTitle = new JTextField();
//		tfTitle.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		tfTitle.setBounds(304, 44, 96, 21);
//		addPerformance.add(tfTitle);
//		tfTitle.setColumns(10);
//		
//		JTextField tfGenre = new JTextField();
//		tfGenre.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		tfGenre.setBounds(304, 75, 96, 21);
//		addPerformance.add(tfGenre);
//		tfGenre.setColumns(10);
//		
//		JLabel lblPerformer = new JLabel("Performer:");
//		lblPerformer.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		lblPerformer.setBounds(181, 110, 96, 21);
//		addPerformance.add(lblPerformer);
//		
//		JTextArea taPerformer = new JTextArea();
//		taPerformer.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		taPerformer.setBounds(304, 110, 182, 84);
//		addPerformance.add(taPerformer);
//		
//		JLabel lblDuration = new JLabel("Duration:");
//		lblDuration.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		lblDuration.setBounds(191, 203, 86, 21);
//		addPerformance.add(lblDuration);
//		
//		JTextField tfDuration = new JTextField();
//		tfDuration.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		tfDuration.setBounds(304, 204, 96, 21);
//		addPerformance.add(tfDuration);
//		tfDuration.setColumns(10);
//		
//		JLabel lblMoreInfo = new JLabel("Additional information for performer(optional):");
//		lblMoreInfo.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		lblMoreInfo.setBounds(129, 251, 357, 21);
//		addPerformance.add(lblMoreInfo);
//		
//		JLabel lblBirthYear = new JLabel("Birth year:");
//		lblBirthYear.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		lblBirthYear.setBounds(199, 296, 91, 25);
//		addPerformance.add(lblBirthYear);
//		
//		JTextField tfBirthYear = new JTextField();
//		tfBirthYear.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		tfBirthYear.setBounds(304, 297, 63, 25);
//		addPerformance.add(tfBirthYear);
//		tfBirthYear.setColumns(10);
//		
//		JLabel lblNationality = new JLabel("Nationality:");
//		lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		lblNationality.setBounds(186, 331, 91, 25);
//		addPerformance.add(lblNationality);
//		
//		JTextField tfNationality = new JTextField();
//		tfNationality.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		tfNationality.setBounds(304, 332, 141, 25);
//		addPerformance.add(tfNationality);
//		tfNationality.setColumns(10);
//
//		JLabel lblGender = new JLabel("Gender:");
//		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		lblGender.setBounds(221, 366, 73, 25);
//		addPerformance.add(lblGender);
//		
//		JTextField tfGender = new JTextField();
//		tfGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		tfGender.setBounds(318, 367, 35, 25);
//		addPerformance.add(tfGender);
//		tfGender.setColumns(10);
//		
//		JButton btnDiscard = new JButton("Discard");
//		btnDiscard.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		btnDiscard.setBounds(199, 422, 96, 31);
//		addPerformance.add(btnDiscard);
//		
//		JButton btnSave = new JButton("Save");
//		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		btnSave.setBounds(318, 422, 85, 31);
//		addPerformance.add(btnSave);
//		
//		
//		
//		
//		JPanel menu = new JPanel();
//		menu.setLayout(null);
//		parentPanel.add(menu);
//
//		menu.setVisible(true);
//		
//		JComboBox cbSearchBy = new JComboBox();
//		cbSearchBy.setModel(new DefaultComboBoxModel(new String[] {"Performance", "Genre", "Performer"}));
//		cbSearchBy.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		cbSearchBy.setBounds(100, 40, 120, 25);
//		menu.add(cbSearchBy);
//		
//		JTextField tfKeyword = new JTextField();
//		tfKeyword.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		tfKeyword.setBounds(265, 40, 100, 26);
//		menu.add(tfKeyword);
//		tfKeyword.setColumns(10);
//		
//		JButton btnSearch = new JButton("Search");
//		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		btnSearch.setBounds(410, 40, 90, 25);
//		menu.add(btnSearch);
//		
//		JScrollPane scrollPane_2 = new JScrollPane();
//		scrollPane_2.setBounds(100, 100, 400, 200);
//		menu.add(scrollPane_2);
//		
//		JTextArea taList = new JTextArea();
//		scrollPane_2.setViewportView(taList);
//		taList.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		taList.setEditable(false);
//		
//		
//		JLabel lblPerformanceNumber = new JLabel("Performance\'s number:");
//		lblPerformanceNumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		lblPerformanceNumber.setBounds(120, 350, 175, 21);
//		menu.add(lblPerformanceNumber);
//		
//		JTextField tfNumber = new JTextField();
//		tfNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		tfNumber.setBounds(315, 350, 25, 25);
//		menu.add(tfNumber);
//		tfNumber.setColumns(10);
//		
//		JButton btnOpen = new JButton("Open");
//		btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		btnOpen.setBounds(360, 350, 80, 25);
//		menu.add(btnOpen);
//		
//		JButton btnAddPerformance = new JButton("Add performance");
//		btnAddPerformance.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		btnAddPerformance.setBounds(200, 410, 180, 25);
//		menu.add(btnAddPerformance);
//		
//		
//		
//		
//		JPanel performanceInfo = new JPanel();
//		performanceInfo.setLayout(null);
//		parentPanel.add(performanceInfo);
//		
//		JLabel lblPerformanceName = new JLabel("Title of performance");
//		lblPerformanceName.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		lblPerformanceName.setBounds(0, 10, getWidth(), 25);
//		lblPerformanceName.setHorizontalAlignment(SwingConstants.CENTER);
//		performanceInfo.add(lblPerformanceName);
//		
//		JScrollPane scrollPane_3 = new JScrollPane();
//		scrollPane_3.setBounds(getWidth()/10, getHeight()/8, getWidth()*4/5, getHeight()*3/5);
//		performanceInfo.add(scrollPane_3);
//		
//		JTextArea taPerformanceInfo = new JTextArea();
//		scrollPane_3.setViewportView(taPerformanceInfo);
//		taPerformanceInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		taPerformanceInfo.setLineWrap(true);
//		taPerformanceInfo.setWrapStyleWord(true);
//		taPerformanceInfo.setEditable(false);
//		
//		JButton btnDelete = new JButton("Delete");
//		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		btnDelete.setBounds(160, 400, 90, 25);
//		performanceInfo.add(btnDelete);
//		
//		JButton btnBack = new JButton("Back to menu");
//		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		btnBack.setBounds(290, 400, 140, 25);
//		performanceInfo.add(btnBack);
//		
//		performanceInfo.setVisible(false);
//		
//		btnDiscard.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				tfTitle.setText(null);
//				tfGenre.setText(null);
//				taPerformer.setText(null);
//				tfGender.setText(null);
//				tfNationality.setText(null);
//				tfBirthYear.setText(null);
//				tfDuration.setText(null);
//			}
//		});
//		
//		
//		Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fonoteca", "root", "");
//		Statement myStatement = myConn.createStatement();
//		setPerformanceList(myStatement, taList);
//		
//		
//		btnSave.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				try {
//					if(!myStatement.executeQuery("select * from genre where name = '" + tfGenre.getText() + "';").next()) {
//						myStatement.executeUpdate("insert into genre(genre_id, name)" + 
//								"VALUES(0,'" + tfGenre.getText() + "');");
//					}
//					
//					for (String line : taPerformer.getText().split("\\n")) {
//						if(!myStatement.executeQuery("select * from performer where name = '" + line + "';").next()) {
//							myStatement.executeUpdate("insert into performer(performer_id, name, birth_year, gender, nationality)" + "VALUES(0,'" 
//							+ line + "','"+ tfBirthYear.getText() + "','"+ tfGender.getText() + "','"+ tfNationality.getText() + "');");
//						}
//					}
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				try {
//					myStatement.executeUpdate("insert into performance(performance_id, genre_id, title, duration)" + 
//							"VALUES(0,(select genre_id from genre where name = '" + tfGenre.getText() + "'),'" 
//							+ tfTitle.getText() + "','"+ tfDuration.getText() + "');");
//					for (String line : taPerformer.getText().split("\\n")) {
//						myStatement.executeUpdate("insert into performsin(performance_id, performer_id)" + 
//								"VALUES((select performance_id from performance where title = '" + tfTitle.getText() 
//								+ "'), (select performer_id from performer where name = '" + line + "'));");
//					}
//					
//					setPerformanceList(myStatement, taList);
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				
//				tfTitle.setText(null);
//				tfGenre.setText(null);
//				taPerformer.setText(null);
//				tfGender.setText(null);
//				tfNationality.setText(null);
//				tfBirthYear.setText(null);
//				tfDuration.setText(null);
//				
//				addPerformance.setVisible(false);
//				menu.setVisible(true);
//			}
//		});
//		
//		btnSearch.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String keyword = tfKeyword.getText();
//				int searchN = cbSearchBy.getSelectedIndex();
//				try {
//					if(keyword.isBlank()) {
//						setPerformanceList(myStatement, taList);
//					}
//					else{
//						search(myStatement, keyword, searchN, taList);
//					}
//				} catch (SQLException e1) {
//					e1.printStackTrace();
//				}
//				
//				tfKeyword.setText(null);
//				cbSearchBy.setSelectedIndex(0);
//			}
//		});
//		
//		btnOpen.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					int number = Integer.parseInt(tfNumber.getText());
//					taPerformanceInfo.setText(setPeformanceInfo(myStatement, number, lblPerformanceName));
//				} catch (Exception ex) {
//					taPerformanceInfo.setText("Not a valid performance number!");
//					lblPerformanceName.setText(null);
//				}
//				try {
//					setPerformanceList(myStatement, taList);
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				tfNumber.setText(null);
//				menu.setVisible(false);
//				performanceInfo.setVisible(true);
//			}
//		});
//		
//		btnAddPerformance.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				addPerformance.setVisible(true);
//				menu.setVisible(false);
//			}
//		});
//		
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				performanceInfo.setVisible(false);
//				menu.setVisible(true);
//			}
//		});
//		
//		btnDelete.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String name =  lblPerformanceName.getText();
//				try {
//					myStatement.executeUpdate("delete from performsin where performance_id = "
//							+ "(SELECT performance_id from performance where title = '" + name + "');");
//					myStatement.executeUpdate("delete from performance where title = '" + name + "';");
//					setPerformanceList(myStatement, taList);
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				performanceInfo.setVisible(false);
//				menu.setVisible(true);
//			}
//		});
//	}
//	
//	public void search(Statement myStatement, String keyword, int searchN, JTextArea taList) throws SQLException {
//		String list = "";
//		if(searchN == 0) {
//			ResultSet rs = myStatement.executeQuery("select * from performance where title = '" + keyword +"';");
//			while (rs.next()) {
//				list += rs.getInt("performance_id") + ". " + rs.getString("title") + "\n";
//			}
//		} else if (searchN == 1) {
//			list += "Genre: " + keyword + "\n";
//			ResultSet rs = myStatement.executeQuery("select * from performance, genre "
//					+ "where performance.genre_id = genre.genre_id and name = '" + keyword + "';");
//			while (rs.next()) {
//				list += rs.getInt("performance_id") + ". " + rs.getString("title") + "\n";
//			}
//		} else {
//			list += "Artist: " + keyword + "\n";
//			ResultSet rs = myStatement.executeQuery("select * from performer a "
//					+ "join performsin pl on (a.name = '" + keyword + "' and a.performer_id = pl.performer_id) "
//					+ "join performance p on (p.performance_id = pl.performance_id);");
//			while (rs.next()) {
//				list += rs.getInt("p.performance_id") + ". " + rs.getString("title") + "\n";
//			}
//		}
//		taList.setText(list);
//		if(taList.getText().isEmpty()) {
//			taList.setText("No matches found for " + keyword + ".");
//		}
//	}
//	
//	public void setPerformanceList(Statement myStatement, JTextArea taList) throws SQLException {
//		String list = "";
//		ResultSet myRs = myStatement.executeQuery("select * from performance");
//		while (myRs.next()) {
//			list += myRs.getString("performance_id") + ". " + myRs.getString("title") + "\n";
//		}
//		taList.setText(list);
//	}
//	
//	public String setPeformanceInfo(Statement myStatement, int number, JLabel lblPerformanecName)  throws SQLException{
//		String info = "";
//		ResultSet myRs = myStatement.executeQuery("select * from genre, performance where performance.genre_id = genre.genre_id");
//		
//		while (myRs.next()) {
//			if(number == myRs.getInt("performance_id")) {
//				info += "Genre: " + myRs.getString("name") + "\nDuration: " + myRs.getDouble("duration");
//				
//			lblPerformanecName.setText(myRs.getString("title"));
//			break;
//			}
//		}
//		
//		ResultSet myResultSet = myStatement.executeQuery("select * from performance p "
//		+ "join performsin pl on (p.performance_id = pl.performance_id) "
//		+ "join performer a on (a.performer_id = pl.performer_id);");
//		while (myResultSet.next()) {
//			if(number == myResultSet.getInt("performance_id")) {
//				info += "\n\nArtist: " + myResultSet.getString("name") + "\nGender: " + myResultSet.getString("gender");
//				if(myResultSet.getInt("birth_year") != 0) {
//					info += "\nBirth year: " + myResultSet.getInt("birth_year");
//				}
//				if(myResultSet.getString("nationality") != null) {
//				info +=  "\nNationality: " + myResultSet.getString("nationality");
//				}
//			}
//		}
//		if(info != "") return info;
//		
//		lblPerformanecName.setText(null);
//		return "Not a valid performance number!";
//	}
//
//}

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.OverlayLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.sql.*;


public class FonotecaFrame extends JFrame {

    private JPanel parentPanel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	FonotecaFrame frame = new FonotecaFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public FonotecaFrame() throws SQLException {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel addSONG = new JPanel();
        addSONG.setBorder(new EmptyBorder(5, 5, 5, 5));
        addSONG.setLayout(null);

        parentPanel = new JPanel();
        parentPanel.setLayout(new OverlayLayout(parentPanel));
        parentPanel.add(addSONG);
        setContentPane(parentPanel);

        addSONG.setVisible(false);

        JLabel lblTITLE = new JLabel("Title:");
        lblTITLE.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblTITLE.setBounds(202, 43, 45, 21);
        addSONG.add(lblTITLE);

        JLabel lblGENRE = new JLabel("Genre:");
        lblGENRE.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblGENRE.setBounds(187, 74, 60, 21);
        addSONG.add(lblGENRE);

        JTextField tfTITLE = new JTextField();
        tfTITLE.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tfTITLE.setBounds(304, 44, 96, 21);
        addSONG.add(tfTITLE);
        tfTITLE.setColumns(10);

        JTextField tfGENRE = new JTextField();
        tfGENRE.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tfGENRE.setBounds(304, 75, 96, 21);
        addSONG.add(tfGENRE);
        tfGENRE.setColumns(10);
 
        JLabel lblSINGER = new JLabel("Singer:");
        lblSINGER.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblSINGER.setBounds(181, 110, 96, 21);
        addSONG.add(lblSINGER);

        JTextArea taSINGER = new JTextArea();
        taSINGER.setFont(new Font("Tahoma", Font.PLAIN, 15));
        taSINGER.setBounds(304, 110, 182, 84);
        addSONG.add(taSINGER);

        JLabel lblLENGTH = new JLabel("Length:");
        lblLENGTH.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblLENGTH.setBounds(191, 203, 86, 21);
        addSONG.add(lblLENGTH);

        JTextField tfLENGTH = new JTextField();
        tfLENGTH.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tfLENGTH.setBounds(304, 204, 96, 21);
        addSONG.add(tfLENGTH);
        tfLENGTH.setColumns(10);

        JLabel lblMoreInfo = new JLabel("Additional information for singer(optional):");
        lblMoreInfo.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblMoreInfo.setBounds(129, 251, 357, 21);
        addSONG.add(lblMoreInfo);

        JLabel lblDATE_BIRTH = new JLabel("Birth year:");
        lblDATE_BIRTH.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblDATE_BIRTH.setBounds(199, 296, 91, 25);
        addSONG.add(lblDATE_BIRTH);

        JTextField tfDATE_BIRTH = new JTextField();
        tfDATE_BIRTH.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tfDATE_BIRTH.setBounds(304, 297, 63, 25);
        addSONG.add(tfDATE_BIRTH);
        tfDATE_BIRTH.setColumns(10);

        JLabel lblNATIONALITY  = new JLabel("Nationality:");
        lblNATIONALITY .setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNATIONALITY .setBounds(186, 331, 91, 25);
        addSONG.add(lblNATIONALITY );

        JTextField tfNATIONALITY  = new JTextField();
        tfNATIONALITY .setFont(new Font("Tahoma", Font.PLAIN, 15));
        tfNATIONALITY .setBounds(304, 332, 141, 25);
        addSONG.add(tfNATIONALITY );
        tfNATIONALITY .setColumns(10);

        JLabel lblGENDER = new JLabel("Gender:");
        lblGENDER.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblGENDER.setBounds(221, 366, 73, 25);
        addSONG.add(lblGENDER);

        JTextField tfGENDER = new JTextField();
        tfGENDER.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tfGENDER.setBounds(318, 367, 35, 25);
        addSONG.add(tfGENDER);
        tfGENDER.setColumns(10);

        JButton btnDiscard = new JButton("Discard");
        btnDiscard.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnDiscard.setBounds(199, 422, 96, 31);
        addSONG.add(btnDiscard);

        JButton btnSave = new JButton("Save");
        btnSave.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnSave.setBounds(318, 422, 85, 31);
        addSONG.add(btnSave);




        JPanel menu = new JPanel();
        menu.setLayout(null);
        parentPanel.add(menu);

        menu.setVisible(true);

        JComboBox cbSearchBy = new JComboBox();
        cbSearchBy.setModel(new DefaultComboBoxModel(new String[] {"Song", "Genre", "Singer"}));
        cbSearchBy.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cbSearchBy.setBounds(100, 40, 120, 25);
        menu.add(cbSearchBy);

        JTextField tfKeyword = new JTextField();
        tfKeyword.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tfKeyword.setBounds(265, 40, 100, 26);
        menu.add(tfKeyword);
        tfKeyword.setColumns(10);

        JButton btnSearch = new JButton("Search");
        btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnSearch.setBounds(410, 40, 90, 25);
        menu.add(btnSearch);

        JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane_2.setBounds(100, 100, 400, 200);
        menu.add(scrollPane_2);

        JTextArea taList = new JTextArea();
        scrollPane_2.setViewportView(taList);
        taList.setFont(new Font("Tahoma", Font.PLAIN, 15));
        taList.setEditable(false);


        JLabel lblSONGNumber = new JLabel("Song\'s number:");
        lblSONGNumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblSONGNumber.setBounds(120, 350, 175, 21);
        menu.add(lblSONGNumber);

        JTextField tfNumber = new JTextField();
        tfNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tfNumber.setBounds(315, 350, 25, 25);
        menu.add(tfNumber);
        tfNumber.setColumns(10);

        JButton btnOpen = new JButton("Open");
        btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnOpen.setBounds(360, 350, 80, 25);
        menu.add(btnOpen);

        JButton btnAddSONG = new JButton("Add Song");
        btnAddSONG.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnAddSONG.setBounds(200, 410, 180, 25);
        menu.add(btnAddSONG);




        JPanel SONGInfo = new JPanel();
        SONGInfo.setLayout(null);
        parentPanel.add(SONGInfo);

        JLabel lblSONGName = new JLabel("Title of song");
        lblSONGName.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblSONGName.setBounds(0, 10, getWidth(), 25);
        lblSONGName.setHorizontalAlignment(SwingConstants.CENTER);
        SONGInfo.add(lblSONGName);

        JScrollPane scrollPane_3 = new JScrollPane();
        scrollPane_3.setBounds(getWidth()/10, getHeight()/8, getWidth()*4/5, getHeight()*3/5);
        SONGInfo.add(scrollPane_3);

        JTextArea taSONGInfo = new JTextArea();
        scrollPane_3.setViewportView(taSONGInfo);
        taSONGInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        taSONGInfo.setLineWrap(true);
        taSONGInfo.setWrapStyleWord(true);
        taSONGInfo.setEditable(false);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnDelete.setBounds(160, 400, 90, 25);
        SONGInfo.add(btnDelete);

        JButton btnBack = new JButton("Back to menu");
        btnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnBack.setBounds(290, 400, 140, 25);
        SONGInfo.add(btnBack);

        SONGInfo.setVisible(false);

        btnDiscard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfTITLE.setText(null);
                tfGENRE.setText(null);
                taSINGER.setText(null);
                tfGENDER.setText(null);
                tfNATIONALITY .setText(null);
                tfDATE_BIRTH.setText(null);
                tfLENGTH.setText(null);
            }
        });


        Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fonoteka", "root", "");
        Statement myStatement = myConn.createStatement();
        setSONGList(myStatement, taList);


        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    if(!myStatement.executeQuery("select * from GENRE where NAME = '" + tfGENRE.getText() + "';").next()) {
                        myStatement.executeUpdate("insert into GENRE(GENRE_ID, NAME)" +
                                "VALUES(0,'" + tfGENRE.getText() + "');");
                    }

                    for (String line : taSINGER.getText().split("\\n")) {
                        if(!myStatement.executeQuery("select * from SINGER where NAME = '" + line + "';").next()) {
                            myStatement.executeUpdate("insert into SINGER(SINGER_ID, NAME, DATE_BIRTH, GENDER, NATIONALITY )" + "VALUES(0,'"
                                    + line + "','"+ tfDATE_BIRTH.getText() + "','"+ tfGENDER.getText() + "','"+ tfNATIONALITY .getText() + "');");
                        }
                    }
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                try {
                    myStatement.executeUpdate("insert into SONG(SONG_ID, GENRE_ID, TITLE, LENGTH)" +
                            "VALUES(0,(select GENRE_ID from GENRE where NAME = '" + tfGENRE.getText() + "'),'"
                            + tfTITLE.getText() + "','"+ tfLENGTH.getText() + "');");
                    for (String line : taSINGER.getText().split("\\n")) {
                        myStatement.executeUpdate("insert into PERFORMANCE(SONG_ID, SINGER_ID)" +
                                "VALUES((select SONG_ID from SONG where TITLE = '" + tfTITLE.getText()
                                + "'), (select SINGER_ID from SINGER where NAME = '" + line + "'));");
                    }

                    setSONGList(myStatement, taList);
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

                tfTITLE.setText(null);
                tfGENRE.setText(null);
                taSINGER.setText(null);
                tfGENDER.setText(null);
                tfNATIONALITY .setText(null);
                tfDATE_BIRTH.setText(null);
                tfLENGTH.setText(null);

                addSONG.setVisible(false);
                menu.setVisible(true);
            }
        });

        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String keyword = tfKeyword.getText();
                int searchN = cbSearchBy.getSelectedIndex();
                try {
                    if(keyword.isBlank()) {
                        setSONGList(myStatement, taList);
                    }
                    else{
                        search(myStatement, keyword, searchN, taList);
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

                tfKeyword.setText(null);
                cbSearchBy.setSelectedIndex(0);
            }
        });

        btnOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(tfNumber.getText());
                    taSONGInfo.setText(setPeformanceInfo(myStatement, number, lblSONGName));
                } catch (Exception ex) {
                	ex.printStackTrace();
                    taSONGInfo.setText("Not a valid song number!");
                    lblSONGName.setText(null);
                }
                try {
                    setSONGList(myStatement, taList);
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                tfNumber.setText(null);
                menu.setVisible(false);
                SONGInfo.setVisible(true);
            }
        });

        btnAddSONG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addSONG.setVisible(true);
                menu.setVisible(false);
            }
        });

        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SONGInfo.setVisible(false);
                menu.setVisible(true);
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name =  lblSONGName.getText();
                try {
                    myStatement.executeUpdate("delete from PERFORMANCE where SONG_ID = "
                            + "(SELECT SONG_ID from SONG where TITLE = '" + name + "');");
                    myStatement.executeUpdate("delete from SONG where TITLE = '" + name + "';");
                    setSONGList(myStatement, taList);
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                SONGInfo.setVisible(false);
                menu.setVisible(true);
            }
        });
    }

   // public void search(Statement myStatement, String keyword, int searchN, JTextArea taList) throws SQLException {
//		String list = "";
//		if(searchN == 0) {
//			ResultSet rs = myStatement.executeQuery("select * from performance where title = '" + keyword +"';");
//			while (rs.next()) {
//				list += rs.getInt("performance_id") + ". " + rs.getString("title") + "\n";
//			}
//		} else if (searchN == 1) {
//			list += "Genre: " + keyword + "\n";
//			ResultSet rs = myStatement.executeQuery("select * from performance, genre "
//					+ "where performance.genre_id = genre.genre_id and name = '" + keyword + "';");
//			while (rs.next()) {
//				list += rs.getInt("performance_id") + ". " + rs.getString("title") + "\n";
//			}
//		} else {
//			list += "Artist: " + keyword + "\n";
//			ResultSet rs = myStatement.executeQuery("select * from performer a "
//					+ "join performsin pl on (a.name = '" + keyword + "' and a.performer_id = pl.performer_id) "
//					+ "join performance p on (p.performance_id = pl.performance_id);");
//			while (rs.next()) {
//				list += rs.getInt("p.performance_id") + ". " + rs.getString("title") + "\n";
//			}
//		}
//		taList.setText(list);
//		if(taList.getText().isEmpty()) {
//			taList.setText("No matches found for " + keyword + ".");
//		}
//	}
    
    public void search(Statement myStatement, String keyword, int searchN, JTextArea taList) throws SQLException {
        String list = "";
        if(searchN == 0) {
            ResultSet rs = myStatement.executeQuery("select * from SONG where TITLE = '" + keyword +"';");
            while (rs.next()) {
                list += rs.getInt("SONG_ID") + ". " + rs.getString("TITLE") + "\n";
            }
        } else if (searchN == 1) {
            list += "GENRE: " + keyword + "\n";
            ResultSet rs = myStatement.executeQuery("select * from SONG, GENRE "
                    + "where SONG.GENRE_ID = GENRE.GENRE_ID and NAME = '" + keyword + "';");
            while (rs.next()) {
                list += rs.getInt("SONG_ID") + ". " + rs.getString("TITLE") + "\n";
            }
        } else {
            list += "Artist: " + keyword + "\n";
            ResultSet rs = myStatement.executeQuery("select * from SINGER a "
                    + "join PERFORMANCE pl on (a.NAME = '" + keyword + "' and a.SINGER_ID = pl.SINGER_ID) "
                    + "join SONG p on (p.SONG_ID = pl.SONG_ID);");
            while (rs.next()) {
                list += rs.getInt("p.SONG_ID") + ". " + rs.getString("TITLE") + "\n";
            }
        }
        taList.setText(list);
        if(taList.getText().isEmpty()) {
            taList.setText("No matches found for " + keyword + ".");
        }
    }

    public void setSONGList(Statement myStatement, JTextArea taList) throws SQLException {
        String list = "";
        ResultSet myRs = myStatement.executeQuery("select * from SONG");
        while (myRs.next()) {
            list += myRs.getString("SONG_ID") + ". " + myRs.getString("TITLE") + "\n";
        }
        taList.setText(list);
    }

    public String setPeformanceInfo(Statement myStatement, int number, JLabel lblPerformanceName)  throws SQLException{
        String info = "";
        ResultSet myRs = myStatement.executeQuery("select * from GENRE, SONG where SONG.GENRE_ID = GENRE.GENRE_ID");

        while (myRs.next()) {
            if(number == myRs.getInt("SONG_ID")) {
                info += "GENRE: " + myRs.getString("NAME") + "\nLENGTH: " + myRs.getDouble("LENGTH");

                lblPerformanceName.setText(myRs.getString("TITLE"));
                break;
            }
        }

        ResultSet myResultSet = myStatement.executeQuery("select * from SONG p "
                + "join PERFORMANCE pl on (p.SONG_ID = pl.SONG_ID) "
                + "join SINGER a on (a.SINGER_ID = pl.SINGER_ID);");
        while (myResultSet.next()) {
            if(number == myResultSet.getInt("SONG_ID")) {
                info += "\n\nArtist: " + myResultSet.getString("NAME") + "\nGENDER: " + myResultSet.getString("GENDER");
                if(myResultSet.getInt("DATE_BIRTH") != 0) {
                    info += "\nBirth year: " + myResultSet.getInt("DATE_BIRTH");
                }
                if(myResultSet.getString("NATIONALITY") != null) {
                    info +=  "\nNATIONALITY : " + myResultSet.getString("NATIONALITY");
                }
            }
        }
        if(info != "") return info;

        lblPerformanceName.setText(null);
        return "Not a valid song number!";
    }

}
