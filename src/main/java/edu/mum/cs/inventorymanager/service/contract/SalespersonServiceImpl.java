package edu.mum.cs.inventorymanager.service.contract;

import edu.mum.cs.inventorymanager.model.Salesman;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalespersonServiceImpl implements SalespersonService {
    @Override
    public Salesman create(Salesman salesman) {
        return null;
    }

    @Override
    public Salesman findById(Long id) {
        return null;
    }

    @Override
    public List<Salesman> findAll() {
        return null;
    }

    @Override
    public void delete(Salesman salesman) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Salesman update(Salesman salesman) {
        return null;
    }
}
