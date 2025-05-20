package com.daivesh.service;

import com.daivesh.model.Seller;
import com.daivesh.model.SellerReport;
import java.util.List;
import java.util.Optional;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
