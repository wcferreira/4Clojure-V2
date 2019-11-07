(ns playground.map-default-value)

(defn foo [default collection]
  (zipmap collection (repeat (count collection) default)))


(defn get-last-element [collection]
  (first (reverse collection)))

(defn get-penultimate-element [collection]
  (last (butlast collection)))

(defn get-nth-element [collection position]
  (last (take (+ position 1) collection)))







