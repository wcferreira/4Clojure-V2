(ns playground.factorial-fun)

(defn factorial [n]
  (reduce * (range 1 (+ n 1))))
