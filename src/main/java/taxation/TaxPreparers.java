package taxation;

import java.util.ArrayList;
import java.util.List;

public class TaxPreparers {
  public static void prepareTaxes(Taxable t) {}

  public static void prepareBulkTaxes(List<Taxable> lt) {
    for (int i = 0; i < lt.size(); i++) {
      Taxable t = lt.get(i);
      prepareTaxes(t);
    }
  }

  public static void main(String[] args) {
    List<Taxable> clients = new ArrayList<>();
    clients.add(new Corporation());
    clients.add(new Individual());

    prepareBulkTaxes(clients);

    // we buy "Joe's personal tax preparers"
    List<Individual> joesClients = new ArrayList<>();
    joesClients.add(new Individual());
    joesClients.add(new Individual());

    // Liskov substitution says "if a IS-A b, then a must 'substitute'
    // for b in all situations without surprises".
    // Java compiler insists on Liskov substituability syntactically
    prepareBulkTaxes(joesClients);
  }
}
