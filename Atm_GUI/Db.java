package Atm_GUI;

import java.sql.*;

public class Db {
        //Creating a connection

        String url="jdbc:mysql://localhost:3000/atm";
        String username="puffy";
        String password="puffy";
        public Connection con;

        {
            try {
                con = DriverManager.getConnection(url,username,password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public boolean userPresent(String id){
            try{
                String query="select * from atm.users where userid='"+id+"';";
                Statement stmt= con.createStatement();
                ResultSet set= stmt.executeQuery(query);
                int i=0;
                while (set.next()){
                    i++;
                }
                if(i==1){
                    System.out.println("ID EXIST");
                    return true;
                }else{
                    System.out.println("ID DOES NOT EXIST");

                }
                con.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }

        public Boolean userPresent(String id,String pin){
            try{
                String query="select * from atm.users where userid='"+id+"' and pin='"+pin+"';";
                Statement stmt= con.createStatement();
                ResultSet set= stmt.executeQuery(query);
                int i=0;
                while (set.next()){
                    i++;
                }
                if(i==1){
                    System.out.println("User identified");
                    return true;

                }else{
                    System.out.println("Access denied");

                }
                con.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }

        public String[][] showTransactionHistory(String id)  {
            String query="select transactionDate,transactionType,amount " +
                    "from atm.transactionhistory  where userid = '"+id+"'limit 15;";

//            String query="select transactionDate,transactionType,amount " +
//                    "from atm.transactionhistory  where userid = '"+id+"';";
            String[][] arrayBox= new String[15][3];
            try {
                Statement stmt =con.createStatement();
                ResultSet set =stmt.executeQuery(query);
                int i=0;
                while(set.next()){
                    Timestamp dateAndTime=set.getTimestamp(1);
                    String transactionType=set.getString(2);
                    int amount=set.getInt(3);
                    arrayBox[i][0]=dateAndTime+"";
                    arrayBox[i][1]=transactionType;
                    arrayBox[i][2]=Integer.toString(amount);
                    i=i+1;
//                    System.out.println(arrayBox[i][0]+"----"+arrayBox[i][1]+"----"+arrayBox[i][2]+"----");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
//            for (int i=0;i<arrayBox.length;i++){
//                System.out.println(arrayBox[i][0]+"----"+arrayBox[i][1]+"----"+arrayBox[i][2]+"----");
//            }
            return arrayBox;
        }

        public int userBalance(String id) {
            String query="select totalbalance from atm.users u " +
                    "where userid = '"+id+"';";
            int amount = 0;
            try {
                Statement stmt= con.createStatement();
                ResultSet set= stmt.executeQuery(query);
                while (set.next()){
                    amount=set.getInt(1);
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return amount;
        }

        public void insertIntoAtmTransactionHistory(String id, String transactionType, int i) {
            String query ="insert into atm.transactionhistory values" +
                    "('"+id+"',now(),'"+transactionType+"',"+i+");";
            try {
                Statement stmt= con.createStatement();

                stmt.executeUpdate(query);


//            System.out.println("inserted in transaction history");
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void updateTotalBalance(String id, int i) {
            String query="update atm.users set totalbalance ="+i+" where userid = '"+id+"';";
            try {
                Statement stmt= con.createStatement();

                stmt.executeUpdate(query);
//            System.out.println("total balance of the user has been updated");
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


