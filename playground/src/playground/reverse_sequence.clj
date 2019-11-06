(ns playground.reverse-sequence)

(defn reverse-seq [collection]
  (reduce (fn [coll elm] (conj coll elm)) '() collection))
