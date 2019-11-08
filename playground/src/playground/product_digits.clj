(ns playground.product-digits)

;; Product Digits
;; Difficulty:	Easy
;; Topics:	math seqs
;;
;; Write a function which multiplies two numbers and returns the result as a sequence of its digits.
;;
;; (= (__ 1 1) [1])
;; (= (__ 99 9) [8 9 1])
;; (= (__ 999 99) [9 8 9 0 1])

(defn prod-dig [num1 num2]
  (loop [coll '() num (* num1 num2) ]
    (if (zero? (quot num 10))
      (conj coll (mod num 10))
      (recur
        (conj coll (mod num 10))
        (quot num 10)))))
