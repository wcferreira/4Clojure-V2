(ns playground.my-atoms)

(def my-1st-atom (atom 0))
(println "Value:" @my-1st-atom)
(swap! my-1st-atom inc)
(println "Value:" @my-1st-atom)
(swap! my-1st-atom + 11)
(println "Value:" @my-1st-atom)
(reset! my-1st-atom 0)
(println "Value:" @my-1st-atom)

(defn change-atom!
  ([]
   (println "Arity 0")
   (change-atom! 3))
  ([max-val]
   (println "Arity 1")
   (dotimes [n max-val] (swap! my-1st-atom + n))))

(def my-2nd-atom (atom #{}))
(println "2nd. Atom value:" @my-2nd-atom)
(swap! my-2nd-atom conj :a)
(println "2nd. Atom value:" @my-2nd-atom)
(swap! my-2nd-atom conj :b)
(swap! my-2nd-atom conj :c)
(println "2nd. Atom value:" @my-2nd-atom)
(swap! my-2nd-atom disj :a)
(println "2nd. Atom value:" @my-2nd-atom)
(reset! my-2nd-atom #{})
(println "2nd. Atom value:" @my-2nd-atom)

(def my-3rd-atom (atom {:make "Audi" :model "Q3"}))
(println "3rd. Atom value:" @my-3rd-atom)
(swap! my-3rd-atom assoc :make "Hyundai" :model "HB20 RSpec")
(println "3rd. Atom value:" @my-3rd-atom)

