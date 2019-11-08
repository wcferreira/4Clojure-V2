(ns playground.nth-element)

;; Nth Element
;; Difficulty:	Easy
;; Topics:	seqs core-functions
;;
;; Write a function which returns the Nth element from a sequence.
;; (= (__ '(4 5 6 7) 2) 6)
;; (= (__ [:a :b :c] 0) :a)
;; (= (__ [1 2 3 4] 1) 2)
;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

(defn get-nth-element [collection position]
  (last (take (+ position 1) collection)))
