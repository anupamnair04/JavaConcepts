package seed.jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
/*create or replace function addnumber(p1 number, p2 number) return number
is
psum number;
begin
psum:=p1+p2;
return psum;
end;
/
*/
public class TestCallableFunction {

	public static void main(String[] args) throws Exception {
		
		Connection con = MyConnection.getdbcConnection();
		CallableStatement stmt = con.prepareCall("{ ?= call addnumber(?,?)}");
		
		stmt.setInt(2, 100);
		stmt.setDouble(3, 50);
		stmt.registerOutParameter(1, Types.INTEGER);
		
		stmt.execute();
		
		System.out.println("Sum:"+stmt.getInt(1));

	}
}