(ns playground.get-the-caps)

;; Get the Caps
;; Difficulty:	Easy
;; Topics:	strings

;; Write a function which takes a string and returns a new string
;; containing only the capital letters.

;; (= (__ "HeLlO, WoRlD!") "HLOWRD")
;; (empty? (__ "nothing"))
;; (= (__ "$#A(*&987Zf") "AZ"

(defn get-the-caps [input]
  (apply str (re-seq #"[A-Z]" input)))
