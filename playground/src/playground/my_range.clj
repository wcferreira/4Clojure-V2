(ns playground.my-range)

(defn my-range [start end]
  (loop [coll [] cnt start]
    (if (< cnt end)
      (recur
        (conj coll cnt)
        (inc cnt))
      coll)))
