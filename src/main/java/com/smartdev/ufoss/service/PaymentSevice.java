package com.smartdev.ufoss.service;

import com.smartdev.ufoss.dto.PaymentDTO;
import com.smartdev.ufoss.dto.PaymentGetDTO;
import com.smartdev.ufoss.entity.PaymentEntity;

import java.util.List;
import java.util.UUID;

public interface PaymentSevice {
    List<PaymentGetDTO> getAllPayments ();
    PaymentGetDTO getPaymentById(UUID id);
    List<PaymentGetDTO> getPaymentByUsernameID(UUID id);
    List<PaymentGetDTO> addNewPayment(PaymentDTO newPayment);

    boolean isPaid(UUID userId, UUID courseId);
}
