package org.ujar.micro.k8s.bookingdb.importer.service;

import org.springframework.stereotype.Service;

@Service
public interface CountryImporterService {

  void importCountries();
}