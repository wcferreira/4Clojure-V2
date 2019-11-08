(ns playground.set-intersection)

;; Set Intersection
;; Difficulty:	Easy
;; Topics:	set-theory
;;
;; Write a function which returns the intersection of two sets.
;; The intersection is the sub-set of items that each set has in common.
;;
;; (= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3})
;; (= (__ #{0 1 2} #{3 4 5}) #{})
;; (= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})

(defn foo [s1 s2]
  (reduce (fn [coll elm]
            (if (contains? s2 elm)
              (conj coll elm)
              coll)) #{} (map (fn [x] x) s1)))
