package org.ujar.bs.dst.k8s.bookingdb.importer.service;

import org.springframework.stereotype.Service;

@Service
public interface HotelImporterService {

  void importHotels(Long cityId);
}