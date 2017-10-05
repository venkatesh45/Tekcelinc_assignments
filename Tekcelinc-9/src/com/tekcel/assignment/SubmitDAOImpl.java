package com.tekcel.assignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SubmitDAOImpl implements SubmitDAO {

	Connection conn = DBConnection.getInstance();

	@Override
	public boolean checkAuth(String username, String password) {

		Statement st;
		ResultSet rs = null;
		try {
			st = conn.createStatement();
			String sql = "SELECT * FROM login";

			rs = st.executeQuery(sql);
			while (rs.next()) {
				if(username.equals(rs.getString(1))&&password.equals(rs.getString(2)))
					return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
