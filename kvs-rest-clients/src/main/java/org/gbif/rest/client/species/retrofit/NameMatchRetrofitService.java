package org.gbif.rest.client.species.retrofit;

import org.gbif.rest.client.species.NameUsageMatch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * see {@link org.gbif.rest.client.species.NameMatchService}
 */
public interface NameMatchRetrofitService {

  /**
   * See {@link org.gbif.rest.client.species.NameMatchService#match(String, String, String, String, String, String, String, String, boolean, boolean)}
   */
  @GET("/v1/species/match2")
  Call<NameUsageMatch> match(@Query("kingdom") String kingdom, @Query("phylum") String phylum,
                              @Query("class") String clazz, @Query("order") String order, @Query("family") String family,
                              @Query("genus") String genus, @Query("rank") String rank, @Query("name") String name,
                              @Query("verbose") boolean verbose, @Query("strict") boolean strict);
}
