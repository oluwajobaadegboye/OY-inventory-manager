package edu.mum.cs.inventorymanager.service;

import edu.mum.cs.inventorymanager.model.entity.Salesperson;
import edu.mum.cs.inventorymanager.repository.ISalespersonRepository;
import edu.mum.cs.inventorymanager.service.contract.SalespersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalespersonServiceImpl implements SalespersonService {
    ISalespersonRepository repository;
    @Override
    public Salesperson create(Salesperson salesperson) {
        return repository.save(salesperson);
    }

    @Override
    public Salesperson findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Salesperson> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Salesperson salesperson) {
        salesperson.setStatus("Deleted");
        repository.save(salesperson);
    }

    @Override
    public void deleteById(long id) {
        throw new UnsupportedOperationException("We decidded not to provide this functionality for Entity");
    }

    @Override
    public Salesperson update(Salesperson salesperson) {
        return repository.save(salesperson);
    }
}
