package customermodule;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CustomerGUI extends JFrame {
	private Connection connection;

	private JTextField customerName;
	private JTextField phoneNum;
	private JTextField address;
	private JTextField city;
	private JTextField state;
	private JTextField zip;
	private JTextField email;

	private JButton save;
	private JButton cancel;

	public CustomerGUI(Connection connection) {
		this.connection = connection;
		this.setLayout(new GridLayout(8, 2));
		JLabel customerNameLabel = new JLabel("Customer Name: ");
		JLabel phoneNumLabel = new JLabel("Phone Number: ");
		JLabel addressLabel = new JLabel("Address: ");
		JLabel cityLabel = new JLabel("City: ");
		JLabel stateLabel = new JLabel("State: ");
		JLabel zipLabel = new JLabel("Zip: ");
		JLabel emailLabel = new JLabel("Email Address: ");

		customerName = new JTextField(30);
		phoneNum = new JTextField(10);
		address = new JTextField(30);
		city = new JTextField(15);
		state = new JTextField(2);
		zip = new JTextField(5);
		email = new JTextField(30);

		save = new JButton("Save");
		cancel = new JButton("Cancel");

		this.add(customerNameLabel);
		this.add(customerName);
		this.add(phoneNumLabel);
		this.add(phoneNum);
		this.add(addressLabel);
		this.add(address);
		this.add(cityLabel);
		this.add(city);
		this.add(stateLabel);
		this.add(state);
		this.add(zipLabel);
		this.add(zip);
		this.add(emailLabel);
		this.add(email);

		this.add(save);
		this.add(cancel);

		save.addActionListener(new saveCustomerData());

		this.pack();
		this.setVisible(true);

	}

	private class saveCustomerData implements ActionListener {

		public void actionPerformed(ActionEvent event) {
		
			String query = "INSERT INTO Customers"
					+ "(COMPANYNAME, PHONENUMBER, STREETADDRESS, CITY, STATE, ZIPCODE, EMAILADDRESS) VALUES"
					+ "(?,?,?,?,?,?,?)";
			try {
				PreparedStatement statement = connection.prepareStatement(query);
			
				statement.setString(1, customerName.getText());
				statement.setString(2, phoneNum.getText());
				statement.setString(3, address.getText());
				statement.setString(4, city.getText());
				statement.setString(5, state.getText());
				statement.setInt(6, Integer.parseInt(zip.getText()));
				statement.setString(7, email.getText());
								
				statement.executeUpdate(); // execute insert statement
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// send message if successful
		}

	}

}
