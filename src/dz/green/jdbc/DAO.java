// IMPORTANT: Add this class in the new JDBC package "dz.delivery.jdbc "

package dz.green.jdbc;

import java.sql.Connection;
import java.util.List;

public abstract class DAO<T> {
  protected Connection con = null;
   
  public DAO(){
    this.con = con;
  }
   
  public abstract void create(T obj);
  public abstract boolean delete(T obj);
  public abstract boolean update(T obj);
  public abstract T find(int id);

  public abstract List<T> findAll(int id);
}