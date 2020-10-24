
public class Conference {
    
    private String name;
    private Session[] sessions;
    
    public Conference(String name, Session[] sessions) {
        this.name = name;
        this.sessions = sessions;
    }
    
    public String getName() {
        return name;
    }
    
    public Session[] getSessions() {
        return sessions;
    }
    
    public int numberOfSessions(char type) {
        int result = 0;
        for (Session session : getSessions()) {
            if (session.getType() == type) {
                result++;
            }
        }
        return result;
    }
    
    public int numberOfPresenters() {
        int result = 0;
        for (Session session : getSessions()) {
            result = result + session.getPresenters().length;
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "Conference: " + getName() + "\n";
        for (Session session : sessions) {
            result = result + "--- " + session.toString() + "\n";
        }
        result += "Numbers of talks: " + numberOfSessions(Session.TALK) + "\n";
        result += "Numbers of workshops: " + numberOfSessions(Session.WORKSHOP) + "\n";
        result += "Numbers of keynotes: " + numberOfSessions(Session.KEYNOTE) + "\n";
        result += "Numbers of panels: " + numberOfSessions(Session.PANEL) + "\n";
        result += "Numbers of presenters: " + numberOfPresenters() + "\n";
        
        return result;
    }
    
    
    
}
