package cuahang;

public abstract class User {
    protected String id;
    protected String pass;
    protected String name;

    User(String tempID, String tempPass,String tempName) {
        id = tempID;
        pass = tempPass;
        name = tempName;
    }

    protected abstract boolean equals(User tempObj);
}
