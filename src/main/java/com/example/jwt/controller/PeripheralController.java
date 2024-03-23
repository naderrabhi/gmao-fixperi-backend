package com.example.jwt.controller;

import com.example.jwt.entities.Peripheral;
import com.example.jwt.service.PeripheralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/peripherals")
public class PeripheralController {

    @Autowired
    private PeripheralService peripheralService;

    @PostMapping
    public Peripheral createPeripheral(@RequestBody Peripheral peripheral) {
        return peripheralService.createPeripheral(peripheral);
    }

    @PutMapping("/{id}")
    public Peripheral updatePeripheral(@PathVariable Long id, @RequestBody Peripheral peripheral) {
        return peripheralService.updatePeripheral(id, peripheral);
    }

    @DeleteMapping("/{id}")
    public void deletePeripheral(@PathVariable Long id) {
        peripheralService.deletePeripheral(id);
    }

    @GetMapping
    public List<Peripheral> getAllPeripherals() {
        return peripheralService.getAllPeripherals();
    }

    @GetMapping("/{id}")
    public Peripheral getPeripheralById(@PathVariable Long id) {
        return peripheralService.getPeripheralById(id);
    }

    @GetMapping("/byUser/{userId}")
    public List<Peripheral> getPeripheralsByUserId(@PathVariable Long userId) {
        return peripheralService.getPeripheralsByUserId(userId);
    }

}
