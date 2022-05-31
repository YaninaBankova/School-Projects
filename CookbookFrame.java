package edu.smg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.OverlayLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;


public class CookbookFrame extends JFrame {

	
	private JPanel parentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CookbookFrame frame = new CookbookFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	
	
	public CookbookFrame() throws SQLException {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JPanel addRecipe = new JPanel();
		addRecipe.setBorder(new EmptyBorder(5, 5, 5, 5));
		addRecipe.setLayout(null);
		
		parentPanel = new JPanel();
		parentPanel.setLayout(new OverlayLayout(parentPanel));
		parentPanel.add(addRecipe);
		setContentPane(parentPanel);
		
		addRecipe.setVisible(false);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTitle.setBounds(186, 43, 45, 21);
		addRecipe.add(lblTitle);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTime.setBounds(186, 74, 45, 21);
		addRecipe.add(lblTime);
		
		JTextField tfTitle = new JTextField();
		tfTitle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTitle.setBounds(304, 44, 96, 21);
		addRecipe.add(tfTitle);
		tfTitle.setColumns(10);
		
		JTextField tfTime = new JTextField();
		tfTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTime.setBounds(304, 75, 96, 21);
		addRecipe.add(tfTime);
		tfTime.setColumns(10);
		
		JLabel lblDifficulty = new JLabel("Difficulty:");
		lblDifficulty.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDifficulty.setBounds(168, 105, 78, 21);
		addRecipe.add(lblDifficulty);
		
		
		JComboBox cbDifficulty = new JComboBox();
		cbDifficulty.setModel(new DefaultComboBoxModel(new String[] {"Easy", "Moderate", "Challenging", "Professional"}));
		cbDifficulty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbDifficulty.setBounds(299, 106, 114, 25);
		addRecipe.add(cbDifficulty);
		
		JComboBox cbRegion = new JComboBox();
		cbRegion.setModel(new DefaultComboBoxModel(new String[] {"Bulgaria", "France", "Italy", "Germany", "China", 
				"Korea", "Japan", "UK", "USA", "Mexico", "Africa", "Europe", "Asia", "Oceania"}));
		cbRegion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbRegion.setBounds(299, 137, 114, 25);
		addRecipe.add(cbRegion);
		
		JLabel lblRegion = new JLabel("Region:");
		lblRegion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRegion.setBounds(178, 136, 63, 21);
		addRecipe.add(lblRegion);
		
		JLabel lblCategory = new JLabel("Category:");
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCategory.setBounds(168, 169, 78, 21);
		addRecipe.add(lblCategory);
		
		JComboBox cbCategory = new JComboBox();
		cbCategory.setModel(new DefaultComboBoxModel(new String[] {"Apetizer", "Salad", "Main course", "Dessert"}));
		cbCategory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbCategory.setBounds(299, 168, 114, 25);
		addRecipe.add(cbCategory);
		
		JLabel lblIngredients = new JLabel("Ingredients:");
		lblIngredients.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblIngredients.setBounds(74, 209, 91, 25);
		addRecipe.add(lblIngredients);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(186, 210, 358, 86);
		addRecipe.add(scrollPane);
		
		JTextArea taIngredients = new JTextArea();
		scrollPane.setViewportView(taIngredients);
		taIngredients.setFont(new Font("Tahoma", Font.PLAIN, 15));
		taIngredients.setLineWrap(true);
		taIngredients.setWrapStyleWord(true);
		
		JLabel lblInstructions = new JLabel("Instructions:");
		lblInstructions.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInstructions.setBounds(74, 305, 96, 25);
		addRecipe.add(lblInstructions);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(186, 306, 358, 88);
		addRecipe.add(scrollPane_1);
		
		JTextArea taInstructions = new JTextArea();
		scrollPane_1.setViewportView(taInstructions);
		taInstructions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		taInstructions.setLineWrap(true);
		taInstructions.setWrapStyleWord(true);
		
		JButton btnDiscard = new JButton("Discard");
		btnDiscard.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDiscard.setBounds(199, 422, 96, 31);
		addRecipe.add(btnDiscard);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSave.setBounds(318, 422, 85, 31);
		addRecipe.add(btnSave);
		
		
		
		
		JPanel menu = new JPanel();
		menu.setLayout(null);
		parentPanel.add(menu);

		menu.setVisible(true);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(getWidth()/10, getHeight()/10, getWidth()*4/5, getHeight()*3/5);
		menu.add(scrollPane_2);
		JTextArea taRecipesList = new JTextArea();
		scrollPane_2.setViewportView(taRecipesList);
		taRecipesList.setFont(new Font("Tahoma", Font.PLAIN, 15));
		taRecipesList.setEditable(false);
		
		JLabel lblRcipeNumber = new JLabel("Recipe\'s number:");
		lblRcipeNumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRcipeNumber.setBounds(getWidth()/4, getHeight()*3/4, getWidth()/4, 25);
		menu.add(lblRcipeNumber);
		
		JTextField tfNumber = new JTextField();
		tfNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNumber.setBounds(getWidth()/2, getHeight()*3/4, 25, 25);
		menu.add(tfNumber);
		tfNumber.setColumns(10);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnOpen.setBounds(getWidth()*3/5, getHeight()*3/4, 80, 25);
		menu.add(btnOpen);
		
		JButton btnAddRecipe = new JButton("Add recipe");
		btnAddRecipe.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddRecipe.setBounds(getWidth()*2/5, getHeight()*5/6, getWidth()/5, 25);
		menu.add(btnAddRecipe);
		
		
		
		
		JPanel recipeInfo = new JPanel();
		recipeInfo.setLayout(null);
		parentPanel.add(recipeInfo);
		
		JLabel lblRecipeName = new JLabel();
		lblRecipeName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRecipeName.setBounds(0, 10, getWidth(), 25);
		lblRecipeName.setHorizontalAlignment(SwingConstants.CENTER);
		recipeInfo.add(lblRecipeName);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(getWidth()/10, getHeight()/8, getWidth()*4/5, getHeight()*3/5);
		recipeInfo.add(scrollPane_3);
		
		JTextArea taRecipeInfo = new JTextArea();
		scrollPane_3.setViewportView(taRecipeInfo);
		taRecipeInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		taRecipeInfo.setLineWrap(true);
		taRecipeInfo.setWrapStyleWord(true);
		taRecipeInfo.setEditable(false);
		
		JButton btnBack = new JButton("Back to menu");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBack.setBounds(getWidth()*3/8, getHeight()*4/5, getWidth()/4, 25);
		recipeInfo.add(btnBack);
		
		recipeInfo.setVisible(false);
		
		btnDiscard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfTitle.setText(null);
				tfTime.setText(null);
				cbDifficulty.setSelectedIndex(0);
				cbCategory.setSelectedIndex(0);
				cbRegion.setSelectedIndex(0);
				taIngredients.setText(null);
				taInstructions.setText(null);
			}
		});
		
		
		
		Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proekt_cookbook", "root", "");
		Statement myStatement = myConn.createStatement();
		setRecipesList(myStatement, taRecipesList);
		
		
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					myStatement.executeUpdate("insert into recipe(id, title, difficulty_id, ingredients, time, instructions, category_id, region_id)" + 
					"VALUES(" + 0 + ",'" + tfTitle.getText() + "','" + (cbDifficulty.getSelectedIndex()+1) + "','"+ taIngredients.getText() 
					+ "','" + tfTime.getText() + "','" + taInstructions.getText() + "','" + (cbCategory.getSelectedIndex()+1) + "','" 
					+ (cbRegion.getSelectedIndex()+1) + "')");
					
					setRecipesList(myStatement, taRecipesList);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tfTitle.setText(null);
				tfTime.setText(null);
				cbDifficulty.setSelectedIndex(0);
				cbCategory.setSelectedIndex(0);
				cbRegion.setSelectedIndex(0);
				taIngredients.setText(null);
				taInstructions.setText(null);
				addRecipe.setVisible(false);
				menu.setVisible(true);
			}
		});
		
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int number = Integer.parseInt(tfNumber.getText());
					taRecipeInfo.setText(setRecipeInfo(myStatement, number, lblRecipeName));
				} catch (Exception ex) {
					taRecipeInfo.setText("Not a valid recipe number!");
					lblRecipeName.setText(null);
				}
				tfNumber.setText(null);
				menu.setVisible(false);
				recipeInfo.setVisible(true);
			}
		});
		
		btnAddRecipe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRecipeName.setText(null);
				addRecipe.setVisible(true);
				menu.setVisible(false);
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recipeInfo.setVisible(false);
				menu.setVisible(true);
			}
		});
	}
	
	public void setRecipesList(Statement myStatement, JTextArea taRecipesList) throws SQLException {
		String list = "";
		ResultSet myRs = myStatement.executeQuery("select * from recipe");
		while (myRs.next()) {
			list += myRs.getString("id") + ". " + myRs.getString("title") + "\n";
		}
		taRecipesList.setText(list);
	}
	
	public String setRecipeInfo(Statement myStatement, int number, JLabel lblRecipeName)  throws SQLException{
		String info = "";
		ResultSet myRs = myStatement.executeQuery("select * from recipe, category, difficulty, region "
				+ "where category_id = category.id and difficulty_id = difficulty.id and region.id = region_id");
		while (myRs.next()) {
			if(number == myRs.getInt("recipe.id")) {
				info += "Time: " + myRs.getString("time") + "\nCategory:" + myRs.getString("category.name") + "\nDifficulty:" 
			+ myRs.getString("level") + "\nRegion:" + myRs.getString("region.name") + "\n\nIngredients:\n" 
			+ myRs.getString("ingredients") + "\n\nInstructions:\n" + myRs.getString("instructions");
				
			lblRecipeName.setText(myRs.getString("title"));
			return info;
			}
		}
		lblRecipeName.setText(null);
		return "Not a valid recipe number!";
		
	}
}
