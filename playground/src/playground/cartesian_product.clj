(ns playground.cartesian-product)

(defn get-cartesian-product [coll1 coll2]
  (into #{}
        (for [x coll1 y coll2]
          [x y])))
