package com.example.jwt.service;

import com.example.jwt.repos.PeripheralRepository;
import com.example.jwt.entities.Peripheral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeripheralService {

    @Autowired
    private PeripheralRepository peripheralRepository;

    public Peripheral createPeripheral(Peripheral peripheral) {
        return peripheralRepository.save(peripheral);
    }

    public Peripheral updatePeripheral(Long id, Peripheral peripheral) {
        peripheral.setId(id);
        return peripheralRepository.save(peripheral);
    }

    public void deletePeripheral(Long id) {
        peripheralRepository.deleteById(id);
    }

    public List<Peripheral> getAllPeripherals() {
        return peripheralRepository.findAll();
    }

    public Peripheral getPeripheralById(Long id) {
        return peripheralRepository.findById(id).orElse(null);
    }

    public List<Peripheral> getPeripheralsByUserId(Long userId) {
        return peripheralRepository.findAllByUsers_Id(userId);
    }

}
