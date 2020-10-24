public class ConferenceTest {
    
    public static void main (String [] args) {
        
        Session sessions[] = new Session[5];
        sessions[0] = new Session();
        sessions[1] = new Session(Session.TALK, "Talk <Title>", new String[] {"Presenter 1", "Presenter 2"});
        sessions[2] = new Session(Session.WORKSHOP, "Workshop <Title>", new String[] {"Presenter 3", "Presenter 4"});
        sessions[3] = new Session(Session.KEYNOTE, "Keynote <Title>", new String[] {"Presenter 5", "Presenter 6"});
        sessions[4] = new Session(Session.PANEL, "Panel <Title>", new String[] {"Presenter 7", "Presenter 8"});
        
        Conference conference = new Conference("Conference", sessions);
        
        System.out.println(conference.toString());
        
    }
    
}
