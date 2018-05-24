package com.piggymetrics.notification.repository;

import com.piggymetrics.notification.domain.Recipient;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class RecipientRepositoryImpl implements RecipientRepository {
    public RecipientRepositoryImpl() {
        System.out.println("HHHHHHHHHHHHHHHH");
    }
    @Override
    public Recipient findByAccountName(String name) {
        return new Recipient();
    }

    @Override
    public List<Recipient> findReadyForBackup() {
        return Arrays.asList(new Recipient(), new Recipient());
    }

    @Override
    public List<Recipient> findReadyForRemind() {
        return Arrays.asList(new Recipient(), new Recipient(), new Recipient(), new Recipient());
    }

    @Override
    public void save(Recipient recipient) {
        System.out.println("SAVE " + recipient);
    }
}
