package taxation;

import java.util.ArrayList;
import java.util.List;

public class TaxPreparers {
  public static void prepareTaxes(Taxable t) {}

  public static void prepareBulkTaxes(Taxable[] lt) {
    // ARRAYS know their base type at runtime, therefore this...
//    lt[0] = new Corporation(); // might fail at runtime
    // but does not corrupt things...

    for (Taxable t : lt) {}
  }

  public static void prepareBulkTaxes(List<? extends Taxable> lt) {
//  public static <E extends Taxable> void prepareBulkTaxes(List<E> lt) {
//  public static void prepareBulkTaxes(List<Taxable> lt) {
//    lt.add(new Taxable());
//    lt.add(new Corporation());
//    lt.add(new Individual());
    for (int i = 0; i < lt.size(); i++) {
//      E e = lt.get(i);
//      Taxable t = e;
      prepareTaxes(lt.get(i));
    }
  }

  // super means is assignable FROM ...
  public static void collectIndividualClients(List<? super Individual> li) {
//  public static void collectIndividualClients(List<Individual extends E> li) {
//  public static void collectIndividualClients(List<E ??? Individual> li) {
    Individual i = new Individual();
    li.add(i); // effectively assigning i to the actual parameter of add()
    // actual parameter is of type ?... we need Individual to be
    // assignment compatible to ?
    li.add(new Individual());
//    Individual ind = li.get(0); // NOPE
//    Taxable ind = li.get(0); // NOPE
  }

  public static void main(String[] args) {
    List<Taxable> clients = new ArrayList<>();
    clients.add(new Corporation());
    clients.add(new Individual());

    collectIndividualClients(clients);

    prepareBulkTaxes(clients);

    // we buy "Joe's personal tax preparers"
    List<Individual> joesClients = new ArrayList<>();
    joesClients.add(new Individual());
    joesClients.add(new Individual());

    // Liskov substitution says "if a IS-A b, then a must 'substitute'
    // for b in all situations without surprises".
    // Java compiler insists on Liskov substituability syntactically
    prepareBulkTaxes(joesClients);

    Individual[] joesClientArray = null;
    prepareBulkTaxes(joesClientArray);

    List<Object> lo = null;
    collectIndividualClients(lo);
  }
}
