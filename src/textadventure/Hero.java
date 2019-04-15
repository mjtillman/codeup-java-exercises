package textadventure;

public class Hero {
    private String name;
    private Species species;
    private Job job;


    public Hero(String name, char species, char job) {
        this.name = name;

        switch (species) {
            case 'H':
                this.species = new Human();
                break;
            case 'E':
                this.species = new Elf();
                break;
            case 'L':
                this.species = new Halfling();
        }

        switch (job) {
            case 'R':
                this.job = new Ranger();
                break;
            case 'F':
                this.job = new Fighter();
                break;
            case 'S':
                this.job = new Sorcerer();
                break;
        }
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species.getType();
    }

    public String getJob() {
        return job.getType();
    }

    public String getSpecDesc() {
        return species.getDesc();
    }

    public String getJobDesc() {
        return job.getDesc();
    }
}
