(ns playground.palindrome-detector)

(defn palindrome? [input]
   (= (seq input) (reverse input)))
