(ns playground.interpose-seq)

(defn foo [n s]
  (butlast (reduce (fn [coll elm] (conj coll elm n)) [] s)))