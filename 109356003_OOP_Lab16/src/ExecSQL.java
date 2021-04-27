import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecSQL {

	private static String url;
	private static String username;
	private static String password;

	public static void main(String[] args) throws SQLException {

		String server = "jdbc:mysql://140.119.19.73:9306/";
		String database = "TA";
		String config = "?useUnicode=true&characterEncoding=utf8";
		
		url = server + database + config;
		username = "TA";
		password = "uoclab108";
		Connection conn = null;

		try {
			
			conn = DriverManager.getConnection(url, username, password);
			Statement stat = conn.createStatement();
			
			String query = "SELECT * FROM Sales WHERE Platform = 'Wii'";
			boolean hasResultSet = stat.execute(query);
			
			if (hasResultSet) {
			
				ResultSet result = stat.getResultSet();
				showResultSet(result);
				result.close();
			}
			
		} catch (Exception e) {
			
			e.getMessage();
			
		} finally {
			
			conn.close();
		}
	}


	public static void showResultSet(ResultSet result) throws SQLException {
		
		ResultSetMetaData metaData = result.getMetaData();
		int columnCount = metaData.getColumnCount();

		for (int i = 1; i <= columnCount; i++) {
			if (i > 1)
				System.out.print(", ");
			
			System.out.print(metaData.getColumnLabel(i));
		}
		System.out.println();

		while (result.next()) {
			for (int i = 1; i <= columnCount; i++) {
				if (i > 1)
					System.out.print(", ");
				System.out.print(result.getString(i));
			}
			System.out.println();
		}
	}
}