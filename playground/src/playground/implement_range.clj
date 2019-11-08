(ns playground.implement_range)

;; Implement range
;; Difficulty:	Easy
;; Topics:	seqs core-functions
;;
;;Write a function which creates a list of all integers in a given range.
;;
;; (= (__ 1 4) '(1 2 3))
;; (= (__ -2 2) '(-2 -1 0 1))
;; (= (__ 5 8) '(5 6 7))

(defn my-range [start end]
  (loop [coll [] cnt start]
    (if (< cnt end)
      (recur
        (conj coll cnt)
        (inc cnt))
      coll)))
