import java.util.HashSet;
import java.util.Set;

enum Permission {
    READ, WRITE, DELETE, EXECUTE
}

class User {
    private String name;
    private Set<Permission> permissions;

    public User(String name) {
        this.name = name;
        this.permissions = new HashSet<>();
    }

    public void addPermission(Permission permission) {
        permissions.add(permission);
    }

    public void removePermission(Permission permission) {
        permissions.remove(permission);
    }

    public boolean hasPermission(Permission permission) {
        return permissions.contains(permission);
    }

    public String getName() {
        return name;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }
}

class PermissionManager {
    private Set<User> users;

    public PermissionManager() {
        this.users = new HashSet<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public boolean checkPermission(User user, Permission permission) {
        return user.hasPermission(permission);
    }

    public void grantPermission(User user, Permission permission) {
        user.addPermission(permission);
    }

    public void revokePermission(User user, Permission permission) {
        user.removePermission(permission);
    }

    public Set<User> getUsers() {
        return users;
    }
}

public class PermissionManagerApp {
    public static void main(String[] args) {
        PermissionManager pm = new PermissionManager();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        pm.addUser(user1);
        pm.addUser(user2);

        pm.grantPermission(user1, Permission.READ);
        pm.grantPermission(user1, Permission.WRITE);
        pm.grantPermission(user2, Permission.READ);

        System.out.println("Alice has READ permission: " + pm.checkPermission(user1, Permission.READ));
        System.out.println("Alice has DELETE permission: " + pm.checkPermission(user1, Permission.DELETE));
        System.out.println("Bob has WRITE permission: " + pm.checkPermission(user2, Permission.WRITE));
    }
}