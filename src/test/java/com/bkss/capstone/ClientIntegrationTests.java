package com.bkss.capstone;

import com.bkss.capstone.controller.ClientsController;
import com.bkss.capstone.domain.Client;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.net.URISyntaxException;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ClientIntegrationTests {
    @Autowired
    ClientsController clientsController;
    @Test
    public void testCreateClient() throws URISyntaxException {
        Client client = new Client("Ola", "ola@gmail.com");
        ResponseEntity<Client> clientResult = clientsController.createClient(client);
        Assertions.assertThat(clientResult.getStatusCode()).isEqualTo(HttpStatusCode.valueOf(201));
        List<Client> clientList = clientsController.getClients();
        Assertions.assertThat(clientList.size()).isEqualTo(12);
    }
    @Test
    public void testListClients() {
        List<Client> clientList = clientsController.getClients();
        Assertions.assertThat(clientList.size()).isEqualTo(11);
    }

    @Test
    public void testUpdateClient() {
        Client client = new Client("Ola Tom", "ola@gmail.com");
        ResponseEntity<Client> clientResult = clientsController.updateClient(1L,client);
        Assertions.assertThat(clientResult.getStatusCode()).isEqualTo(HttpStatusCode.valueOf(200));

        List<Client> clientList = clientsController.getClients();
        Assertions.assertThat(clientList.get(10).getName()).isEqualTo("Ola Tom");
        Assertions.assertThat(clientList.get(10).getEmail()).isEqualTo("ola@gmail.com");
    }

    @Test
    public void testGetSpecificClient() {
        Client client = new Client("Ola Tom", "ola@gmail.com");
        ResponseEntity<Client> clientResult = clientsController.updateClient(1L,client);
        Assertions.assertThat(clientResult.getStatusCode()).isEqualTo(HttpStatusCode.valueOf(200));

        Client myClient = clientsController.getClient(11L);
        Assertions.assertThat(myClient.getName()).isEqualTo("Ola Tom");
        Assertions.assertThat(myClient.getEmail()).isEqualTo("ola@gmail.com");    }

    @Test
    public void testDeleteClient() {
        ResponseEntity<Client> clientResult = clientsController.deleteClient(1L);
        Assertions.assertThat(clientResult.getStatusCode()).isEqualTo(HttpStatusCode.valueOf(200));

        List<Client> clientList = clientsController.getClients();
        Assertions.assertThat(clientList.size()).isEqualTo(11);
    }

}
