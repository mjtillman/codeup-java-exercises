package Arthropods;

public class Arthropod {
  private String exoskeleton;
  private String segmentedBody;
  private String pairedJointedAppendages;

  public void moult() {
    System.out.print("Moulting exoskeleton...");
  }

}

class Arachnid extends Arthropod {
  public void makeWeb() {
    System.out.println("Weaving a web...");
  }

}

class Centipede extends Arthropod {
  public void creepy() {
    System.out.println("Being creepy...");
  }

}

class marineCrustacean extends Arthropod {
  public void cook() {
    System.out.println("Becoming delicious food...");
  }

}

class Insect extends Arthropod {
  public void nuisance() {
    System.out.println("Pestering humans...");
  }

}