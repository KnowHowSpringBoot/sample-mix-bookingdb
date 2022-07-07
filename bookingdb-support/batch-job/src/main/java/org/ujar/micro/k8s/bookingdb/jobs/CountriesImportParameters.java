package org.ujar.micro.k8s.bookingdb.jobs;

import lombok.Builder;

@Builder
public class CountriesImportParameters extends AbstractJobParameters {

  protected JobType type = JobType.IMPORT_COUNTRIES;
}