(ns playground.sum-of-square-of-digits)

;; Sum of square of digits
;; Difficulty:  Easy
;; Topics: math
;;
;; Write a function which takes a collection of integers as an argument.
;; Return the count of how many elements are smaller than the sum of their
;; squared component digits. For example: 10 is larger than 1 squared plus 0 squared
;; whereas 15 is smaller than 1 squared plus 5 squared.

;; (= 8  (__ (range 10)))
;; (= 19 (__ (range 30)))
;; (= 50 (__ (range 100)))
;; (= 50 (__ (range 1000)))

;; Hints
;0 - 0
;1 - 1
;2 - 4
;3 - 9
;4 - 16
;5 - 25
;6 - 36
;7 - 49
;8 - 64
;9 - 81

;0  - 0
;1  - 1
;2  - 4
;3  - 9
;4  - 16
;5  - 25
;6  - 36
;7  - 49
;8  - 64
;9  - 81
;10 - 1
;11 - 2
;12 - 5
;13 - 10
;14 - 17
;15 - 26
;16 - 37
;17 - 50
;18 - 65
;19 - 82
;20 - 4
;21 - 5
;22 - 8
;23 - 13
;24 - 20
;25 - 29
;26 - 40
;27 - 53
;28 - 68
;29 - 85