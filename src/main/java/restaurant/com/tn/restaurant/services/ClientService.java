package restaurant.com.tn.restaurant.services;

import restaurant.com.tn.restaurant.Models.Client;
import restaurant.com.tn.restaurant.repositories.ClientRepository;

import java.util.List;

public class ClientService  implements IClientService{
    ClientRepository clientRepository;

    @Override
    public List<Client> retrieveAllClient() {
       return (List<Client>) clientRepository.findAll() ;
    }

    @Override
    public Client addClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client updateClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client retrieveClient(long idClient) {
        return clientRepository.findById(idClient).get();
    }

    @Override
    public void removeClient(long idClient) {
         clientRepository.deleteById(idClient);
    }

    @Override
    public List<Client> addClient(List<Client> Clients) {
        return (List<Client>) clientRepository.saveAll(clients);
    }
}
