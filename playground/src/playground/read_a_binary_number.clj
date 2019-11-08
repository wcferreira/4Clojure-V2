(ns playground.read-a-binary-number)

;; Read a binary number
;; Difficulty:	Easy
;; Topics:
;;
;; Convert a binary number, provided in the form of a string, to its numerical value.
;;
;; (= 0     (__ "0"))
;; (= 7     (__ "111"))
;; (= 8     (__ "1000"))
;; (= 9     (__ "1001"))
;; (= 255   (__ "11111111"))
;; (= 1365  (__ "10101010101"))
;; (= 65535 (__ "1111111111111111"))

(defn convert [str-binary]
  (loop [value []
         binary-seq (reverse (map #(- % 48) (map int (seq str-binary))))
         cnt 0]
    (if (empty? binary-seq)
      (reduce + value)
      (recur
        (conj value (* (bigint (Math/pow 2 cnt)) (first binary-seq)))
        (rest binary-seq)
        (inc cnt)))))