package com.IPProject.data;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.IPProject.model.User;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class UserDAOImpl implements UserDAO {

	@Override
	public void addUser(User user) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			
			con = ConnectionFactory.getCon();
			ps = con.prepareStatement("insert user_details (email_id,password,first_name,last_name,address) values(?,?,?,?,?)");
			ps.setString(1, user.getEmailId());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getAddress());
					
			ps.executeUpdate();
			
		}
		finally {
			close(null, ps, con);
		}
		
	}

	@Override
	public void addOtherDetails(User user) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			
			con = ConnectionFactory.getCon();
			ps = con.prepareStatement("update user_details set father_name=?,sex=?,adults_no=?,children_no=?,infants_no=?,phone=?,dob=? where email_id=?");
			ps.setString(1, user.getFatherName());
			ps.setString(2, user.getSex());
			ps.setInt(3, user.getAdultNo());
			ps.setInt(4, user.getChildrenNo());
			ps.setInt(5, user.getInfantsNo());
			ps.setString(6, user.getPhone());
			ps.setTimestamp(7, new java.sql.Timestamp(user.getDateOfBirth().getTime()));
			ps.setString(8, user.getEmailId());
			
			ps.executeUpdate();	
			
		}
		finally {
			close(null, ps, con);
		}
		
	}

	@Override
	public User getUser(String emailId) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user=null;

		try {
			con = ConnectionFactory.getCon();
			ps = con.prepareStatement("select * from user_details where email_id = ?");
			ps.setString(1, emailId);
			rs=ps.executeQuery();		
			if(rs.next())  {
					String password = rs.getString("password");
					String firstName = rs.getString("first_name");
					String lastName = rs.getString("last_name");
					String address = rs.getString("address");
					String fatherName = rs.getString("father_name");
					String sex = rs.getString("sex");
					int adultNo = rs.getInt("adults_no");
					int childrenNo = rs.getInt("children_no");
					int infantsNo = rs.getInt("infants_no");
					String phone = rs.getString("phone");
					Date dateOfBirth = rs.getDate("dob");	
					user = new User(emailId, password, firstName, lastName, address, fatherName, sex, adultNo, childrenNo, infantsNo, phone, dateOfBirth);
				}
		}
		finally {
			close(rs, ps, con);
		}
		System.out.println("getuser");
		System.out.println(user);
		return user;
	}
	
	@Override
	public User getUserss(String emailId) throws Exception {
		Connection con=null;
	    PreparedStatement ps=null;
	    ResultSet rs=null;
	    User user=null;
	    try {
	    	con = ConnectionFactory.getCon();
	    	ps=con.prepareStatement("select * from user_details where email_id = ?");
	    	ps.setString(1,emailId);
	       rs=ps.executeQuery();
	       if(rs.next()) {
				String fatherName = rs.getString("father_name");
				String sex = rs.getString("sex");
				int adultNo = rs.getInt("adults_no");
				int childrenNo = rs.getInt("children_no");
				int infantsNo = rs.getInt("infants_no");
				String phone = rs.getString("phone");
				Date dateOfBirth = rs.getDate("dob");	
				user = new User(emailId, fatherName, sex, adultNo, childrenNo, infantsNo, phone, dateOfBirth);
	       
	       
	       }
	       else {
	    	   throw new Exception("Could not find Email: " + emailId);
	       }
	    }
	    finally
	    {
	    	close(null,ps,con);
	    }
	    System.out.println("getusersss");
	    System.out.println(user);
	    return user ;
		
	}
	
	
	
	private void close(ResultSet rs, PreparedStatement ps, Connection con) {
		try {
			if(rs != null) {
				rs.close();
			}
			if( ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<User> getUsers() throws Exception {
		
		List<User> userList=new ArrayList<>();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			con=ConnectionFactory.getCon();
			ps=con.prepareStatement("select * from user_details order by first_name");
			rs=ps.executeQuery();
			
			while(rs.next()) {
				String emailId=rs.getString(1);
				String password=rs.getString(2);
				String firstName=rs.getString(3);
				String lastName=rs.getString(4);
				String address=rs.getString(5);
				String fatherName=rs.getString(6);
				String sex=rs.getString(7);
				int adultNo=rs.getInt(8);
				int childrenNo=rs.getInt(9);
				int infantsNo=rs.getInt(10);
				String phone=rs.getString(11);
				Date dateOfBirth=rs.getDate(12);
				
				User user=new User(emailId, password, firstName, lastName, address, fatherName, sex, adultNo, childrenNo, infantsNo, phone, dateOfBirth);
				userList.add(user);
			}
		}
		finally {
			close(rs,ps,con);
		}
		System.out.println("list user chl ra item dao");
		System.out.println(userList);
		return userList;
	}

}