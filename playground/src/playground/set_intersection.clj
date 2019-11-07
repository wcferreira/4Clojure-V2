(ns playground.set-intersection)

(defn foo [s1 s2]
  (reduce (fn [coll elm]
            (if (contains? s2 elm)
              (conj coll elm)
              coll)) #{} (map (fn [x] x) s1)))
