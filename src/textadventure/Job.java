package textadventure;

abstract class Job {
    private String description;
    private String type;

    public Job(String description, String type) {
        this.description = description;
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String getDesc() {
        return this.description;
    }
}
