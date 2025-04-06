package restaurant.com.tn.restaurant.services;

import restaurant.com.tn.restaurant.Models.Client;

import java.util.List;

public interface IClientService {
    List<Client> retrieveAllClient();
    Client addClient(Client e);
    Client updateClient(Client e);
    Client retrieveClient(long idClient);
    void removeClient(long idClient);
    List<Client> addClient (List<Client> Clients);

}
