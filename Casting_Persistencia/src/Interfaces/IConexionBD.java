/*
 * IConexionBD.java
 */
package Interfaces;

import com.mongodb.client.MongoDatabase;

public interface IConexionBD {
    MongoDatabase getInstance();
}
