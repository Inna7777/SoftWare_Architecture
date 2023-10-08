package src.lesson12;

import java.util.ArrayList;
import java.util.List;

public class AccessRepo {
    private String accessLine;

    private  String addressDB;

    private List<User> users;
    private List<Token> tokens;

    public AccessRepo(String line, String address){
        this.accessLine =line;
        this.addressDB =address;
        users= new ArrayList<>();
        tokens = new ArrayList<>();

    }

    public String getAccessLine() {
        return accessLine;
    }

    public void setAccessLine(String accessLine) {
        if (accessLine.isEmpty()){
            this.accessLine = accessLine;
        }

    }

    public String getAddressDB() {
        return addressDB;
    }

    public void setAddressDB(String addressDB) {
        this.addressDB = addressDB;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }

    public Token findToken(User user){
        return null;
    }
}
