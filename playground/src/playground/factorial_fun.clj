(ns playground.factorial-fun)

;; Factorial Fun
;; Difficulty:	Easy
;; Topics:	math
;;
;; Write a function which calculates factorials.

;; (= (__ 1) 1)
;; (= (__ 3) 6)
;; (= (__ 5) 120)
;; (= (__ 8) 40320)

(defn factorial [n]
  (reduce * (range 1 (+ n 1))))
