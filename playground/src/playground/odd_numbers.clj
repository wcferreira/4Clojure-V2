(ns playground.odd-numbers)



(defn odd-numbers [collections]
  (filter odd? collections))






(reduce (fn [el coll]
          (conj coll el)) (range 5))