package org.gbif.kvs;

import java.io.Closeable;

/**
 * Store of V data indexed by a key (byte[]).
 *
 * @param <K> type of key elements
 * @param <V> type of elements stored
 */
public interface KeyValueStore<K, V> extends Closeable {

  /**
   * Obtains the associated data/payload to the key parameter, as byte[].
   *
   * @param key identifier of element to be retrieved
   * @return the element associated with key, null otherwise
   */
  V get(K key);

}
