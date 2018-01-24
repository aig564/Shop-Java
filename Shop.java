//Name: Alfonzo Galvan
//UIN: 622004824
import java.util.LinkedList;
import java.util.List;
import java.util.Collection;
import java.util.NoSuchElementException;


public class Shop<T> {

   public Collection<T> stock;

   public Shop(Collection<T> shp) { 
      stock = shp; 
    }
   void sell(T item) {
        stock.add(item);
   }

   public T buy(T c) {
        boolean rem = stock.remove(c);
        if (rem) { return c;}
        else throw new NoSuchElementException();
   }

   public void sell(Collection<? extends T> c) {
        for (T e : c) {
              stock.add(e);
            } 
  }

   void buy(int n, Collection<? super T> c) {
        LinkedList<T> bought = new LinkedList<T>();
        int counter=0;
      for (T e : stock) {
        if (counter<n) {
          c.add(e);
          bought.add(e);
          counter++;
        }
      }
      for (T e: bought) {
        stock.remove(e);
      }
   }
}