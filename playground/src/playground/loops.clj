(ns playground.loops)

(defn my-count [collection]
  (loop [cnt 0 coll collection]
    (if-not (empty? coll)
      (recur
        (inc cnt)
        (rest coll))
      cnt)))

(defn my-2nd-count [collection]
  (reduce + (map (fn [_] 1) collection)))

(defn sum-it-all [collection]
  (reduce + collection))