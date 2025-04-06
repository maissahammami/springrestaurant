package restaurant.com.tn.restaurant.repositories;

import restaurant.com.tn.restaurant.Models.Client;

public interface ClientRepository {
    ClientRepository findAll();

    Client save(Client e);

    Client findById(long idClient);

    void deleteById(long idClient);
}
