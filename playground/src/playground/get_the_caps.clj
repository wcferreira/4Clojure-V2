(ns playground.get-the-caps)

(defn get-the-caps [input]
  (apply str (re-seq #"[A-Z]" input)))
