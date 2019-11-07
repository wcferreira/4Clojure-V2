(ns playground.duplicate-sequence)

(defn duplicate-sequence [input]
  (reduce (fn [collection element]
            (conj collection element element)) [] input))
