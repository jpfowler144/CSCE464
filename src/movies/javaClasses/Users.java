package movies.javaClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Users {
	private String login;
	private String password;
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean setToProperties() {
		Properties prop = new Properties();
		OutputStream output = null;
		
		try {
			output = new FileOutputStream("users.properties");
			prop.setProperty(this.login,this.login);
			prop.setProperty(this.login + "password",this.password);
			return true;
		}
		
		catch(IOException io) {
			io.printStackTrace();
			return false;
		}
		
		finally {
			if(output != null) {
				try {
					output.close();
				}
				
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public Boolean checkExistence() {
		Properties prop = new Properties();
		InputStream input = null;
		Users user = new Users();
		
		
		try {
			File usersFile = new File("users.properties");
			usersFile.createNewFile();
			input = new FileInputStream("users.properties");
			
			if(user.login.equals(prop.getProperty(this.login))) {
				return true;
			}
			
			else {
				return false;
			}
		}
		
		catch(IOException io) {
			io.printStackTrace();
			return false;
		}
		
		finally {
			if(input != null) {
				try {
					input.close();
				}
				
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
