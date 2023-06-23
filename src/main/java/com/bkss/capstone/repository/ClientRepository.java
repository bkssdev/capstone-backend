package com.bkss.capstone.repository;

import com.bkss.capstone.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
