package interface_adapter.clear_users;

import java.util.ArrayList;

public class ClearState {

    private ArrayList<String> users = new ArrayList<>();
    private String error = null;


    public ClearState(ClearState copy) {
        users = copy.users;
        error = copy.error;
    }

    public ClearState() {

    }
    public ArrayList<String> getUsers() {
        return
            users;
    }

    public String getError() {return error;}
    public void setUsers(ArrayList<String> users) {
        this.users=users;
    }

    public void setError(String error) {
        this.error=error;
    }


}
