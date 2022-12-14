/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.util.Role;
import java.util.ArrayList;

/**
 *
 * @author viral
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, String role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        Role.getInstance().addNewUserRole(username, role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void updatePassword(String username, String newPassword){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
            {
                ua.setPassword(newPassword);
            }
        }
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
