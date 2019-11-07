(ns playground.maximum-value)

(defn max-value [& args]
  (reduce (fn [a b] (if (> a b) a b)) args))
