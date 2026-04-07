import java.util.*;

// Abstract Class (Abstraction)
abstract class User {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    public abstract void displayRole(); // Polymorphism
}

// Voter Class (Inheritance)
class Voter extends User {
    private boolean hasVoted;

    public Voter(String id, String name) {
        super(id, name);
        this.hasVoted = false;
    }

    public void vote(Candidate candidate) {
        if (!hasVoted) {
            candidate.incrementVotes();
            hasVoted = true;
            System.out.println(getName() + " voted successfully!");
        } else {
            System.out.println("You have already voted!");
        }
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Voter");
    }
}

// Admin Class
class Admin extends User {
    public Admin(String id, String name) {
        super(id, name);
    }

    public void addCandidate(Election election, Candidate candidate) {
        election.addCandidate(candidate);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Admin");
    }
}

// Candidate Class
class Candidate {
    private String name;
    private int votes;

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;
    }

    public String getName() { return name; }
    public int getVotes() { return votes; }

    public void incrementVotes() {
        votes++;
    }
}

// Election Class
class Election {
    private ArrayList<Candidate> candidates;

    public Election() {
        candidates = new ArrayList<>();
    }

    public void addCandidate(Candidate c) {
        candidates.add(c);
    }

    public void displayCandidates() {
        System.out.println("\nCandidates List:");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println((i + 1) + ". " + candidates.get(i).getName());
        }
    }

    public Candidate getCandidate(int index) {
        if (index >= 0 && index < candidates.size()) {
            return candidates.get(index);
        }
        return null;
    }

    public void showResults() {
        System.out.println("\n--- Election Results ---");
        for (Candidate c : candidates) {
            System.out.println(c.getName() + " : " + c.getVotes() + " votes");
        }
    }
}

// Main Class
public class OnlineVotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Election election = new Election();
        Admin admin = new Admin("A1", "Admin");

        // Add Candidates
        admin.addCandidate(election, new Candidate("Alice"));
        admin.addCandidate(election, new Candidate("Bob"));

        // Create Voter
        Voter voter = new Voter("V1", "John");

        System.out.println("===== Online Voting System =====");

        // Display Candidates
        election.displayCandidates();

        // Input
        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        Candidate selected = election.getCandidate(choice - 1);

        // Validation
        if (selected != null) {
            voter.vote(selected);
        } else {
            System.out.println("Invalid choice!");
        }

        // Extra Feature: Show Results
        election.showResults();

        sc.close();
    }
}