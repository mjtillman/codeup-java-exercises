package textadventure;

abstract class Species {
   final private String description;
   final private String type;

   public Species(String description, String type) {
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
