(ns playground.map-construction)

(defn build-map [coll1 coll2]
  (apply assoc {} (interleave coll1 coll2)))