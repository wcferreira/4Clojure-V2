(ns playground.product-digits)

(defn prod-dig [num1 num2]
  (loop [coll '() num (* num1 num2) ]
    (if (zero? (quot num 10))
      (conj coll (mod num 10))
      (recur
        (conj coll (mod num 10))
        (quot num 10)))))
