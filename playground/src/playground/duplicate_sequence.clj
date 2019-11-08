(ns playground.duplicate-sequence)

;; Duplicate a Sequence
;; Difficulty:	Easy
;; Topics:	seqs
;;
;; Write a function which duplicates each element of a sequence.

;; (= (__ [1 2 3]) '(1 1 2 2 3 3))
;; (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
;; (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(defn duplicate-sequence [input]
  (reduce (fn [collection element]
            (conj collection element element)) [] input))
