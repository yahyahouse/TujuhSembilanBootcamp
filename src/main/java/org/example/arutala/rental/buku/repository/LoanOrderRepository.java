package org.example.arutala.rental.buku.repository;

import org.example.arutala.rental.buku.model.LoanBookOrder;

import java.util.ArrayList;
import java.util.List;

public class LoanOrderRepository {
    private final List<LoanBookOrder> listLoanBookOrder = new ArrayList<>();


    public void saveData(LoanBookOrder data) {
        data.calculateLoanFee();
        listLoanBookOrder.add(data);
    }

    public void deleteData(LoanBookOrder data) {
        data.calculateLoanFee();
        listLoanBookOrder.remove(data);
    }

    public List<LoanBookOrder> getAllLoanOrder() {
        return listLoanBookOrder;
    }


}
