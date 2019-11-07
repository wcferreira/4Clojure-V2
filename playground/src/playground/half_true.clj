(ns playground.half-true)

(defn half-true? [& input]
  (true? (and (some true? input) (not (every? true? input)))))