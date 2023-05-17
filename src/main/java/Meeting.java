public class Meeting extends Task {
    String topic;
    String project;
    String start;

    public Meeting (int id, String topic, String project, String start) {
        super(id);
        this.topic = topic;
        this. project = project;
        this. start = start;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }

    public String getTopic() {
        return topic;
    }
    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}
